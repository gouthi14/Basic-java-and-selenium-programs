package testng;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class First {
	 String baseURL="http://newtours.demoaut.com";
	  String geckoDriver="C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	 WebDriver driver;
	
	 @BeforeMethod
	  public void beforeMethod() {
		 System.setProperty("webdriver.gecko.driver", geckoDriver);
		 driver=new FirefoxDriver();
		 driver.get(baseURL);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
  @Test
  public void f() {
	  String ActualTittle="Welcome: Mercury Tours";
		 WebElement home=driver.findElement(By.xpath("//a[contains(@href,'mercurywelcome.php')]"));
	
	 home.click();
	 String expectedTittle=driver.getTitle();
	 System.out.println("Clicking on HOME");
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
  }
 
}
