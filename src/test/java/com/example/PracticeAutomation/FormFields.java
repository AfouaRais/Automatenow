package com.example.PracticeAutomation;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.practiceautomation.po.FormFieldsPage;

public class FormFields {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	JavascriptExecutor js;
	FormFieldsPage formFieldsPage;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		baseUrl = "https://practice-automation.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
		formFieldsPage = new FormFieldsPage(driver);

	}

	@Test
	public void testFormFields() throws Exception {
		driver.get("https://practice-automation.com/form-fields/");
		
		try {

			// Verify page title
			assertEquals("Form Fields", formFieldsPage.getTitle().getText());

			// Verify required field message
			 assertEquals("* Required",formFieldsPage.getRequiredText().getText());

			// filL Name Fields

			formFieldsPage.getNameInput().click();
			formFieldsPage.getNameInput().sendKeys("Afoua");

			// Verify required field message
			assertEquals("* Required", formFieldsPage.getRequiredText().getText());

			// Fill Password field
			formFieldsPage.getPasswordInput().sendKeys("123");

			// Test the specific drink

			formFieldsPage.perform(formFieldsPage.getCtlCheckbox());

			// Test the specific color
			formFieldsPage.perform(formFieldsPage.getColors());

			// Select dropdown options
			formFieldsPage.getSelect(formFieldsPage.getDropDown()).selectByVisibleText("Yes");
			formFieldsPage.getSelect(formFieldsPage.getDropDown()).selectByVisibleText("No");
			formFieldsPage.getSelect(formFieldsPage.getDropDown()).selectByVisibleText("Undecided");

			// Verify selectable list options
			assertEquals("Selenium", formFieldsPage.getSeleniumText().getText());


			// Fill email
			formFieldsPage.getEmailField().sendKeys("raisafoua@yahoo.com");
			// Fill message
			formFieldsPage.getMessageField().sendKeys("hello");
			// Submit form
			
			
			formFieldsPage.perform(formFieldsPage.getSubmitBtn());
			Thread.sleep(1000);
		
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

}
