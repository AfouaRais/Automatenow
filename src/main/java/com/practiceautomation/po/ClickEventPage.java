package com.practiceautomation.po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClickEventPage extends PageObject {

	public ClickEventPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getHeadline() {
		return headline;
	}

	public void setHeadline(WebElement headline) {
		this.headline = headline;
	}

	@FindBy(xpath="//h1[contains(@itemprop,'headline')]")
	private WebElement headline;
@FindBy (xpath= "//button[@onclick='catSound()']")
private WebElement Cat;

@FindBy (xpath= "//button[@onclick='dogSound()']")
private WebElement Dog;

@FindBy (xpath= "//b[normalize-space()='Pig']")
private WebElement Pig ;

@FindBy (xpath= "//b[normalize-space()='Cow']")
private WebElement Cow;

@FindBy(id="demo")
private WebElement textDemo;

public WebElement getCat() {
	return Cat;
}

public void setCat(WebElement cat) {
	Cat = cat;
}

public WebElement getDog() {
	return Dog;
}

public void setDog(WebElement dog) {
	Dog = dog;
}

public WebElement getPig() {
	return Pig;
}

public void setPig(WebElement pig) {
	Pig = pig;
}

public WebElement getCow() {
	return Cow;
}

public void setCow(WebElement cow) {
	Cow = cow;
}

public WebElement getTextDemo() {
	return textDemo;
}

public void setTextDemo(WebElement textDemo) {
	this.textDemo = textDemo;
}


}


	


