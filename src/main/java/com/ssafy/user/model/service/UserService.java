package com.ssafy.user.model.service;

import com.ssafy.user.model.UserDto;

public interface UserService {

	boolean login(UserDto userDto) throws Exception;

}
