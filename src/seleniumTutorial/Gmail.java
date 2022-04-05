package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		Thread.sleep(9000);
		
         driver.get("https://support.google.com/accounts/answer/7675428?hl=en-GB");
         driver.findElement(By.xpath("//a[@class='gb_4 gb_5 gb_re gb_6c']")).click();
         
         
	     driver.findElement(By.id("identifierId")).sendKeys("agashetanmay");
	     
	     driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	     
	   
	     driver.findElement(By.name("password")).sendKeys("Tanmay@770");
	  
	
	      driver.close();
	

	}

}
