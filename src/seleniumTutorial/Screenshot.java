package seleniumTutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		 File des = new File("C:\\Users\\Tanmay\\eclipse-workspace\\ACSA9\\photo\\p1.png");
		 FileUtils.copyFile(scr, des);
		  driver.close();

	}

	
}
