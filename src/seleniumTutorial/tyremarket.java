package seleniumTutorial;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class tyremarket {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("https://www.tyremarket.com/Car-Tyres");
       /* driver.findElement(By.xpath("//input[@class='Car-Tyres-enabled']")).click();*/
        String s=driver.getTitle();
        System.out.println(s);
      WebElement dropdown = driver.findElement(By.xpath("//div/div/select[@id =\"cboVehicles\"]"));
      dropdown.click();
      
       /* Actions act = new Actions(driver);*/
        Select drop = new Select(dropdown);
        drop.selectByVisibleText("Maruti");
       /*driver.switchTo().activeElement().sendKeys("Maruti").
     
       /* act.sendKeys(Keys.ENTER);*/
        Thread.sleep(5000);
          
  
        driver.close();
        
	}

	
}
