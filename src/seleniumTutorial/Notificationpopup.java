package seleniumTutorial;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in");
	}

}