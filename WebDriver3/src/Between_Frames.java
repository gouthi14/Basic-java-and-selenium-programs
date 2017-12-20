import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Between_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	  driver.get("http://demo.guru99.com/selenium/deprecated.html");
      driver.switchTo().frame("classFrame");
      driver.findElement(By.linkText("Deprecated")).click();
      driver.close(); 
	}

}
