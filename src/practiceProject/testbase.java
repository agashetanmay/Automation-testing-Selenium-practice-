package practiceProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbase {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Register page = new Register(driver);
		
		page.firstname("tanmay");
		Thread.sleep(5000);
		page.lastname("agashe");
		Thread.sleep(5000);
		page.femaleradiobutton();
		Thread.sleep(5000);
		page.maleradiobutton();
		Thread.sleep(5000);
		page.checkbox();
		Thread.sleep(5000);
		page.dropdown();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
