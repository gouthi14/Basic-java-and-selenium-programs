package testcase;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class All_In_one_TestCase {
	
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
	 public void TcHomeWtihXpath(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement home=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
	
	 home.click();
	 String expectedTittle=driver.getTitle();
	 System.out.println("Clicked on HOME");
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 WebElement flights=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
	 flights.click();
	 String expectedTittle1=driver.getTitle();
	 System.out.println("Clicked on flights");
	 Assert.assertEquals(ActualTittle, expectedTittle1);
	 driver.navigate().back();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 WebElement hotels=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a"));	
	 hotels.click();
	 System.out.println("Clicked on hotels");
	 String expectedTittle2=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle2);
	 driver.navigate().back();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 WebElement carRentals=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
		carRentals.click();
		 System.out.println("Clicked on hotels");
		 String expectedTittle3=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle3);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement cruises=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a"));	
		 cruises.click();
		 System.out.println("Clicked on cruises"); 
		 String expectedTittle4=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle4);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement destinations=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a"));	
		 destinations.click();
		 System.out.println("Clicked on destination");
		 String expectedTittle5=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle5);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement vocations=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
		 vocations.click();
		 String expectedTittle6=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle6);
		 System.out.println("Clicked on vocations");
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement signin=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));	
		 signin.click();
		 System.out.println("Clicked on SignIn"); 
		 String expectedTittle7=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle7);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 WebElement register=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));	
		 register.click();
		 System.out.println("Clicked on Register_Link");
		 String expectedTittle8=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle8);
		 driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("goutham");
		 driver.findElement(By.name("lastName")).sendKeys("thuluva");
		 driver.findElement(By.name("phone")).sendKeys("5712365755");
		 driver.findElement(By.name("userName")).sendKeys("thuluva.gouthamgoud4@gmail.com");
		 driver.findElement(By.name("address1")).sendKeys("bkhjdcbhj,fevev,erve,ervre");
		 driver.findElement(By.name("city")).sendKeys("firefax");
		 driver.findElement(By.name("state")).sendKeys("Va");
		 driver.findElement(By.name("postalCode")).sendKeys("22030");
		 Select dropdown=new Select(driver.findElement(By.name("country")));
		 dropdown.selectByValue("215"); 
		 System.out.println("detals entered");
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 WebElement support=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));	
		 support.click();
		 System.out.println("Clicked on Supprot");
		 String expectedTittle9=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle9);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement contact=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a"));	
		 contact.click();
		 System.out.println("Clicked on contact");
		 String expectedTittle10=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle10);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 WebElement destnation=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font/a"));	
		 destnation.click();
		 System.out.println("Clicked on Destination_Link");
		 String expectedTittle11=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle11);
		 driver.navigate().back();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 
		 WebElement vocation=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[8]/td/table/tbody/tr/td[2]/font/a"));
			
		 vocation.click();
		 System.out.println("Clicked on Vocation_Link");
		 String expectedTittle12=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle12);
		 driver.navigate().back();
		 
		 
		 
		 
		 
		 
		 
	 
	 
	 
	 
	
  }
}
