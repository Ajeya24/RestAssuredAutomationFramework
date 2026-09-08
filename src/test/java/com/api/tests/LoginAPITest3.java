package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.Request.LoginRequest;
import com.api.models.Response.LoginResponse;

import static io.restassured.RestAssured.*;
import  io.restassured.response.Response;
import  io.restassured.specification.RequestSpecification;

@Listeners(com.api.listeners.TestListener.class)
public class LoginAPITest3 {
	
	
	@Test(description="Verify if Login API is working")
	
	public void loginTest()
	{
	  
	  LoginRequest loginRequest = new LoginRequest("ajay1234","ajay1234");
      AuthService authService = new AuthService();
      Response response =authService.login(loginRequest);
      System.out.println(response.asPrettyString());
      
      // To deserilaize the response
      LoginResponse loginResponse = response.as(LoginResponse.class);
      System.out.println(loginResponse.getToken());
      System.out.println(loginResponse.getId());
      
      Assert.assertTrue(loginResponse.getToken()!=null);
      Assert.assertEquals(loginResponse.getEmail(), "ajay@gmail.com");
      
      
    
}
	
}


