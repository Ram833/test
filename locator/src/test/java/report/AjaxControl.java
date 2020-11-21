package report;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class AjaxControl {
	
	public ChromeDriver driver;
	
  @Test
  public void f() {
	  
	  driver.findElementByXPath(("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Automation step by step guide");
	  driver.findElementByXPath(("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
	  driver.close();
	  driver.quit();
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  
//	  please see implicet and explicit wait
	  
  }

}
