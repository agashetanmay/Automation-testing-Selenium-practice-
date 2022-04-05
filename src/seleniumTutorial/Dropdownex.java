package seleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownex {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Tanmay/Desktop/xyz.html");
          WebElement dropdown = driver.findElement(By.xpath("//select[@id='oberoi']"));
          Select drop=new Select (dropdown);
        drop.selectByIndex(3);
        Thread.sleep(6000);
         List<WebElement> option = drop.getAllSelectedOptions();
         System.out.println(option.get(3));
        driver.close();
        		  
        
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
		
		
	}

}
