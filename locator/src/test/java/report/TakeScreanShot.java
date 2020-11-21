package report;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreanShot {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		  
		 driver.manage().window().maximize(); // maximize web page
		 
		 takeSnapShot(driver, "E://test.jpg") ;

	}
	
	 public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot

	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	                File DestFile=new File(fileWithPath);

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, DestFile);

	    }

}
