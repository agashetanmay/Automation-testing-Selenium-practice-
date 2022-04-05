package automationdemo.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Switchtopage {
	WebDriver driver;

	public Switchtopage(WebDriver driver) {
		
		this.driver=driver;
	}
	By SwitchTo =By.xpath("//a[text()='SwitchTo']");
	By Alerts= By.xpath("//a[text()='Alerts']");
	By Windows = By.xpath("//a[text()='Windows']");
    By Frames = By.xpath("//a[text()='Frames']");
   
     
     public void switchtodrop() {
    	WebElement switchtodrop = driver.findElement(SwitchTo);
    	
       WebElement Alertdrop =  driver.findElement(Alerts);
    	Actions action = new Actions(driver);
    	action.moveToElement(switchtodrop).perform();
    	
    	action.moveToElement(Alertdrop).click().perform();
    	
     }
    	
     
     
}
