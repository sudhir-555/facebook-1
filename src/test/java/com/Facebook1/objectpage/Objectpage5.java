package com.Facebook1.objectpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.OkHttpClient.Factory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook1.basepage.Basepage5;

public class Objectpage5 extends Basepage5 {
	//page object or Repository
		@FindBy(id = "email")
		private WebElement EmailId;
		@FindBy(id = "pass")
		private WebElement Password;
		@FindBy(xpath = "//div/button[@data-testid='royal_login_button']")
		private WebElement Login;
		
		//Initialization
public Objectpage5(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
//Action
public void EnterEmailid()
{
	EmailId.sendKeys(prop.getProperty("UserName"));
}

public void EnterPasswd()
{
	 Password.sendKeys(prop.getProperty("Password1"));
	}
public void Loginfc() throws Exception
{
	Thread.sleep(20);
	Login.click();
	}
//Business logic
public void VerifyLogin() throws Exception
{
	EnterEmailid();
	EnterPasswd();
	Loginfc();
	}


}
