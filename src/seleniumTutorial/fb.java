package seleniumTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://fb.com");
		driver.findElement(By.name("firstname")).sendKeys("QSPIDER");
		driver.findElement(By.name("lastname")).sendKeys("Jspider");
		driver.findElement(By.name("reg_email__")).sendKeys("82659364");
		driver.findElement(By.name("reg_passwd__")).sendKeys("59863697852");
		WebElement birthday = driver.findElement(By.name("birthday_day"));
		Select b1=new Select(birthday);
		b1.selectByIndex(12);
		WebElement birthmonth = driver.findElement(By.name("birthday_month"));
		Select b2=new Select(birthmonth);
		b2.selectByValue("3");
		WebElement birthyear = driver.findElement(By.name("birthday_year"));
		Select b3=new Select(birthyear);
		b3.selectByVisibleText("2005");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='websubmit']"));
		driver.close();
		
		
	}

}
