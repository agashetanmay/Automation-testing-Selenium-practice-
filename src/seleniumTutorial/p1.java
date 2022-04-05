package seleniumTutorial;

import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.close();
	}

}
