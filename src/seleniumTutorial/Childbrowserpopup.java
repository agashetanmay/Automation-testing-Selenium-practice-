package seleniumTutorial;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String winhand = driver.getWindowHandle();
		Set<String> winhands = driver.getWindowHandles();
		for(String a :winhands){
		
			if(a.equals(winhand)){
		}
		
		else{
		    Thread.sleep(3000);
		 WebDriver win = driver.switchTo().window(a);
             win.close();
		}
	}   

}
}