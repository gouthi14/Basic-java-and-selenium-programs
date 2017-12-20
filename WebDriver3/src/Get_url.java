import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_url {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	
		    	WebDriver driver = new FirefoxDriver();
		        String baseUrl = "http://www.facebook.com";
		        String tagName = "";
		        
		        driver.get(baseUrl);
		        tagName = driver.findElement(By.id("email")).getTagName();
		        System.out.println(tagName);
		        driver.close();
		        System.exit(0);
		}
		
	}


