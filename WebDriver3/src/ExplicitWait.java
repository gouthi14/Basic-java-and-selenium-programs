import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		
		
		
		driver.findElement(By.name("q")).sendKeys("Execute automation");
		driver.findElement(By.name("btnG")).click();
		
		ExplicitWait(driver,".//*[@id='rso']/div[1]/div/div/div/h3/a");
		driver.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/h3/a")).click();
	driver.findElement(By.linkText("Testing Framework")).click();
	}
	
	public static void ExplicitWait(WebDriver driver,String text){
		
		(new WebDriverWait(driver,10)).until(ExpectedConditions.elementToBeClickable(By.xpath(text)));
		
	}
	}

	


