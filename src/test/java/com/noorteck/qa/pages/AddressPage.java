package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.noorteck.qa.utils.CommonUI;

public class AddressPage extends CommonUI {
	@FindBy(xpath = "//a[contains(@data-test,'addresses')]")
	WebElement addressHomeClick;

	@FindBy(css = ".row.justify-content-center")
	WebElement newAddressClickButton;

	@FindBy(css = "input[id=\"address_first_name\"]")
	WebElement firstnameField;

	@FindBy(css = "input[id=\"address_last_name\"]")
	WebElement lastNameField;

	@FindBy(css = "input[id=\"address_street_address\"]")
	WebElement addressOneField;

	@FindBy(name = "address[address2]")
	WebElement addressTwoField;

	@FindBy(name = "address[city]")
	WebElement cityField;

	@FindBy(name = "address[state]")
	WebElement stateDropDawn;

	@FindBy(name = "address[zip_code]")
	WebElement zipCodeField;

	@FindBy(css = "input[id='address_country_us']")
	WebElement countryradiobutton;

	@FindBy(css = ("input[id=\"address_age\"]"))
	WebElement ageField;

	@FindBy(css = "#address_website")
	WebElement websiteField;

	@FindBy(css = "#address_phone")
	WebElement phoneField;

	@FindBy(css = "#address_interest_dance")
	WebElement commonInterestCheckBox;

	@FindBy(css = "#address_note")
	WebElement noteField;

	@FindBy(css = ".btn.btn-primary")
	WebElement createAddressButton;

	@FindBy(css = ".alert.alert-notice")
	WebElement registeAddressCreatedrHomeDisplay;

	// @FindBy(css = "/html/body/div/div[2]/a[2]")
	@FindBy(xpath = "//a[contains(@data-test,'list')]")
	WebElement listbutton;

	@FindBy(css = ".container h2 ")
	WebElement displayAddressTable;

	@FindBy(xpath = "//table/tbody/tr/td[1]")
	WebElement firstNameAtAddresstable;

	@FindBy(xpath = "//table/tbody/tr/td[2]")
	WebElement lastNameAtAddresstable;

	@FindBy(xpath = "//table/tbody/tr/td[3]")
	WebElement cityAtAddresstable;

	@FindBy(xpath = "//table/tbody/tr/td[4]")
	WebElement stateAtAddresstable;

	public AddressPage() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void clickHomeaddressButton() {

		// explicit wait
		WebDriverWait waite = new WebDriverWait(driver, 60);
		waite.until(ExpectedConditions.elementToBeClickable(addressHomeClick));

		click(addressHomeClick);
	}

	public void clickNewAddressButton() {

		// explicit wait
		WebDriverWait waite = new WebDriverWait(driver, 60);
		waite.until(ExpectedConditions.elementToBeClickable(newAddressClickButton));

		click(newAddressClickButton);
	}

	public void enterFirstname(String firstName) {
		enter(firstnameField, firstName);
	}

	public void enterLastname(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enteraddressOne(String addressOne) {
		enter(addressOneField, addressOne);
	}

	public void enterAddresstwo(String addresstwo) {
		enter(addressTwoField, addresstwo);
	}

	public void enterCity(String city) {
		enter(cityField, city);

	}

	public void selectState(String text, String visibletext) {
		selectFromDropdown(stateDropDawn, text, visibletext);

	}

	public void enterZipCode(String zipCode) {
		enter(zipCodeField, zipCode);

	}

	public void clickCountryRadio() {
		click(countryradiobutton);

	}

	public void enterAge(String age) {
		enter(ageField, age);

	}

	public void enterWebsite(String webaddress) {
		enter(websiteField, webaddress);
	}

	public void enterPhonerNumber(String phone) {

		enter(phoneField, phone);
	}

	public void clickCommoninterest() {
		click(commonInterestCheckBox);

	}

	public void enterNote(String note) {

		enter(noteField, note);
	}

	public void clickcreateAddress() {

		// explicit wait
		WebDriverWait waite = new WebDriverWait(driver, 300);
		waite.until(ExpectedConditions.elementToBeClickable(createAddressButton));

		click(createAddressButton);

	}

	public String clickHomeDisplayregister() {
		// explicit wait
		//WebDriverWait waite = new WebDriverWait(driver, 200);
		//waite.until(ExpectedConditions.elementToBeClickable(registeAddressCreatedrHomeDisplay));

		return getText(registeAddressCreatedrHomeDisplay);

	}

	public void clickListButton() {
		click(listbutton);

	}

	public String displayAddressSummaryTable() {
		// explicit wait
		WebDriverWait waite = new WebDriverWait(driver, 60);
		waite.until(ExpectedConditions.elementToBeClickable(displayAddressTable));
		return getText(displayAddressTable);

	}

	public String verifyFirstName() {

		return getText(firstNameAtAddresstable);

	}

	public String verifyLastName() {
		return getText(lastNameAtAddresstable);

	}

	public String verifyCity() {
		return getText(cityAtAddresstable);

	}

	public String verifyState() {
		return getText(stateAtAddresstable);

	}

}
