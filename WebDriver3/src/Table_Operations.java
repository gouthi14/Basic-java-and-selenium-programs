import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		  String value=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		  System.out.println(value);
		  
		  String value2=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[3]/td[5]")).getText();
		  System.out.println(value2);
	
	
		  driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td[6]/a")).click();
		  System.out.println("clicking on the details ");
		  	
	}

}
