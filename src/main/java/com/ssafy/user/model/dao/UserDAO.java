package com.ssafy.user.model.dao;

import java.sql.SQLException;

import com.ssafy.user.model.UserDto;

public interface UserDAO {

	boolean login(UserDto userDto) throws SQLException;

}
