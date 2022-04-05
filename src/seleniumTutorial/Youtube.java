package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("abcdxyz");//switches to active element and types
		Thread.sleep(2000);
		driver.close();

	}

}
