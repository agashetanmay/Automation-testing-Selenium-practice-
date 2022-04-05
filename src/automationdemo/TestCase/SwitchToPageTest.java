package automationdemo.TestCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import automationdemo.PageObject.Switchtopage;

public class SwitchToPageTest extends BaseClass {
	
	
	@Test
	public void switchtopage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		Switchtopage sw = new Switchtopage(driver);
	    sw.switchtodrop();
	    
		Thread.sleep(5000);
	}
	
	

}
