package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;
import com.api.models.Response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileRequestTest {
	
	@Test(description="Verify if Get Profile API is working")
	
	public void GetProfileRequest() {
	
	//To generate token we first need to login into the application
	AuthService authService = new AuthService();                         
	Response response = authService.login(new LoginRequest("ajay1234","ajay1234"));
	LoginResponse loginResponse = response.as(LoginResponse.class);
    System.out.println(loginResponse.getToken());
    
    //Fetch the user details
    UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
    response =userProfileManagementService.getProfile(loginResponse.getToken());
    UserProfileResponse userProfileResponse  =response.as(UserProfileResponse.class);
    System.out.println(userProfileResponse.getUsername());
	}

}
