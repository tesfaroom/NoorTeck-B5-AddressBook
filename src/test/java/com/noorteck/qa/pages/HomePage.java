package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(css = ".text-center h1")
	WebElement homePageDisplayHeaderOne;

	@FindBy(css = ".alert.alert-notice")
	WebElement registerAddressDesplay;
	

	public HomePage() {

		super();
		PageFactory.initElements(driver, this);
	}

	public void displayHomepageWelCome(String title) {
		// isDisplayed(homePageDisplayHeaderOne);

		getText(homePageDisplayHeaderOne);

		if (getText(homePageDisplayHeaderOne).contains(title)) {
			System.out.println("The Display Title test pass : " + getText(homePageDisplayHeaderOne));

		} else {
			System.out.println("The Display Title test fail");
		}

		try

		{
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String regesterAddressDisplay() {

		return getText(registerAddressDesplay);
	}

}
