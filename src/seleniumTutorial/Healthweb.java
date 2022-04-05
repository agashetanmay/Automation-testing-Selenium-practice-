package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Healthweb {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//open website.
		driver.get("https://www.religarehealthinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		//Thread.sleep(6000);
		
		//Alert alert = driver.switchTo().alert();
		//alert.getText();
		//System.out.println(alert.getText());
		//alert.accept();
		Thread.sleep(2000);
		//enter policy details
        driver.findElement(By.id("policynumber")).sendKeys("7709586364");
        driver.findElement(By.id("dob")).click();
        
        //enter month
        WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select mo=new Select(month);
        mo.selectByVisibleText("Aug");
        Thread.sleep(2000);
        
        //enter year
       WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select ye=new Select(year);
        ye.selectByVisibleText("1995");
        Thread.sleep(2000);
        
        //select date
         driver.findElement(By.linkText("19")).click();
        
       
        Thread.sleep(2000);
        //enter mobile no
        driver.findElement(By.id("alternative_number")).sendKeys("8149136791");
        //click on submit button
        
        driver.findElement(By.id("renew_policy_submit")).click();
      
        
        
        
        
        
		
	}

}
