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

public class TestNG_testcases {
	
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
		// String ActualTittle="Welcome: Mercury Tours";
		 WebElement home=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
	
	 home.click();
	 String expectedTittle=driver.getTitle();
	// Assert.assertEquals(ActualTittle, expectedTittle);
	 System.out.println(expectedTittle);
	 driver.quit();
	 
	 }
	/** @Test
	 public void FlightsWithXpth(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement flights=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a"));
	
	 flights.click();
	 String expectedTittle=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.quit();
		 
	 }
	 
	 @Test
	 public void HotelsWithXpath(){
		 
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement hotels=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a"));
	
	 hotels.click();
	 String expectedTittle=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.navigate().back();
	 driver.quit();
		 
	 }
	 
	 @Test
	 public void Car_Rentals(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement carRentals=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
	
	carRentals.click();
	 String expectedTittle=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.quit();
		 
	 }
	  
	 @Test
	 public void CruisesWithXpath(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement cruises=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a"));
	
	 cruises.click();
	 String expectedTittle=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.quit();
		 
	 }
	  
	  
	 @Test
	 public void DestinationsWithXpath(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement destinations=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a"));
	
	 destinations.click();
	 String expectedTittle=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.quit();
		 
	 }
	  
	 @Test
	 public void VocationsWithXpath(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement vocations=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a"));
	
	 vocations.click();
	 String expectedTittle=driver.getTitle();
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.quit();
		 
	 }
	 
	 @Test
	 public void SigninwithXpath(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement signin=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	
	 signin.click();
	 String expectedTittle=driver.getTitle();
	
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 driver.quit();
		 
	 }
	 
	  
	 @Test
	 public void RegisterWithXpath(){
		 String ActualTittle="Welcome: Mercury Tours";
		 WebElement register=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	
	 register.click();
	 String expectedTittle=driver.getTitle();
	
	 Assert.assertEquals(ActualTittle, expectedTittle);
	 
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
	 
	 
		 
	 }
	 
	  
		 @Test
		 public void SupportWithXpath(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement support=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
		
		 support.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
	  
		 @Test
		 public void ContactWithXpath(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement contact=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[4]/a"));
		
		 contact.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test
		 public void DestinationLinkWithXpath(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement destnation=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[6]/td/table/tbody/tr/td[2]/font/a"));
		
		 destnation.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 
	
			 
		 }
		 
		 @Test
		 public void VocationsLinkWithXpath(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement vocation=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[8]/td/table/tbody/tr/td[2]/font/a"));
		
		 vocation.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 
	
			 
		 }
		 
		 
		 
		 //Executing with linktext
		 
		 @Test
		 public void TcHomeWtihXpath1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement home=driver.findElement(By.linkText("Home"));
		
		 home.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
		 
		 }
		 @Test
		 public void FlightsWithXpth1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement flights=driver.findElement(By.linkText("Flights"));
		
		 flights.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test
		 public void HotelsWithXpath1(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement hotels=driver.findElement(By.linkText("Hotels"));
		
		 hotels.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
			 
		 }
		 
		 @Test
		 public void Car_Rentals1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement carRentals=driver.findElement(By.linkText("Car Rentals"));
		
		carRentals.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		 @Test
		 public void CruisesWithXpath1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement cruises=driver.findElement(By.linkText("Cruises"));
		
		 cruises.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		  
		 @Test
		 public void DestinationsWithXpath1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement destinations=driver.findElement(By.linkText("Destinations"));
		
		 destinations.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		 @Test
		 public void VocationsWithXpath1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement vocations=driver.findElement(By.linkText("Vacations"));
		
		 vocations.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test
		 public void SigninwithXpath1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement signin=driver.findElement(By.linkText("SIGN-ON"));
		
		 signin.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		  
		 @Test
		 public void RegisterWithXpath1(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		 register.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 
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
		 
		 
			 
		 }
		 
		  
			 @Test
			 public void SupportWithXpath1(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement support=driver.findElement(By.linkText("SUPPORT"));
			
			 support.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
		  
			 @Test
			 public void ContactWithXpath1(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement contact=driver.findElement(By.linkText("CONTACT"));
			
			 contact.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
			 
			 @Test
			 public void DestinationLinkWithXpath1(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement destnation=driver.findElement(By.linkText("your destination"));
			
			 destnation.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 
		
				 
			 }
			 
			 @Test
			 public void VocationsLinkWithXpath1(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement vocation=driver.findElement(By.linkText("featured vacation destinations"));
			
			 vocation.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 
		
				 
			 }**/
			 
			  
  }


