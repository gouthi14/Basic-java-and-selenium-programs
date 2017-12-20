import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	   
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("thuluva.gouthamgoud4@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("goutham14");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		
		
	}

}
