import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Displaying_RadioButton_Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	List<WebElement> checkBoxes=driver.findElements(By.name("profession"));
	
	
	for(WebElement we:checkBoxes)
	{
		System.out.println("value is"+we.getAttribute("name"));
	}
	}

}
