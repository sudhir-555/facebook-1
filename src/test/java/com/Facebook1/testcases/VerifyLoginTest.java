package com.Facebook1.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Facebook1.basepage.Facebook1basepage;
import com.Facebook1.objectpage.PO_Facebook1LoginPage;
import com.Facebook1.utils.RExcel;


import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginTest extends Facebook1basepage {
	
	@BeforeMethod
	public void init() throws Exception
	{
		Initialization();
	}
	
	@DataProvider
	public Object[][]getData() throws IOException, Exception
	{
	RExcel excel = new RExcel();
	return	excel.getExcelData("Login");
	}
	@Test(dataProvider = "getData")
	public void VerifyLoginfb(String email,String pass) throws Exception
	{
		PO_Facebook1LoginPage LP=new PO_Facebook1LoginPage(driver);
		LP.VerifyLogin(email,pass);
	}  
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}
	}
	


