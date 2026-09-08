package com.demo;

public class Data {
	
	private String token;

	public Data(String token) {
		super();
		this.token = token;
	}
	
	public Data() {
		
	}

	@Override
	public String toString() {
		return "Data [token=" + token + "]";
	}

	public String getToken() {
		return token;
	}
	
	

}
