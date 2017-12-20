package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;





public class Testng_maven {
	String baseURL="http://newtours.demoaut.com";
	String geckoDriver="C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	WebDriver driver;
  @Test
  public void testcase1() {
	 System.setProperty("webdriver.gecko.driver", geckoDriver );
	 
	 driver=new FirefoxDriver();
	 
	 driver.get(baseURL);
	 WebElement home=driver.findElement(By.linkText("Home"));
	 home.click();
	 System.out.println(driver.getTitle());
	 
	 
  }
}
