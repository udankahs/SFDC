package com.email.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class iREPLoginPage
{
	@FindBy(id="username")
	private WebElement unTextBox;
	
	@FindBy(id="password")
	private WebElement pwTextBox;
	
	@FindBy(id="Login")
	private WebElement loginButton;
	
	public iREPLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void login(String un,String pw)
	{
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		loginButton.click();
	}
	
}
