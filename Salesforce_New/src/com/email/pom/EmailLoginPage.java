package com.email.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailLoginPage
{
	@FindBy(id="input_1")
	private WebElement unTextBox;
	
	@FindBy(id="input_2")
	private WebElement pwTextBox;
	
	@FindBy(id="//input[@type=('submit')]")
	private WebElement loginButton;
	
	public EmailLoginPage(WebDriver driver)
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
