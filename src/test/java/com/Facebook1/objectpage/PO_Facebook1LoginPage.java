package com.Facebook1.objectpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Facebook1.basepage.Facebook1basepage;

public class PO_Facebook1LoginPage extends Facebook1basepage {
	
	//page object or Repository
	@FindBy(id = "email")
	private WebElement EmailId;
	@FindBy(id = "pass")
	private WebElement Password;
	@FindBy(xpath = "//div/button[@data-testid='royal_login_button']")
	private WebElement Login;
	
	//insitialization
	public PO_Facebook1LoginPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//Action
	
	public void EnterEmailId(String email)
	{
	EmailId.sendKeys(email);
	}
	public void EnterPasswd(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickLogin() throws Exception
	{
		Thread.sleep(6000);
		Login.click();
	}
	//Bussiness Logic
	public void VerifyLogin(String email,String pass) throws Exception
	{
		EnterEmailId(email);
		EnterPasswd(pass);
		ClickLogin();
	}
	

}
