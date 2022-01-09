package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignUpPage extends CommonUI {

	@FindBy(id = "user_email")
	WebElement emailField;
	@FindBy(id = "user_password")
	WebElement passwordField;
	@FindBy(css = ".btn.btn-primary")
	WebElement signUpbutton;

	@FindBy(css = ".text-center h1")
	WebElement homePageDisplayHeaderOne;

	public SignUpPage() {

		PageFactory.initElements(driver, SignUpPage.this);
	}

	public void enterEmailAddress(String email) {
		enter(emailField, email);

	}

	public void enterPassword(String password) {
		enter(passwordField, password);

	}

	public void clickSignUp() {
		click(signUpbutton);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String displayHomepageWelCome() {

		return getText(homePageDisplayHeaderOne);

	}
}
