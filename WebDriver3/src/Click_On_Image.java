import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Click_On_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";

		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
		  WebDriver driver = new FirefoxDriver();
		  driver.get(baseUrl);
	        //click on the "Facebook" logo on the upper left portion
	        driver.findElement(By.xpath(".//*[@id='identify_yourself_flow']")).click();
	        
	        String str=driver.getTitle();
	        System.out.println(str);

	        //verify that we are now back on Facebook's homepage
	        if (str.equals("Forgot Password | Can't Log In | Facebook")) {
	            System.out.println("We are back at Facebook's homepage");
	        } else {
	            System.out.println("We are NOT in Facebook's homepage");
	        }
	        driver.close();
	}

}
