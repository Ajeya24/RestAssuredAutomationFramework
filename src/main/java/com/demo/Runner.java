package com.demo;

import com.google.gson.Gson;

/* This class acts as a class which will run the show*/

public class Runner {

	public static void main(String[] args) {
		
		User user = new User("Vihaan",2);
	    System.out.println(user);
	     
	     //Perform Serialisation where we convert a java object into a JSON Object(Payload)
	    
	    Gson gson = new Gson();
	    String data = gson.toJson(user);
	    System.out.println(data);
	    
	    
	    //Perform deserialisation where we convert a JSON object(payload) to a java object
	    
	    String jsonData = "{\"name\":\"Vihaan\",\"age\":2}";
	    
	    //Create a java object from Json object and store it in a variable
	    User user1 = gson.fromJson(jsonData, User.class);
	    System.out.println(user1);
	     
	     
		

	}

}
