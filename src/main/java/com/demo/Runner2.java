package com.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

/* This class acts as a class which will run the show*/

public class Runner2 {

	public static void main(String[] args) throws JsonProcessingException {
		
		User user = new User("Vihaan",2);
	    System.out.println(user);
	     
	    //Serialization with Jackson library
	    
	    ObjectMapper mapper = new ObjectMapper();
	    
	    //The below throws an exception so accept it
	    String data = mapper.writeValueAsString(user);
	    System.out.println(data);
	    
	    //Print using Pretty Data
	   String prettyData =  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
	   System.out.println(prettyData);
	    
	     
	     //Deserialization using the Jackson Library
	   
	   String jsonData = "{\"name\":\"Vihaan\",\"age\":2}";
	   
	   User user2 = mapper.readValue(jsonData,User.class);
	   
	   System.out.println(user2);
		

	}

}
