package seleniumTutorial;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot3 {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	static int count =1;
    static TakesScreenshot ts;
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 ts = (TakesScreenshot)driver;
		driver.get("http://flipkart.com");
		photoley();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		photoley();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
	public static void photoley() throws IOException {
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File des = new File("./photo/flip"+(count++)+".png");
	FileUtils.copyFile(scr, des);
}
	
	
	

}
