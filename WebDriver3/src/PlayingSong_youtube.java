import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PlayingSong_youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	
		WebDriver driver;
		String url="www.youtube.com";
		driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.id("masthead-search-term")).sendKeys("yellamma dj songs");
		driver.findElement(By.id("search-btn")).click();
		driver.findElement(By.className("yt-lookup-tittle")).click();
		
		driver.close();

	}

}
