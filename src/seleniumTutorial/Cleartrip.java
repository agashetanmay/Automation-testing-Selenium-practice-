package seleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.cleartrip.com");
		driver.findElement(By.xpath("//input[@name='origin']")).sendKeys("ban");
		Thread.sleep(5000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//a[contains(text(),'Ban')]"));
		System.out.println(allsugg.size());
		allsugg.get(2).click();
		Thread.sleep(5000);
		driver.close();
		
		
		
		
	}

}
