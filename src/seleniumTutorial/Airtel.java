package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airtel {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("http://www.airtel.in");
	
		
		driver.findElement(By.xpath("//body/div//button[text()='Got It!']")).click();
		
		 
		 
		
		//LOGIN PAGE
		//driver.findElement(By.xpath("//a[@data-analytics='header|Login']")).click();
		
		//driver.findElement(By.name("mobileNumber")).sendKeys("7709586364");
		//driver.findElement(By.id("pasword")).sendKeys("9423414919");
		//driver.findElement(By.id("loginButtonSpan")).click();
		//driver.findElement(By.xpath("//div//div//i[@class='icon icnfontxsmall mt-5 icon-outlined-prepaid']")).click();
		//driver.findElement(By.xpath("//a[@ng-click='ng-click']")).click();
		//driver.close();
		
		
		//HOME PAGE
		
	//driver.findElement(By.xpath("//li[@data-analytics='recharge rail-Prepaid']")).click();
	//driver.findElement(By.name("recharge")).sendKeys("7709586364");
	//driver.findElement(By.id("quickRechargeBtn")).click();
		
		
		
		
	
		//driver.close();

	}

}
