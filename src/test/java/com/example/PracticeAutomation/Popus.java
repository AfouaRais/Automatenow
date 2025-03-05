package com.example.PracticeAutomation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;

public class Popus {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  
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
	  }

		  @Test
		 
		  public void testPopups() throws Exception {
		    
		    driver.get("https://practice-automation.com/");
		    driver.findElement(By.xpath("//img[contains(@src,'https://i0.wp.com/practice-automation.com/wp-content/uploads/2023/09/popup.jpg?resize=512%2C512&ssl=1')]")).click();
		    driver.findElement(By.linkText("Popups")).click();
		    
		    driver.findElement(By.id("alert")).click();
		    assertEquals("Hi there, pal!", closeAlertAndGetItsText1());
		    try {
		    	
		      assertEquals("Alert Popup", driver.findElement(By.id("alert")).getText());
		      assertEquals("Confirm Popup", driver.findElement(By.xpath("//button[@id='confirm']/b")).getText());
		    
		    acceptNextAlert = true;
		   
		      assertEquals("Prompt Popup", driver.findElement(By.xpath("//button[@id='prompt']/b")).getText());
		  
		    driver.findElement(By.xpath("//button[@id='confirm']/b")).click();
		    assertTrue(closeAlertAndGetItsText1().matches("^OK or Cancel, which will it be[\\s\\S]$"));
		    
		    driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1")).click();
		      assertEquals("Popups", driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1")).getText());
		    
		    driver.findElement(By.xpath("//button[@id='alert']/b")).click();
		    assertEquals("Hi there, pal!", closeAlertAndGetItsText1());
		    
		     WebElement element = driver.findElement(By.id("prompt"));
			assertEquals("Hi there, what's your name?", element.getText());
		    acceptNextAlert = false;
		    
		    driver.findElement(By.xpath("c")).click();
		    driver.findElement(By.id("confirm")).click();
		    //ERROR: Caught exception [ERROR: Unsupported command [answerOnNextPrompt | sam | ]]
		    assertTrue(closeAlertAndGetItsText1().matches("^OK or Cancel, which will it be[\\s\\S]$"));
		    
		    driver.findElement(By.id("prompt")).click();
		      assertEquals("Nice to meet you, sam!", driver.findElement(By.id("promptResult")).getText());
		      
		    } catch (Error e) {
		      verificationErrors.append(e.toString());
		    }
		  }

		  private By By(WebElement element) {
			// TODO Auto-generated method stub
			return null;
		}

		@After
		  public void tearDown() throws Exception {
		    driver.quit();
		    String verificationErrorString = verificationErrors.toString();
		    if (!"".equals(verificationErrorString)) {
		      fail(verificationErrorString);
		    }
		  }

		  private boolean isElementPresent(By by) {
		    try {
		      driver.findElement(by);
		      return true;
		    } catch (NoSuchElementException e) {
		      return false;
		    }
		  }

		  private boolean isAlertPresent() {
		    try {
		      driver.switchTo().alert();
		      return true;
		    } catch (NoAlertPresentException e) {
		      return false;
		    }
		  }

		  private String closeAlertAndGetItsText1() {
		    try {
		      Alert alert = driver.switchTo().alert();
		      String alertText = alert.getText();
		      if (acceptNextAlert) {
		        alert.accept();
		      } else {
		        alert.dismiss();
		      }
		      return alertText;
		    } finally {
		      acceptNextAlert = true;
		    }
		  }
		

		private Object closeAlertAndGetItsText() {
			// TODO Auto-generated method stub
			return null;
		}
}
