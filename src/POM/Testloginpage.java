package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testloginpage {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
      
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Tanmay/Desktop/B.html");
		Loginwebelement l1=new Loginwebelement(driver);
		l1.setUsername("tanmau");
		l1.setPassword("123456");
		Thread.sleep(3000);
		l1.clickloginbutton();
		l1.cleartextbox();
		Thread.sleep(3000);
		l1.setUsername("MDL");
		l1.setPassword("2020");
		l1.clickloginbutton();
		l1.cleartextbox();
		Thread.sleep(3000);
		l1.setUsername("");
		l1.setPassword("");
		l1.clickloginbutton();
		Thread.sleep(3000);
		
		
		driver.close();
	}

}
