package com.noorteck.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.pages.AddressPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

/**
 * In this class we declare our objects that will be shared among different classes
 * @author NoorTeck
 *
 */
public class Constants  {
	
	
	public static WebDriver driver;
	
	//declare class objects and common objects
		public static SignUpPage signUpObj;
		public static  SignInPage signInObj;
		public static AddressPage addressPage;
		public static HomePage homeObj;
		
		
		
		
		
		
}
