package com.demo;

public class LoginResponse {
	private String message;
	private Data data;
	
	
	public LoginResponse(String message, Data data) {
		super();
		this.message = message;
		this.data = data;
	}
	
	public LoginResponse() {
		
	}


	@Override
	public String toString() {
		return "LoginResponse [message=" + message + ", data=" + data + "]";
	}


	public String getMessage() {
		return message;
	}


	public Data getData() {
		return data;
	}
	
	
	
	
	

}
