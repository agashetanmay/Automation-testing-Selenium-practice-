package seleniumTutorial;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupalerts {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");

		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

		Alert alert = driver.switchTo().alert();
		
		String print = alert.getText();

		System.out.println(print);
	
		alert.accept();
		
	driver.close();
		
	}

}
//JAVASCRIPTPOPUP