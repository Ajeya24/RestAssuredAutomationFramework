package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;

import io.restassured.response.Response;

public class ForgotPasswordTest {
	
	@Test(description="Verify if Forgot Password API is working")
	
	public void ForgotPassword() {
		
		AuthService authService = new AuthService();
		Response response = authService.forgotPassword("ajay12345@gmail.com");
		System.out.println(response.asPrettyString());
		
	}

}
