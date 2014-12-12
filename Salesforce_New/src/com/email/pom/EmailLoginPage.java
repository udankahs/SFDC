package com.email.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailLoginPage
{
	private WebDriver driver;
	
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
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://email.abbvie.com");
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		loginButton.click();
	}
	
}
