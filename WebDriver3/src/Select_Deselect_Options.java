import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Deselect_Options {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	Select select=new Select(driver.findElement(By.id("selenium_commands")));
	
	List<WebElement> options=select.getOptions();
	System.out.println("The number of Options:  "+options.size());
	
	select.selectByIndex(1);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	select.deselectByIndex(1);
	select.selectByVisibleText("Navigation Commands");
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	select.deselectByVisibleText("Navigation Commands");
	
	boolean b=select.isMultiple();
	if(b=true)
	{
		for(int i=0;i<options.size();i++){
			String sValue=select.getOptions().get(i).getText();
			System.out.println(sValue);
			select.selectByIndex(i);
			break;
		}
	}
	}

}
