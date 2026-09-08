package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.Request.LoginRequest;
import com.api.models.Request.ProfileRequest;
import com.api.models.Response.LoginResponse;
import com.api.models.Response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileTest {
	
	@Test(description="Verify if Update profile for User Management API is working")
			
		public void UpdateProfile() {
		
		//Login into the application using correct credentials
		AuthService authService = new AuthService();
		Response response = authService.login(new LoginRequest("uday1234","uday1234"));
		LoginResponse loginResponse = response.as(LoginResponse.class);
		System.out.println(response.asPrettyString());
		
		//Fetch the token
		UserProfileManagementService userProfileManagementService = new UserProfileManagementService();
		response = userProfileManagementService.getProfile(loginResponse.getToken());
		UserProfileResponse userProfileResponse = response.as(UserProfileResponse.class);
		Assert.assertEquals(userProfileResponse.getUsername(),"uday1234");
		
		//Update the resource fields
		ProfileRequest profileRequest = new ProfileRequest.Builder().
				                        firstName("Disha").
				                        lastName("Devaiyya").
				                        email("disha@123456@gmail.com").
				                        mobileNumber("9856774423").
				                        build();
		
		response = userProfileManagementService.updateProfile(loginResponse.getToken(), profileRequest);
		System.out.println(response.asPrettyString());
	}

}
