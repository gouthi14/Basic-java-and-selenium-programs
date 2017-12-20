import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Retriving_Data_From_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  driver.get("http://toolsqa.wpengine.com/automation-practice-table");
		  String value=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
		  System.out.println(value);
		  
		  
		  String sRowValue="Financial Center";
		  System.out.println("Retriving\""+sRowValue+"\"Details...");
		  for(int i=1;i<=5;i++)
		  {
			  String svalue=null;
			  svalue=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ i +"]/th")).getText();
			  if(svalue.equalsIgnoreCase(sRowValue))
			  {
				  for(int j=1;j<=5;j++){
					  String sColumnValue=driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+ i +"]/td["+ j +"]")).getText();
					  System.out.println(sColumnValue);
				  
				  }break;
			  }
		  }
		  driver.close();
	}

}
