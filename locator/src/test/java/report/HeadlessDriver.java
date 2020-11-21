package report;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.PhantomJsDriverManager;

public class HeadlessDriver {

	@Test
	public void boom() {
		// TODO Auto-generated method stub
		
		System.setProperty("phantomjs.binary.path", "C:\\Users\\hi\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin]]phantomjs.exe");
		
//		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("http://www.facebook.com");
		  
		 driver.manage().window().maximize(); // maximize web page

		 driver.findElement(By.xpath("WebDriver driver = new PhantomJSDriver();")).sendKeys("www.facebook.com");
		 driver.findElement(By.xpath("WebDriver driver = new PhantomJSDriver();")).sendKeys(Keys.ENTER);
		 System.out.println("it is finished...............");
	}

}
