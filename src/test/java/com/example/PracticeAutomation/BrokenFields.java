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

public class BrokenFields {
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
  public void testBrokenFields() throws Exception {
    driver.get("https://practice-automation.com/broken-links/");
    driver.findElement(By.xpath("//img[@alt='automateNow Logo']")).click();
    driver.get("https://practice-automation.com/");
    driver.findElement(By.linkText("Form Fields")).click();
    driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1")).click();
    try {
      assertEquals("Form Fields", driver.findElement(By.xpath("//div[@id='top-wrap']/section/div/h1")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.id("name-input")).click();
    driver.findElement(By.id("name-input")).clear();
    driver.findElement(By.id("name-input")).sendKeys("Afoua");
    driver.findElement(By.xpath("//input[@type='password']")).click();
    driver.findElement(By.xpath("//input[@type='password']")).clear();
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("0000");
    driver.findElement(By.id("feedbackForm")).click();
    driver.findElement(By.id("drink1")).click();
    driver.findElement(By.id("drink2")).click();
    driver.findElement(By.id("drink3")).click();
    driver.findElement(By.id("drink4")).click();
    driver.findElement(By.id("drink5")).click();
    driver.findElement(By.id("color1")).click();
    driver.findElement(By.id("automation")).click();
    driver.findElement(By.id("automation")).click();
    driver.findElement(By.xpath("//form[@id='feedbackForm']/ul")).click();
    driver.findElement(By.xpath("//form[@id='feedbackForm']/ul")).click();
    driver.findElement(By.xpath("//form[@id='feedbackForm']/ul/li[5]")).click();
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("raisafoua@yahoo.com");
    driver.findElement(By.id("submit-btn")).click();
    assertEquals("Message received!", closeAlertAndGetItsText());
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
