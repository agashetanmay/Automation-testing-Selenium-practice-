package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class topgeek {

		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
			
		}

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			driver.get("https://topgeek.io/");
			driver.findElement(By.xpath("//p[@class='chakra-text css-j3sdsa']")).click();
			driver.findElement(By.xpath("//button[@class='chakra-button css-1b35rk1']")).click();
			driver.findElement(By.xpath("//input[@placeholder='Enter your Email']")).sendKeys("tanmay");
			driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("12345");
			driver.findElement(By.xpath("//button[@class='chakra-button css-1nttfkl']")).click();
			
			System.out.println("login not ");
			Thread.sleep(3000);
			driver.close();
	}

}
