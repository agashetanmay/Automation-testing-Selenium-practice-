package seleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S2 {
	static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
		}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");//enter the url
		String title= driver.getTitle();
	System.out.println("title:"+title);
	     String url = driver.getCurrentUrl();//fetches the present url of the page
	      System.out.println("url:"+url);
		driver.close();//closes the chrome browser

		
	}

}
