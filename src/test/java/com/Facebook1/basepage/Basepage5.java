package com.Facebook1.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basepage5 {
	public static  Properties prop;
	public static WebDriver driver;
public static void Initialization() throws Exception
{
	FileInputStream fis =new FileInputStream("C:\\Users\\kesar\\eclipse-workspace\\FacebookNew-1\\config\\Data.properties");
	prop=new Properties();
	prop.load(fis);
	
	if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
	{
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	}
	 else if(prop.getProperty("Browser").equalsIgnoreCase("firefox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	 }
	 else if(prop.getProperty("Browser").equalsIgnoreCase("Edge"))
	 {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	 }
	 else
	 {
	   System.out.println("Browser is Not Send");
	 }
	

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("URL"));
	
	}

}
