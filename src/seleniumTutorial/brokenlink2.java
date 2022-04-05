package seleniumTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink2 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );	
	}
	static int count = 0;
	static String Careers = "https://www.amazon.jobs";
	
	       
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.amazon.com/");
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		  Iterator<WebElement> it =links.iterator();
		  
		  while(it.hasNext()) {
			 
			String url = it.next().getAttribute("href");
			  
		  ArrayList<String> URL = new ArrayList<String>();
		   URL.add(url);
		   
		   for(String l:URL) 
			   
			   System.out.println(l);
		   count++;
		  }
		  System.out.println("total link present on the amazon page is :"+count);
		
		  
		driver.close();	
	}
}


