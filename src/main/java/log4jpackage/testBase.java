package log4jpackage;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeTest;

public class testBase {
	
	private static Logger logger = Logger.getLogger(testBase.class.getName());
	
	@BeforeTest
	public void loadlog4j()
	{
		String log4jConfPath = System.getProperty("user.dir")+"/src/main/java/log4jpackage/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
	}

}
