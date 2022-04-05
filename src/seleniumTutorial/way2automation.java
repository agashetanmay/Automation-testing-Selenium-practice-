package seleniumTutorial;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class way2automation {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
		
		@SuppressWarnings("deprecation")
		public static void main(String[] args){
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			driver.manage().window().maximize();
	        driver.get("http://demo.automationtesting.in/Register.html");
		    driver.findElement(By.xpath("//input[@placeholder = \"First Name\"]")).sendKeys("tanmay");
		    driver.findElement(By.xpath("//input[@placeholder = \"Last Name\"]")).sendKeys("agashe");
		    driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		    System.out.println("male is selected");
		   
		 
		    
		    System.out.println("Female is selected");
		    
		  List<WebElement>checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		   System.out.println(checkbox.size());
		    for(int i=0;i<checkbox.size();i++) {
		    	checkbox.get(i).click();
		    }
		   WebElement drop = driver.findElement(By.xpath("//Select[@id=\"Skills\"]"));
		    Select skills = new Select(drop);
		      skills.selectByVisibleText("Analytics");
		      
		      Actions act = new Actions(driver);
		      WebElement radio =  driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
			     radio.click();
		      act.click(radio).perform();
		    
		  
		    }
		
		    
		    
		    
		    
	}


