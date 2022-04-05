package seleniumTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class geektest {

		static{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
			
			@SuppressWarnings("deprecation")
			public static void main(String[] args) throws InterruptedException{
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.manage().window().maximize();
		        driver.get("https://topgeek.io/");
		        driver.findElement(By.xpath("//p[@class=\"chakra-text css-j3sdsa\"]")).click();
		        driver.findElement(By.xpath("//button[@class=\"chakra-button css-1w9gwcb\"]")).click();
		       /* try {
		      String actual= driver.getTitle();
		      String expected = "https://topgeek.io/openings/page/1";
		      Assert.assertEquals(actual, expected);*/
		     
		      
		      driver.findElement(By.xpath("//input[@placeholder = \"Search jobs...\"]")).sendKeys("software testing");
		      
		      driver.findElement(By.xpath("//button[text() = 'Search']")).click();
		      
		      
		      Thread.sleep(5000);
		        
		        
		        driver.close();

	}

}
