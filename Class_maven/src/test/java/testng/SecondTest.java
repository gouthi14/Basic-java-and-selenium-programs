package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecondTest {
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
		 public void FlightsWithXpth(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement flights=driver.findElement(By.xpath("//a[contains(@href,'mercuryreservation.php')]"));
		
		 flights.click();
		 System.out.println("Clicking on flights");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
}
