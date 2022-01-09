package com.noorteck.qa.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class SignUpTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_up";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		ObjInitialize.initializeClassObj();

		SignUpTest testObj = new SignUpTest();

		signUpTestOne();
		verifyDisplayPage();
		CommonUI.quitBrowser();
	}

	public static void signUpTestOne() {

		signUpObj.enterEmailAddress("Bbubuna@gmail.com");
		signUpObj.enterPassword("ZSBKvinm8");
		signUpObj.clickSignUp();
		signUpObj.displayHomepageWelCome();

	}

	public static void verifyDisplayPage() {
		String actualResult = signUpObj.displayHomepageWelCome();
		SoftAssert softAssert = new SoftAssert();

		String expectedResult = "Welcome to Address Book";
		softAssert.assertEquals(actualResult, expectedResult," actualResult and expectedResult are not equal , therefore test case failed ");
		softAssert.assertAll();
	}

	// open browser
}
