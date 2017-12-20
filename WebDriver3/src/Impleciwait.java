import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Impleciwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		
		ImplicitWait(driver);
		
		driver.findElement(By.name("q")).sendKeys("Execute automation");
		driver.findElement(By.name("btnG")).click();
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/h3/a")).click();
	driver.findElement(By.linkText("Testing Framework")).click();
	}
	
	public static void ImplicitWait(WebDriver driver1){
	
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	}


