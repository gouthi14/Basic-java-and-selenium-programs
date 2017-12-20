import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\Q&A_resumes\\selenium jars\\geckodriver-v0.18.0-win64\\geckodriver.exe");
	
		String baseUrl = "https://lridev01-lri.cs60.force.com/form/s/login/";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//*[@id='39:2;a']")).sendKeys("lri_user@fanniemae.com");
		driver.findElement(By.xpath(".//*[@id='57:2;a']")).sendKeys("Welcome_123");
		driver.findElement(By.xpath(".//*[text()='Login']")).click();

		Select FiscalYear = new Select(driver.findElement(By.xpath(".//*[@id='108:2;a']")));
		FiscalYear.selectByVisibleText("2016");
		
		Select LenderName = new Select(driver.findElement(By.xpath(".//*[@id='12:2;a']")));
		LenderName.selectByVisibleText("America National Back");

		driver.close();
 }

	
	
	}


