package com.api.base;



import static io.restassured.RestAssured.*;

import java.util.List;

import com.api.models.Request.LoginRequest;
import com.api.filters.LoggingFilter;
import io.restassured.RestAssured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/** This class is responsible for handling the Base URI,Creating a Request
 * and handling a response.This is a wrapper class for RestAssured**/

//This is a wrapper class over Rest Assured 
public class BaseService {

	//Since Base url is constant that why we write it in capital letters
	private static final  String Base_URL = "http://64.227.160.186:8080";
	
	private RequestSpecification requestSpecification;
	
	//To execute only once we use static block
	static
	{
		RestAssured.filters(new LoggingFilter());
	}
	
	public BaseService(){
		
		requestSpecification = given().baseUri(Base_URL);
		
		
	}
	
	protected void setAuthToken(String token) {
		requestSpecification.header("Authorization", "Bearer "+ token);
	}
	
	
	protected Response postRequest(Object payload,String endpoint) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	protected Response getRequest(String endpoint) {
		return requestSpecification.get(endpoint);
	}	
	
	protected Response putRequest(Object payload,String endpoint) {	
		return requestSpecification.contentType(ContentType.JSON).body(payload).put(endpoint);
	}
		
	
	
}
