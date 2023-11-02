package com.Mercury;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Guru99 
{

	WebDriver driver;
	  @BeforeSuite
	  public void openBrowser() {
		 System.out.println("BeforeSuite");
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\OneDrive\\Desktop\\Selenium\\117\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");

 driver=new ChromeDriver();
	  }
	  @BeforeTest
	  public void openUrl() {
		  System.out.println("BeforeTest");
		  driver.get("https://demo.guru99.com/test/newtours/");
	  }
	  
	  @BeforeClass
	  public void maximizeBrowser() 
	  {
		  System.out.println("BeforeClass");
		  driver.manage().window().maximize();
		  
	  }
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }


  @AfterSuite
  public void afterSuite() {
  }

}
