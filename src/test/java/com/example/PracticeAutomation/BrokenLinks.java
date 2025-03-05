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

import com.practiceautomation.po.BrokenLinksPage;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.time.Duration;

public class BrokenLinks {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  
  BrokenLinksPage brokenLinksPage;
  
  
  
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
	brokenLinksPage  =new BrokenLinksPage(driver);
	  
	  }

  @Test
  public void testBrokenLinks() throws Exception {
	    driver.get("https://practice-automation.com/broken-links/");
	    try {
	    	
	   
	      assertEquals("Broken Links", brokenLinksPage.getTitlePage().getText());   
	
	       assertEquals("Home", brokenLinksPage.getHome().getText());
	    
	      assertEquals("In an ideal scenario a website should have no broken links. Therefore, it’s important to ensure that all links are working properly. One way to do that is to verify that the HTTP response code is 200 when the link is clicked.", brokenLinksPage.getParagraphe().getText());

	//      assertEquals("In this case, clicking the link will return a response code of 404 (Not Found). You could write an automated test that checks for the expected response code of 200.", driver.findElement(By.xpath("//article[@id='post-1267']/div/p[3]")).getText());
	
	   //   assertEquals("In this case, clicking the link will return a response code of 404 (Not Found). You could write an automated test that checks for the expected response code of 200.", driver.findElement(By.xpath("//article[@id='post-1267']/div/p[3]")).getText());
	     		  
	      assertEquals("404", brokenLinksPage.getErreur404().getText());
	      
	    
	    } catch (Error e)
	 {
	      verificationErrors.append(e.toString());
	    }
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

  private String closeAlertAndGetItsText() {
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
}
