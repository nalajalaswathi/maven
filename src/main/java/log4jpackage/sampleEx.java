package log4jpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sampleEx {

	private static final Logger logger = Logger.getLogger(sampleEx.class.getName());
	
	public static void main(String[] args)
	{
		
		String log4jConfPath = System.getProperty("user.dir")+"/src/main/java/log4jpackage/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	
		  WebDriver driver = new FirefoxDriver();	
		  logger.info("firefox browser opened");
		  
	      driver.get("http://testingmasters.com/hrm/");
	      logger.info("testing masters url opened");
	      
	      driver.manage().window().maximize();
	      logger.info("window is maximized");
	      
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.findElement(By.id("txtUsername")).sendKeys("user01");
	      logger.info("usename is entered");
	      
	      driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
	      logger.info("password enterd");
	      
	      driver.findElement(By.id("btnLogin")).click();
	      logger.info("clicked on login button");
	}

}
