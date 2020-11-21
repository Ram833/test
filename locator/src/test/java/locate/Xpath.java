package locate;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	
	ChromeDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void google() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//input[@name='q']").sendKeys("youtube"); 
//		driver.findElementByClassName("gNO89b").click();;
		driver.findElementByXPath("//input[@name='q']").sendKeys(Keys.ENTER);
	}

	@AfterTest
	public void down() {
		driver.close();
		driver.quit();
		System.out.println("completed");
	}
}
