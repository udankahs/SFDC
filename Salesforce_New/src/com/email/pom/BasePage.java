package com.email.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'My Accounts')]")
	private WebElement myAccounts;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']/a[1]")
	private WebElement mySettings;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	@FindBy(id="userNavLabel")
	private WebElement userNavLabel;
	
	public BasePage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	public void mySettings()
	{
		mySettings.click();
	}
	
	public void goToMyAccounts()
	{
		driver.switchTo().defaultContent();
		myAccounts.click();
	}
	
	public void logout()
	{
		userNavLabel.click();
		logoutLink.click();
	}
}
