package com.demo;

public class LoginPayload {

	private String username;
	private String password;
	
	
	public LoginPayload(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	@Override
	public String toString() {
		return "LoginPayload [username=" + username + ", password=" + password + "]";
	}
	
	

}
