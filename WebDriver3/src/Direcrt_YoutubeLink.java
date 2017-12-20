import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Direcrt_YoutubeLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
    	
		WebDriver driver;
		String url="https://www.youtube.com/watch?v=j5YGUOBfy3s";
		driver=new FirefoxDriver();
		driver.get(url);    
		
		driver.findElement(By.xpath(".//*[@id='movie_player']/div[23]/div[2]/div[1]/button")).click();
		
		driver.findElement(By.xpath(".//*[@id='movie_player']/div[23]/div[2]/div[2]/button[4]")).click();
		driver.close();
	}

}
