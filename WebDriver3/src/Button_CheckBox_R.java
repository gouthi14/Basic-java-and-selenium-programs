import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button_CheckBox_R {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("lunching the firefox");
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\gouthamgoud\\Desktop\\selenium jars\\geckodriver-v0.15.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	WebElement maleRadioBtn=driver.findElement(By.id("sex-0"));
	
	boolean radioBtnIsDisplayed=maleRadioBtn.isDisplayed();
	System.out.println("Is male radio button displayed: "+radioBtnIsDisplayed);
	
	boolean radioBtnIsEnabled=maleRadioBtn.isEnabled();
	System.out.println("Is male radio button enabled: "+radioBtnIsEnabled);
	
	boolean radioBtnIsSelected=maleRadioBtn.isSelected();
	System.out.println("Default Radio selection status: "+radioBtnIsSelected);
	
	maleRadioBtn.click();
	
	boolean radioBtnNewSelectionStatus=maleRadioBtn.isSelected();
	System.out.println("male radio selection status after perform Click() event: "+radioBtnNewSelectionStatus);
	
	
	driver.close();
	}

}