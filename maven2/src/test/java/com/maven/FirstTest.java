package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void testcase1() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	  WebDriver driver;
		driver=new FirefoxDriver();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("thuluva.gouthamgoud4@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("goutham14");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
  }
}
