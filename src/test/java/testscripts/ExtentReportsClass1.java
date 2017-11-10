package testscripts;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsClass1 
{
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeTest
	public void starttest(){
		//Calendar calendar = Calendar.getInstance();
		//SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/swathi_outputs.html", false);
	}
	
	public void gettest(ITestResult result)
	{
		if(result.getStatus() == ITestResult.SUCCESS){
		   test.log(LogStatus.PASS, result.getName() + "test is passed");
		}
		else if(result.getStatus() == ITestResult.FAILURE){
			test.log(LogStatus.FAIL, result.getName() + "test is failed and the reason is" + result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.SKIP){
			test.log(LogStatus.SKIP, result.getName() + "test is skipped and the reason is " + result.getThrowable());
		}
		else if(result.getStatus() == ITestResult.STARTED){
			test.log(LogStatus.INFO, result.STARTED + "test is started");
		}
	}
	@AfterMethod
	public void aftermethod(ITestResult result)
	{
		gettest(result);
	}
	@BeforeMethod
	public void beforemethod(Method result)
	{
		test = extent.startTest(result.getName());
		test.log(LogStatus.INFO, result.getName() + "test is started");
	}
	@AfterClass(alwaysRun = true)
	public void endtest()
	{
		extent.endTest(test);
		extent.flush();//genarates all ur test information to reports
	}
}

