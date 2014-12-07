package com.email.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GotoUnreadMail extends BasePage {

	@FindBy(xpath = "//span[@id=('_ariaId_68')]")
	private WebElement unread;

	@FindBy(xpath = "//a[2]")
	private WebElement pswRestLink;
	
	public GotoUnreadMail(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void gotoUnreadMail() 
	{
		unread.click();
		pswRestLink.click();
	}
}
