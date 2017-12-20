import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Lunching_Firefox_with_TestNg {
  @Test
  public void firefox() {
	  
	  System.out.println("Lunching firefox");
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
 
     WebDriver driver=new FirefoxDriver();
     driver.get("http://www.facebook.com");
     System.out.println("closing the firefox");
      driver.close();
     
  }
}
