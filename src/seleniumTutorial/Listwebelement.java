package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listwebelement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/ajax.html");
		    java.util.List<WebElement> ele = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +ele.size());

		    for (int i=0; i<ele.size();i++){
		      System.out.println("Radio button text:" + ele.get(i).getAttribute("value"));
		    }
		  }
		
	}


