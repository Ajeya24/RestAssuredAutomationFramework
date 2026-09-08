package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginAPITest {
	
	
	@Test(description="Verify if Login API is working")
	
	public void loginTest()
	{
	    
		RestAssured.baseURI = "http://64.227.160.186:8080";
		RequestSpecification ReqSpec =  RestAssured.given();
		RequestSpecification ReqSpec1 = ReqSpec.header("Content-Type","application/json");
		RequestSpecification ReqSpec2 = ReqSpec1.body("{\"username\": \"uday1234\",\"password\": \"uday1234\"}");
		Response Resp = ReqSpec2.post("/api/auth/login");
		System.out.println(Resp.asPrettyString());
		Assert.assertEquals(Resp.statusCode(), 401);

}
	
}


