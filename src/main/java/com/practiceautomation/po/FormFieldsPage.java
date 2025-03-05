package com.practiceautomation.po;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FormFieldsPage extends PageObject {

	public FormFieldsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub

	}
	@FindBy(xpath = "//div[@id='top-wrap']/section/div/h1")
	private WebElement title;
	
	public WebElement getTitle() {
		return title;
	}
	@FindBy(id = "name-input")
	private WebElement nameInput;
	
	
	@FindBy(xpath = "//form[@id='feedbackForm']/p")
	private WebElement requiredText;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath = "//input[contains(@id, 'drink')]")
	 private WebElement drinks;
	
	
	@FindBy(xpath = "//input[contains(@id, 'color')]")
	 private WebElement colors;
	
	@FindBy(id = "automation")
	private WebElement dropDown;
	
	@FindBy(xpath = "//li[normalize-space()='Selenium']")
	private WebElement seleniumText;
	
	@FindBy(id = "email")
	private WebElement emailField;
	
	@FindBy(id = "message")
	private WebElement messageField;
	
	
	@FindBy(xpath = "//*[@id=\"drink5\"]")
	 private WebElement ctlCheckbox;

	@FindBy(xpath = "//*[@id=\"submit-btn\"]")
	 private WebElement submitBtn;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getNameInput() {
		return nameInput;
	}


	public void setNameInput(WebElement nameInput) {
		this.nameInput = nameInput;
	}


	public WebElement getRequiredText() {
		return requiredText;
	}


	public void setRequiredText(WebElement requiredText) {
		this.requiredText = requiredText;
	}


	public WebElement getPasswordInput() {
		return passwordInput;
	}


	public void setPasswordInput(WebElement passwordInput) {
		this.passwordInput = passwordInput;
	}


	public WebElement getDrinks() {
		return drinks;
	}


	public void setDrinks(WebElement drinks) {
		this.drinks = drinks;
	}


	public WebElement getColors() {
		return colors;
	}


	public void setColors(WebElement colors) {
		this.colors = colors;
	}


	public WebElement getDropDown() {
		return dropDown;
	}


	public void setDropDown(WebElement dropDown) {
		this.dropDown = dropDown;
	}


	public WebElement getSeleniumText() {
		return seleniumText;
	}


	public void setSeleniumText(WebElement seleniumText) {
		this.seleniumText = seleniumText;
	}


	public WebElement getEmailField() {
		return emailField;
	}


	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}


	public WebElement getMessageField() {
		return messageField;
	}


	public void setMessageField(WebElement messageField) {
		this.messageField = messageField;
	}


	public WebElement getCtlCheckbox() {
		return ctlCheckbox;
	}


	public void setCtlCheckbox(WebElement ctlCheckbox) {
		this.ctlCheckbox = ctlCheckbox;
	}


	public void setTitle(WebElement title) {
		this.title = title;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}


	public void setSubmitBtn(WebElement submitBtn) {
		this.submitBtn = submitBtn;
	}
	
	
	
	
	
	
	
	}
	

