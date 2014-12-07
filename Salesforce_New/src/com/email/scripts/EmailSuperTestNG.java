package com.email.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class EmailSuperTestNG 
{
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://email.abbvie.com");
	}
	@AfterMethod
	public void postCondition()
	{
	   driver.quit();	
	}
}
