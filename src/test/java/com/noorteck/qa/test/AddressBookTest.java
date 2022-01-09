package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://a.testaddressbook.com/sign_in";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();

		AddressbooktestTwo();
		verifyInput();

		CommonUI.quitBrowser();

	}

	public static void AddressbooktestTwo() {

		signInObj.enterEmail("Bbubuna@gmail.com");
		signInObj.enterPassword("ZSBKvinm8");
		signInObj.clickSignIn();

		addressPage.clickHomeaddressButton();
		addressPage.clickNewAddressButton();
		addressPage.enterFirstname("John");

		addressPage.enterLastname("Cena");
		addressPage.enteraddressOne("777 international dr");
		addressPage.enterAddresstwo("444 boston bvl");
		addressPage.enterCity("Ann Arbor");
		addressPage.selectState("text", "Michigan");
		addressPage.enterZipCode("48198");
		addressPage.clickCountryRadio(); 
		addressPage.enterAge("22");
		addressPage.enterWebsite("http://a.testaddressbook.com/addresses/new");
		addressPage.enterPhonerNumber("123-2334-3434");
		// addressPage.chooseFilePicture();
		addressPage.clickCommoninterest();
		addressPage.enterNote("Automation is Fun");
		addressPage.clickcreateAddress();
		addressPage.clickHomeDisplayregister();
		addressPage.clickListButton();
		addressPage.displayAddressSummaryTable();
		
		
	}
	public static void verifyInput() {
		SoftAssert softAssert = new SoftAssert();

		String actualResult1 = addressPage.verifyFirstName();
		String actualResult2 = addressPage.verifyLastName ();
		String actualResult3 = addressPage. verifyCity() ;
		String actualResult4= addressPage.verifyState();


		String expectedResultFname = "John";
		String expectedResultLname = "Cena";
		String expectedResultCity = "Ann Arbor";
		String expectedResultState = "MI";
		
		softAssert.assertEquals(actualResult1, expectedResultFname," actualResult and expectedResult are not same for name , therefore test case failed ");
		softAssert.assertEquals(actualResult2, expectedResultLname," actualResult and expectedResult are not same for Last name , therefore test case failed ");
		softAssert.assertEquals(actualResult3, expectedResultCity," actualResult and expectedResult are not same for city , therefore test case failed ");
		softAssert.assertEquals(actualResult4, expectedResultState," actualResult and expectedResult are not same for State , therefore test case failed ");

		
		softAssert.assertAll();
	}

}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
