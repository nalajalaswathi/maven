import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import log4jpackage.testBase;


public class HRMlog4j extends testBase {
	
	 public Logger logger = Logger.getLogger("swathi");

	public static void main(String[] args) {
		  
		  FirefoxDriver driver=new FirefoxDriver();
		  
	      driver.get("http://testingmasters.com/hrm/");
	      
	      driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(By.id("txtUsername")).sendKeys("user01");
	      driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	      driver.findElement(By.id("btnLogin")).click();
	}

}
