import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;



import org.openqa.selenium.support.ui.Select;

public class Actions {

	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		  Select multiSelect=new Select(driver.findElement(By.id("selenium_commands")));
		  
		  List<WebElement> options=multiSelect.getOptions();
		  
		  System.out.println("the number of options: "+options.size());
		  WebElement we1=multiSelect.getOptions().get(2);
		  WebElement we2=multiSelect.getOptions().get(3);
		  WebElement we3=multiSelect.getOptions().get(4);
		  
		  Actions act=new  Actions(driver);
		   act
		   .keyDown(Keys.CONTROL)
		   .click(we1)
		   .click(we2)
		   .click(we3)
		   .keyUp(Keys.CONTROL);
		  
	        }

	
	}


