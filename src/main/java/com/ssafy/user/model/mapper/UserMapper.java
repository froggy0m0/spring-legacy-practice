package com.ssafy.user.model.mapper;

import java.sql.SQLException;

import com.ssafy.user.model.UserDto;

public interface UserMapper {

	UserDto login(UserDto userDto) throws SQLException;

}
