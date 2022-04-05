package seleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
	
	/*static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	*/
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://redbus.in");
	}

}
