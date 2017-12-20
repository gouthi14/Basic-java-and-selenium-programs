package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProvider {
	
	 String baseURL="http://facebook.com";
	  String geckoDriver="C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	 WebDriver driver;
	 
	 @Test(dataProvider="facebook_testing")
	  public void Data() throws InterruptedException {
		  System.setProperty("webdriver.gecko.driver", geckoDriver);
			 driver=new FirefoxDriver();
			 driver.get(baseURL);
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("");
				driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("");
				driver.findElement(By.xpath(".//*[@id='u_0_q']")).click();
				
				Thread.sleep(2500);
				System.out.println(driver.getTitle());
				driver.quit();
	 }
 
	 @org.testng.annotations.DataProvider(name="facebook_testing")
		 public Object[][] passData()
		 {
		 Object[][] data=new Object[3][2];
		 data[0][0]="goutham1";
		 data[1][0]="goutham2";
		 data[1][0]="goutham3";
		 data[1][1]="goutham4";
		 data[2][0]="goutham6";
		 data[2][1]="goutham7";
		 return data;
		 
	 }
	  
  }

