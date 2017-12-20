package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_Xpath {
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
	  public void Home_Test() {
		  String ActualTittle="Welcome: Mercury Tours";
			 WebElement home=driver.findElement(By.xpath("//a[contains(@href,'mercurywelcome.php')]"));
		
		 home.click();
		 String expectedTittle=driver.getTitle();
		 System.out.println("Clicking on HOME");
		 Assert.assertEquals(ActualTittle, expectedTittle);
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
	  
	  @Test
		 public void HotelsWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> hotels=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(hotels.size());
		hotels.get(0);
		 System.out.println("Clicking on hotels");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 //driver.quit();
			 
		 }
	  @Test
		 public void Car_RentsWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> CarRentals=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(CarRentals.size());
		CarRentals.get(1);
		 System.out.println("Clicking on car Rents");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
			 
		 }
	  
	  @Test
		 public void CruisesWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		WebElement Cruise=driver.findElement(By.xpath("//a[contains(@href,'mercurycruise.php')]"));
		Cruise.click();
		 System.out.println("Clicking on Cruise");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void DestinationsWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> Destinations=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		System.out.println( Destinations.size());
		 Destinations.get(2);
		 System.out.println("Clicking on Destinations");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void VocationsWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> Vocations=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(Vocations.size());
		Vocations.get(3);
		 System.out.println("Clicking on Vocations");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void SignInWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		WebElement SignIn=driver.findElement(By.xpath(".//a[contains(@href,'mercurysignon.php')]"));
		SignIn.click();
		 System.out.println("Clicking on SignIn");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void RegisterWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		WebElement SignIn=driver.findElement(By.xpath(".//a[contains(@href,'mercuryregister.php')]"));
		SignIn.click();
		 System.out.println("Clicking on SignIn");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void SupportWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> support=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(support.size());
		support.get(4);
		 System.out.println("Clicking on Support");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void ContactWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> Contact=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(Contact.size());
		 Contact.get(5);
		 System.out.println("Clicking on Contact");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void YourDestinationWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> YourDestination=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(YourDestination.size());
		YourDestination.get(6);
		 System.out.println("Clicking on YourDestinations");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  @Test
		 public void FeaturedVocationsWithXpath(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
		List<WebElement> FeaturedVocations=driver.findElements(By.xpath("//a[contains(@href,'mercuryunderconst.php')]"));
		
		System.out.println(FeaturedVocations.size());
		FeaturedVocations.get(7);
		 System.out.println("Clicking on FeaturedVocations");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
	  }
	  
	  
	  
}

 