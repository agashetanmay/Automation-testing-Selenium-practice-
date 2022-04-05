package seleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Filedownloadpopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://telegram.org/");
		driver.findElement(By.xpath("//a[@class='tl_main_download_desktop_link tl_main_download_link_td']")).click();
		driver.findElement(By.xpath("//a[@class='td_download_btn']")).click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.close();
	}

}
