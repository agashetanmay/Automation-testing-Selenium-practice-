package automationdemo.PageObject;

	import java.util.List;
	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

	public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}
	By firstname =By.xpath("//input[@placeholder = \"First Name\"]");
	By lastname= By.xpath("//input[@placeholder = \"Last Name\"]");
	By maleradiobutton = By.xpath("//input[@value=\"Male\"]");
	By femaleradiobutton = By.xpath("//input[@value=\"FeMale\"]");
	By dropdown =By.xpath("//Select[@id=\"Skills\"]");

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
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		   System.out.println(checkbox.size());
		    for(int i=0;i<checkbox.size();i++) {
		    	checkbox.get(i).click();
		    	
		    }    
	}
	public void dropdown(String title)  {
		 WebElement drop = driver.findElement(dropdown);
		    Select skills = new Select(drop);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", drop);
		      skills.selectByVisibleText("title");
	}
		     
	public void dropdown(int value)  {
		 WebElement drop = driver.findElement(dropdown);
		    Select skills = new Select(drop);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", drop);
		      skills.selectByIndex(value);
		    
	}
	}


