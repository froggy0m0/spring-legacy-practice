package com.ssafy.user.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.ssafy.user.model.UserDto;

@Repository
public class UserDAOImpl implements UserDAO {

	private final DataSource ds;
	
	public UserDAOImpl(DataSource ds) {
		this.ds = ds;
	}


	@Override
	public boolean login(UserDto userDto) throws SQLException {
		UserDto returnUserInfo = new UserDto();
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(""
						+ " select user_id, user_password "
						+ " from user "
						+ " where user_id = ? and user_password = ?");
			){
			int idx = 1;
			pstmt.setString(idx++, userDto.getUserId());
			pstmt.setString(idx++, userDto.getUserPassword());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				returnUserInfo.setUserId(rs.getString("user_id"));
				returnUserInfo.setUserPassword(rs.getString("user_password"));
			}
		}
		if((userDto.getUserId().equals(returnUserInfo.getUserId())) && 
				(userDto.getUserPassword().equals(returnUserInfo.getUserPassword()))) return true;
		else return false;
	}

}
