package seleniumTutorial;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupdown1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-converter");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Select PDF file')]")).click();

	}    
}
