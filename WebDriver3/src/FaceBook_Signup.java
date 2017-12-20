
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	
    	WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";
        
        
        driver.get(baseUrl);
        
        driver.findElement(By.name("firstname")).sendKeys("Thuluva");
        driver.findElement(By.name("lastname")).sendKeys("thuluva");
        driver.findElement(By.id("u_0_6")).sendKeys("thuluva.gouthamgoud4@gmail.com");
        driver.findElement(By.id("u_0_9")).sendKeys("thuluva.gouthamgoud4@gmail.com");
        driver.findElement(By.id("u_0_d")).sendKeys("goutham");
        
        Select dropdown= new Select(driver.findElement(By.id("month")));
         dropdown.selectByIndex(5);
        
         Select drop=new Select(driver.findElement(By.id("day")));
        drop.selectByIndex(9);
        
        Select drop1=new Select(driver.findElement(By.id("year")));
        drop1.selectByIndex(8);
        
 
        
        driver.findElement(By.cssSelector("input[value='2']")).click();
        
        driver.close();
        
        		
	}

}
