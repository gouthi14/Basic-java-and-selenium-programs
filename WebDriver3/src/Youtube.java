import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.id("masthead-search-terms")).sendKeys("ellamma dj songs");
		driver.findElement(By.id("search-btn"));
		driver.findElement(By.id("description-id-848595")).click();
		
		driver.close();
		
	}

}
