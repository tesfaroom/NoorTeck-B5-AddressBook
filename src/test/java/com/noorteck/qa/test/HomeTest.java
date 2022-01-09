package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class HomeTest extends ObjInitialize {

	public static void main(String[] args) {
		String url = "http://a.testaddressbook.com/";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();

		HomeTest homeObj = new HomeTest();

		homeObj.homeTestTwo();

		CommonUI.quitBrowser();
	}

	

	public void homeTestTwo() {

		homeObj.displayHomepageWelCome("Welcome");

	}

}
