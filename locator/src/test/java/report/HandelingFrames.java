package report;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		  
		  driver.manage().window().maximize(); // maximize web page
		  driver.switchTo().frame("iframeResult");
		  driver.findElementByXPath("/html/body/button").click();
	}

}
