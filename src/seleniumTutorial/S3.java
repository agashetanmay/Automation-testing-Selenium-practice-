package seleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}


	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.fb.com");
		String src = driver.getPageSource();//fetches the html code of the the current webpage
		System.out.println(src);
		driver.close();

	}

}
