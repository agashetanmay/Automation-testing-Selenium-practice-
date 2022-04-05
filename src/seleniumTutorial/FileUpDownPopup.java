package seleniumTutorial;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpDownPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe" );
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
		    Thread.sleep(5000);
	      Robot r= new Robot();
	      //string selection class in java//
	      StringSelection filepath=new StringSelection("C:\\Users\\Tanmay\\Tanmay Automation (QA) testing resume.pdf");
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);////file path save to clipbord.
	      r.keyPress(KeyEvent.VK_CONTROL);
		  Thread.sleep(1000);
		  r.keyPress(KeyEvent.VK_V);
		  Thread.sleep(1000);
		  r.keyRelease(KeyEvent.VK_V);
		  Thread.sleep(1000);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  Thread.sleep(1000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  Thread.sleep(1000);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(5000);
		  System.out.println("file uploaded successfully**");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[@id='processTask']")).click();//convert the file from pdf to word
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[@id='pickfiles']")).click();//download the dile word file.
		  System.out.println("file downloaded successfully**");
		  driver.close();
		  
		  
		  
		 
		 
		////File f= new File("./resume/Tanmay Automation (QA) testing resume.pdf");
		//String absolutepath = f.getAbsolutePath();
		//System.out.println(absolutepath);

		
	}

}
