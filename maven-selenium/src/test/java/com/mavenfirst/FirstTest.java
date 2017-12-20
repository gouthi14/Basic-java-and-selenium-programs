package com.mavenfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {

	
		@Test
		public void tc_1() 
		{
			
		
		WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.co.in");
	driver.findElement(By.name("q")).sendKeys("selenium");
		}
		
	}

	

