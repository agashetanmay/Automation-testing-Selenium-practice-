package practiceProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register {
WebDriver driver;

public Register(WebDriver driver) {
	
	this.driver=driver;
}
By firstname =By.xpath("//input[@placeholder = \"First Name\"]");
By lastname= By.xpath("//input[@placeholder = \"Last Name\"]");
By maleradiobutton = By.xpath("//input[@value=\"Male\"]");
By femaleradiobutton = By.xpath("//input[@value=\"FeMale\"]");

public void firstname(String user) {
	driver.findElement(firstname).sendKeys(user);
}
public void lastname(String user) {
	driver.findElement(lastname).sendKeys(user);
}
public void maleradiobutton() {
	driver.findElement(maleradiobutton).click();
}
public void femaleradiobutton() {
	driver.findElement(femaleradiobutton).click();
}
public void checkbox() {
	 List<WebElement>checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
	   System.out.println(checkbox.size());
	    
	    for(int i=0;i<checkbox.size();i++) {
	    	checkbox.get(i).click();
	    }    
}
public void dropdown() {
	 WebElement drop = driver.findElement(By.xpath("//Select[@id=\"Skills\"]"));
	    Select skills = new Select(drop);
	      skills.selectByVisibleText("Analytics");
}
}
