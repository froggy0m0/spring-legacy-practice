package com.ssafy.user.model.service;

import com.ssafy.user.model.UserDto;

public interface UserService {

	UserDto login(UserDto userDto) throws Exception;

}
