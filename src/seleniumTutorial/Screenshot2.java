package seleniumTutorial;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot2 {
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://makemytrip.com");
		String ExpectedTitle="Google";
		String ActualTitle=driver.getTitle();
		if(ExpectedTitle.equals(ActualTitle)) {
			System.out.println("test is pass");
			
		}

		else {
			System.out.println("test is fails");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File ser = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("./photo/p3.png");
			FileUtils.copyFile(ser, des);
			
			
		}
		 driver.close();
	}

}
