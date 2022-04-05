package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("7709586364");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Tanmay@19");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Electronics') and @class='_1QZ6fC _3Lgyp8']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Mobiles']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div//img[@alt='Mi']")).click();
		Thread.sleep(4000);
		WebElement price = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div/section[2]/div[4]/div[3]/select"));
		Select pr1=new Select(price);
		pr1.selectByIndex(3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.close();
		
		
		
		
		Thread.sleep(3000);
		
		
		
		driver.close();
	
		

		
		
			
		}
		
		
		
		
		
		
		
	
		

	}
