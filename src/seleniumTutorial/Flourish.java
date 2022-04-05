package seleniumTutorial;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flourish {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//open website
		driver.get("https://uat.flourishsoftware.com/welcome");
		//enter login details
		driver.findElement(By.name("username")).sendKeys("nilesh.raval@codepiemedia.com");
		driver.findElement(By.name("password")).sendKeys("Nilesh123$$$");
		//click on sign in 
		driver.findElement(By.xpath("//div/button/span")).click();
		Thread.sleep(5000);	
		//WebElement dropdown = driver.findElement(By.xpath("//a[@id='top-nav-select-facility-anchor']"));
       //  Select drop=new Select(dropdown);
       //  drop.selectByVisibleText("RETAIL");
        // Thread.sleep(3000);
         driver.findElement(By.xpath("//li[@class='menu--item tab ng-scope'][9]")).click();
		
		Thread.sleep(1000);
		//add customer
		 driver.findElement(By.xpath("//*")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"top\"]/div/module-tabs/div/div/ul/li[2]/a/uib-tab-heading/span/ul/li[2]/span")).click();
		 
		
		 Thread.sleep(2000);
		// details of customers
		 driver.findElement(By.name("firstName")).sendKeys("Tanmay");
		 driver.findElement(By.name("lastName")).sendKeys("agashe");
		 driver.findElement(By.name("dateOfBirth")).sendKeys("08-19-1995");
		 driver.findElement(By.id("email")).sendKeys("agashetnmay@gmail.com");
		 driver.findElement(By.name("phonenumber")).sendKeys("7709586364");
		 //click on save button
		 driver.findElement(By.xpath("//button//span[contains(text(),'Save')]")).click();
		 driver.quit();
		

	
	}

}
