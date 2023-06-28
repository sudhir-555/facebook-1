package com.Facebook1.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Facebook1.basepage.Basepage5;
import com.Facebook1.objectpage.Objectpage5;

public class Loginpage5 extends Basepage5 {
	
	@BeforeMethod
	public void init() throws Exception
	{
		 Initialization();
	}
	@Test
	public void VerifyL() throws Exception
	{
		Objectpage5 obj=new Objectpage5(driver);
		obj.VerifyLogin();
	}
	@AfterMethod
	public void tearDown()
	{
		//driver.close();
	}

}
