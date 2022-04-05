package seleniumTutorial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S11 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		driver.findElement(By.tagName("input")).sendKeys("C++ Tutorial");  
        WebElement l1 = driver.findElement(By.tagName("a"));
        System.out.println(l1.getText());
     
        driver.findElement(By.linkText("This is a link")).click();
       
       List<WebElement> l2 = driver.findElements(By.linkText("This is a link"));
        System.out.println(l2.size());
        
        driver.findElement(By.tagName("button")).click();    
		driver.close();
	}

}
