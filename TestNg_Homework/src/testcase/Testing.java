package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing {
	
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
	  
	  
	  @Test(groups={"Partial_LinkText"})
		 public void TcHomeWtihPartial_LinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement home=driver.findElement(By.partialLinkText("Ho"));
		
		 home.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
		 
		 }
		 @Test(groups={"Partial_LinkText"})
		 public void FlightsWithPartial_LinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement flights=driver.findElement(By.partialLinkText("Fligh"));
		
		 flights.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test(groups={"Partial_LinkText"})
		 public void HotelsWithPartialLinkText(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement hotels=driver.findElement(By.partialLinkText("Hote"));
		
		 hotels.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
			 
		 }
		 
		 @Test(groups={"Partial_LinkText"})
		 public void Car_RentalsPartial_LinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement carRentals=driver.findElement(By.partialLinkText("Car"));
		
		carRentals.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		 @Test(groups={"Partial_LinkText"})
		 public void CruisesWithPartialLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement cruises=driver.findElement(By.partialLinkText("Crui"));
		
		 cruises.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		  
		 @Test(groups={"Partial_LinkText"})
		 public void DestinationsWithPartialLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement destinations=driver.findElement(By.partialLinkText("Desti"));
		
		 destinations.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		 @Test(groups={"Partial_LinkText"})
		 public void VocationsWithPartialLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement vocations=driver.findElement(By.partialLinkText("Vocati"));
		
		 vocations.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test(groups={"Partial_LinkText"})
		 public void SigninwithPartialLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement signin=driver.findElement(By.partialLinkText("SIGN"));
		
		 signin.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		  
		 @Test(groups={"Partial_LinkText"})
		 public void RegisterWithPartialLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement register=driver.findElement(By.partialLinkText("REGI"));
		
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
		 
		  
			 @Test(groups={"Partial_LinkText"})
			 public void SupportWithPartial_LinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement support=driver.findElement(By.partialLinkText("SUPPO"));
			
			 support.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
		  
			/** @Test(groups={"Partial_LinkText"})
			 public void ContactWithPartial_LinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement contact=driver.findElement(By.partialLinkText("CONTA"));
			
			 contact.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
			 
			 @Test(groups={"Partial_LinkText"})
			 public void DestinationLinkWithPartial_LinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement destnation=driver.findElement(By.partialLinkText("your"));
			
			 destnation.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 
		
				 
			 }
			 
			 @Test(groups={"Partial_LinkText"})
			 public void VocationsLinkWithPartil_LinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement vocation=driver.findElement(By.partialLinkText("featured"));
			
			 vocation.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 
		
				 
			 }
			 
			  
		 
	  
	  
	 /** @Test
		 public void RegisterWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> Register=driver.findElements(By.partialLinkText("Ho"));
		
		System.out.println(Register.size());
		Register.get(0).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 //driver.navigate().back();
		 //driver.quit();
			 
		 }**/
	  
	/**  @Test
		 public void RegisterHereWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		WebElement RegisterHere=driver.findElement(By.partialLinkText("Register here"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		// driver.navigate().back();
		 //driver.quit();
			 
		 }
	 **/
	  
}
