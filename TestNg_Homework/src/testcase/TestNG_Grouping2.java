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

public class TestNG_Grouping2 {
	String baseURL="http://newtours.demoaut.com";
	  String geckoDriver="C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe";
	 WebDriver driver;
	 
	 

	  @BeforeMethod(groups={"xpath","Partial_LinkText","LinkText"})
	  public void beforeMethod() {
		  
		  System.setProperty("webdriver.gecko.driver", geckoDriver);
			 driver=new FirefoxDriver();
			 driver.get(baseURL);
			 
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  
	  @Test(groups={"xpath"})
	  public void Home_Test() {
		  String ActualTittle="Welcome: Mercury Tours";
			 WebElement home=driver.findElement(By.xpath("//a[contains(@href,'mercurywelcome.php')]"));
		
		 home.click();
		 String expectedTittle=driver.getTitle();
		 System.out.println("Clicking on HOME");
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
}
	  @Test(groups={"xpath"})
		 public void FlightsWithXpth(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement flights=driver.findElement(By.xpath("//a[contains(@href,'mercuryreservation.php')]"));
		
		 flights.click();
		 System.out.println("Clicking on flights");
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
	  
	  @Test(groups={"xpath"})
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
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  @Test(groups={"xpath"})
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
	  
	  
	  
	//Executing with linktext
		 
		 @Test(groups={"LinkText"})
		 public void TcHomeWtihLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement home=driver.findElement(By.linkText("Home"));
		
		 home.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
		 
		 }
		 @Test(groups={"LinkText"})
		 public void FlightsWithLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement flights=driver.findElement(By.linkText("Flights"));
		
		 flights.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test(groups={"LinkText"})
		 public void HotelsWithLinkText(){
			 
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement hotels=driver.findElement(By.linkText("Hotels"));
		
		 hotels.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.navigate().back();
		 driver.quit();
			 
		 }
		 
		 @Test(groups={"LinkText"})
		 public void Car_RentalsLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement carRentals=driver.findElement(By.linkText("Car Rentals"));
		
		carRentals.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		 @Test(groups={"LinkText"})
		 public void CruisesWithLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement cruises=driver.findElement(By.linkText("Cruises"));
		
		 cruises.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		  
		 @Test(groups={"LinkText"})
		 public void DestinationsWithLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement destinations=driver.findElement(By.linkText("Destinations"));
		
		 destinations.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		  
		 @Test(groups={"LinkText"})
		 public void VocationsWithLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement vocations=driver.findElement(By.linkText("Vacations"));
		
		 vocations.click();
		 String expectedTittle=driver.getTitle();
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		 @Test(groups={"LinkText"})
		 public void SigninwithLinkText(){
			 String ActualTittle="Welcome: Mercury Tours";
			 WebElement signin=driver.findElement(By.linkText("SIGN-ON"));
		
		 signin.click();
		 String expectedTittle=driver.getTitle();
		
		 Assert.assertEquals(ActualTittle, expectedTittle);
		 driver.quit();
			 
		 }
		 
		  
		 @Test(groups={"LinkText"})
		 public void RegisterWithLinkText(){
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
		 
		  
			 @Test(groups={"LinkText"})
			 public void SupportWithLinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement support=driver.findElement(By.linkText("SUPPORT"));
			
			 support.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
		  
			 @Test(groups={"LinkText"})
			 public void ContactWithLinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement contact=driver.findElement(By.linkText("CONTACT"));
			
			 contact.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
			 
			 @Test(groups={"LinkText"})
			 public void DestinationLinkWithLinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement destnation=driver.findElement(By.linkText("your destination"));
			
			 destnation.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 
		
				 
			 }
			 
			 @Test(groups={"LinkText"})
			 public void VocationsLinkWithLinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement vocation=driver.findElement(By.linkText("featured vacation destinations"));
			
			 vocation.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 
		
				 
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
				 WebElement signin=driver.findElement(By.partialLinkText("Sign"));
			
			 signin.click();
			 String expectedTittle=driver.getTitle();
			
			 Assert.assertEquals(ActualTittle, expectedTittle);
			 driver.quit();
				 
			 }
			 
			  
			 @Test(groups={"Partial_LinkText"})
			 public void RegisterWithPartialLinkText(){
				 String ActualTittle="Welcome: Mercury Tours";
				 WebElement register=driver.findElement(By.partialLinkText("Regi"));
			
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
					 WebElement support=driver.findElement(By.partialLinkText("Suppor"));
				
				 support.click();
				 String expectedTittle=driver.getTitle();
				
				 Assert.assertEquals(ActualTittle, expectedTittle);
				 driver.quit();
					 
				 }
			  
				 @Test(groups={"Partial_LinkText"})
				 public void ContactWithPartial_LinkText(){
					 String ActualTittle="Welcome: Mercury Tours";
					 WebElement contact=driver.findElement(By.partialLinkText("Conta"));
				
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
				 
				  
			 
			  
}



	  
	  
	  




