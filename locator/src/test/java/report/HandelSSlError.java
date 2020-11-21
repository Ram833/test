package report;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelSSlError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
//		to handel ssl errors
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions coptions = new ChromeOptions();
		coptions.merge(dc);

		ChromeDriver driver = new ChromeDriver(coptions);		
		driver.get("https://expired.badssl.com/");
		  
		 driver.manage().window().maximize(); // maximize web page
		 
		 

	}

}
