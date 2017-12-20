import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Movie_Tickets {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	
		WebDriver driver;
		String firstName="goutham";
		driver=new FirefoxDriver();
		driver.get("http://www.movietickets.com");
		
		driver.findElement(By.linkText("Join Now")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("first_name")).sendKeys(firstName);
		driver.findElement(By.name("last_name")).sendKeys("Thuluva");
		driver.findElement(By.name("email")).sendKeys("thuluva.gouthamgoud4@gmail.com");
		driver.findElement(By.name("emailV")).sendKeys("thuluva.gouthamgoud4@gmail.com");
		driver.findElement(By.name("password")).sendKeys("goutham");
		driver.findElement(By.name("password_verify")).sendKeys("goutham");
		driver.findElement(By.name("password_hint")).sendKeys("gout");
		driver.findElement(By.name("customer_postal")).sendKeys("22030");
		
		Select dropdown=new Select(driver.findElement(By.id("sex")));
		    dropdown.selectByVisibleText("Male");
		    
		    Select dropdown1=new Select(driver.findElement(By.id("dob_month")));
		       dropdown1.selectByIndex(4);
		       
		   Select dropdown2=new Select(driver.findElement(By.name("dob_day")));
		       dropdown2.selectByIndex(8);
		   Select dropdown3=new Select(driver.findElement(By.id("dob_year")));
		       dropdown3.selectByIndex(10);
		driver.close();
	}

}
