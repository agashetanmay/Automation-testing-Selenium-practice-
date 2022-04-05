package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginwebelement {
	private WebElement usn;
	private WebElement pass;
	private WebElement login;
	
	
   Loginwebelement(WebDriver driver){
	usn=driver.findElement(By.id("usn"));
	pass=driver.findElement(By.id("pwd"));
	login=driver.findElement(By.id("L"));}
   
   public void setUsername(String name) {
	   usn.sendKeys(name);
   }
	public void setPassword(String password) {
		pass.sendKeys(password);
	}
	public void clickloginbutton() {
		login.click();
	}
	public void cleartextbox() {
		usn.clear();
		pass.clear();
		
	}
	
}

