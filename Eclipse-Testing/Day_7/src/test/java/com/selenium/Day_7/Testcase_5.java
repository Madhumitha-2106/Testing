package com.selenium.Day_7;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Testcase_5 {
	WebDriver dr;
  @Test(groups= {"SmokeTest"})
  public void f() throws InterruptedException{
	  
		  WebDriverManager.chromedriver().setup();
		  dr = new ChromeDriver();
		  
		  dr.get("https://www.godaddy.com/en-in");
		  dr.manage().window().maximize();
		  Thread.sleep(3000);
		  String title=dr.getTitle();
		  String ctitle = "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN";
		  Assert.assertEquals(title, ctitle);
		  Thread.sleep(3000);
		  String url = "https://www.godaddy.com/en-in";
		  String curl = dr.getCurrentUrl();
		  Assert.assertEquals(url, curl);	
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}




























  

















