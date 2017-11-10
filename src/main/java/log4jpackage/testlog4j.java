package log4jpackage;

import java.util.logging.Logger;

import org.testng.annotations.Test;

public class testlog4j extends testBase
{
  private static final Logger logger = Logger.getLogger(testlog4j.class.getName());
	
	    @Test
	    public void testLogin()
	    {
		
		  logger.info("staring login test");
		  logger.info("clicked on sign in button");
		  logger.info("enter user name");
		  logger.info("enter password");
		  logger.info("click on submit button");
		 
	   }

}
