package seleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S5 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println("1st page title: "+driver.getTitle());
		driver.get("http://www.fb.com");
		System.out.println("2nd page title: "+driver.getTitle());
		driver.navigate().to("http://www.flipkart.com");
		String src = driver.getPageSource();//fetches the html code of the the current webpage
		System.out.println(src);
		System.out.println("3rd page title: "+driver.getTitle());
		driver.navigate().to("http://www.amazon.com");//similar to get() method,enters url
		System.out.println("4th page title: "+driver.getTitle());

		driver.navigate().back();//goes to previous page
		driver.navigate().forward();//goes to next page
		driver.navigate().refresh();//refreshes the current page
		driver.close();

	}

}
