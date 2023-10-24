package com.ssafy.user.model.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ssafy.user.model.UserDto;
import com.ssafy.user.model.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserDAO userDao;
	
	public UserServiceImpl(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean login(UserDto userDto) throws Exception {
		return userDao.login(userDto);
	}

}
