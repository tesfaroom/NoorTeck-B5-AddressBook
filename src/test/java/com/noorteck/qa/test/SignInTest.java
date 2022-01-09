package com.noorteck.qa.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class SignInTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_in";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();

		SignInTest signIntestObj = new SignInTest();
		signIntestObj.signInTestThree();

		CommonUI.quitBrowser();

	}

	
	public void signInTestThree() {
		signInObj.enterEmail("Bbubuna@gmail.com");
		signInObj.enterPassword("ZSBKvinm8");
		signInObj.clickSignIn();

	}

	

}
