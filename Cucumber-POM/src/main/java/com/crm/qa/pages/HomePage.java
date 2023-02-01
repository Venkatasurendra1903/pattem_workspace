package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	@FindBy(xpath = "//a[contains(text(),'Messages')]")
	WebElement MsgBtn;
	@FindBy(xpath = "//td[contains(@class,'datacardtitle')]//input[@value='New Message']")
	WebElement NewMsgBtn;
//	@FindBy(xpath = "")
//	WebElement ;
	
	//Initializing the Page Objects
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		

}
