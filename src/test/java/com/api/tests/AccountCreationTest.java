package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.Request.SignUpRequest;

import io.restassured.response.Response;

public class AccountCreationTest {
	
	@Test(description="Verify if SignUp API is working")
	
	public void AccountCreationTest1() {
		
		//Using Builder
		SignUpRequest signUpRequest = new SignUpRequest.Builder().userName("ajay234").password("ajay12345").
				                      firstName("ajay").lastName("kulkarni").
				                      mobileNumber("9887654320").build();
		AuthService authService = new AuthService();
		Response response = authService.signup(signUpRequest);
		
		System.out.println(response.asPrettyString());
		
	}

}
