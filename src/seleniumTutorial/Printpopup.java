package seleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Printpopup {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/?gws_rd=ssl");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(3000);
		driver.close();
		
	}

}
