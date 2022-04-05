package seleniumTutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot1 {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://google.com");
		
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File des = new File("./photo/s2.png");
        FileUtils.copyFile(src, des);
        driver.close();
	}

}
