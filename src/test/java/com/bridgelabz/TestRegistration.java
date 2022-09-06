package com.bridgelabz;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestRegistration {

	Registration registration =new Registration (); 
	
	

	 @Test
	    public void firstNameShouldStartWithCapital(){
	        boolean result = registration.validateFirstName("^[A-Z][a-zA-Z]{3}[a-z]{2,}$", "shri");
	        Assert.assertTrue(result);
	    }
	
	 @Test
	    public void lasttNameShouldStartWithCapital(){
	        boolean result = registration.validateFirstName( "^[a-z][a-zA-Z]{2,}[A-Z]{3}$ ", "shrihshAIL");
	        Assert.assertTrue(result);
	    }
	
	
	  @Test
	    public void givenPasswordValidFormat(){
	      

	        boolean result = registration.validatePassword("^([a-z]{3}[-.])([a-z]+)*@([a-z]{2}[-.])([a-z]{2}[-.])([a-z]+)*$","abc.xzy@bl.co.in");
	        Assert.assertTrue(result);
	    
     }
	  
	  @Test
	    public void givenMobileNumberValidFormat(){
	        boolean result = registration.validateMobileNo( "^([0-9]{2}[- ])[0-9]{10}$","91 7353241737");
	        Assert.assertTrue(result);

	    }
	  
}
