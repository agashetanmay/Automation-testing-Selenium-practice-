package seleniumTutorial;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S6 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}


	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("http://www.FLIPKART.COM");
			Set<String> add = driver.getWindowHandles();
			System.out.println(add);
			for(String a:add) {
				System.out.println(a);
	}
			driver.quit();
			
	}
}


