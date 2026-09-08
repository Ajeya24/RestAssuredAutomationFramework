package com.demo;

import static io.restassured.RestAssured.*;

import com.google.gson.Gson;

import io.restassured.response.Response;

public class LoginAPITest {

	public static void main(String[] args) {
		
		
		LoginPayload loginPayload = new LoginPayload("iamfd","password");
		//RestAssured Class is a Utility Class which has all its variables and methods declared as static 
		//Hence we can directly access Rest Assured class methods without creating an object of the class
		
		LoginResponse loginResponse = given().baseUri("http://64.227.160.186:9000/v1/").and()
		.header("content-type","application/json").and()
		.body(convertToJSON(loginPayload)).when()
		.post("login")
		.as(LoginResponse.class);
		
		System.out.println(loginResponse);
				
		
		//Want to fetch the message from response
		System.out.println(loginResponse.getMessage());
		
		//Want to fetch the token fetched in response
		
		System.out.println(loginResponse.getData().getToken());

	}
	
	public static String convertToJSON(Object src)
	{
		Gson gson = new Gson();
		String jsonData =gson.toJson(src);
		return jsonData;
		
	}

}
