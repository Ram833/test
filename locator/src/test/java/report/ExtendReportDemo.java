package report;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportDemo {
	
	@Test
	public void loginTest() throws IOException {
		
		System.out.println("login to amazon");
		
		ExtentHtmlReporter report = new ExtentHtmlReporter("./Reports/htmlreport.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		ExtentTest logger = extent.createTest("LoginTest");
		
		logger.log(Status.INFO, "Login to amazon");
		
		logger.log(Status.PASS, "Title verified");
		
		extent.flush();
		
		ExtentTest logger2 = extent.createTest("logoff test");
				
		logger2.log(Status.FAIL, "Title verified");
		
//		logger2.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		
//		logger2.addScreenCaptureFromPath("Users/hi/Desktop/logo.jpg");
		
		extent.flush();
		
		
	}

}
