package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignInPage extends CommonUI {

	@FindBy(id="session_email")
	WebElement emailField;
	@FindBy(id="session_password")
	WebElement passwordField;
	@FindBy(css=".btn.btn-primary")
	WebElement signInbutton;
	
	
	public SignInPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
		
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSignIn() {
		click(signInbutton);
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

