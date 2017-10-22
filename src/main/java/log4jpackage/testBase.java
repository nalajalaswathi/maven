package log4jpackage;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class testBase {
	public static final Logger logger = Logger.getLogger(testBase.class.getName());
	
	@BeforeTest
	public void loadlog4j()
	{
		String log4jConfPath = System.getProperty("user.dir")+"/src/test/java/log4JForSelenium/log4J.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

}
