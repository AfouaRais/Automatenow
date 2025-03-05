package com.practiceautomation.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinksPage extends PageObject {

	public BrokenLinksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(xpath = "//div[@id='top-wrap']/section/div/h1")
	private WebElement titlePage;
	
	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement home;
	
	
	@FindBy(xpath = "//article[@id='post-1267']/div/p[2]")
	private WebElement paragraphe;
	
	 @FindBy(xpath = "//article[@id='post-1267']/div/figure/table/tbody/tr/td[2]")
	 private WebElement erreur404;
	 
	 
	 @FindBy(xpath = "//td[@class='has-text-align-left'][1] ")
	 private WebElement nameText;
	 
	 @FindBy(xpath = "//td[@class='has-text-align-left'][2]" )
	 private WebElement statutText;

	public WebElement getTitlePage() {
		return titlePage;
	}

	public void setTitlePage(WebElement titlePage) {
		this.titlePage = titlePage;
	}

	public WebElement getHome() {
		return home;
	}

	public void setHome(WebElement home) {
		this.home = home;
	}

	public WebElement getParagraphe() {
		return paragraphe;
	}

	public void setParagraphe(WebElement paragraphe) {
		this.paragraphe = paragraphe;
	}

	public WebElement getErreur404() {
		return erreur404;
	}

	public void setErreur404(WebElement erreur404) {
		this.erreur404 = erreur404;
	}

	public WebElement getNameText() {
		return nameText;
	}

	public void setNameText(WebElement nameText) {
		this.nameText = nameText;
	}

	public WebElement getStatutText() {
		return statutText;
	}

	public void setStatutText(WebElement statutText) {
		this.statutText = statutText;
	}
	 
	 
 
}
 