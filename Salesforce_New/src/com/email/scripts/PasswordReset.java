package com.email.scripts;

import java.io.IOException;
import org.testng.annotations.Test;

import com.email.pom.iREPLoginPage;
import com.lib.ExcelLib;

public class PasswordReset extends iREPSuperTestNG {
	@Test
	public void testPasswordReset() throws IOException 
	{
		iREPLoginPage loginPage = new iREPLoginPage(driver);
		String xlPath = "D:/Selenium/test data/test data_Final.xlsx";

		int rowCount = ExcelLib.getRowCount(xlPath, "Password Reset");

			String iREPUname = ExcelLib.getCellValue(xlPath, "Password Reset",1, 0);
			String iREPpassword = ExcelLib.getCellValue(xlPath,"Password Reset", 1, 1);

			loginPage.login(iREPUname, iREPpassword);
		
	}
}
