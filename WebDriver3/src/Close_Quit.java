import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_Quit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.navigate().to("http://www.google.com");
driver.findElement(By.name("q")).sendKeys("goutham");



driver.close();
//driver.quit();
		
	}

}
