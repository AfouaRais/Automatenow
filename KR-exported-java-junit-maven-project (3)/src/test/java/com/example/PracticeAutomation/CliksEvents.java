package com.example.PracticeAutomation;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class CliksEvents {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  JavascriptExecutor js;
  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testCliksEvents() throws Exception {
    driver.get("https://practice-automation.com/form-fields/");
    driver.findElement(By.xpath("//img[@alt='automateNow Logo']")).click();
    driver.get("https://practice-automation.com/");
    driver.findElement(By.linkText("Click Events")).click();
    driver.findElement(By.xpath("//button[@onclick='catSound()']")).click();
    driver.findElement(By.id("demo")).click();
    driver.findElement(By.xpath("//button[@onclick='pigSound()']")).click();
    driver.findElement(By.id("demo")).click();
    driver.findElement(By.xpath("//button[@onclick='dogSound()']")).click();
    driver.findElement(By.xpath("//div[@id='main']/div")).click();
    driver.findElement(By.xpath("//button[@onclick='cowSound()']")).click();
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
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
