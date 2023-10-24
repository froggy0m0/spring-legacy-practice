package com.ssafy.user.model;

public class UserDto {
	private String userId;
	private String userPassword;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userPassword=" + userPassword + "]";
	}
}
