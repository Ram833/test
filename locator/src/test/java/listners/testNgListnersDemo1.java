package listners;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

@Listeners(listners.TestNgListners.class)
public class testNgListnersDemo1 {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
//		System.setProperty("webdriver.chrome.driver", "usr.dir/Drivers/chrome/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.findElementByXPath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys("selenium tutorial");
		driver.findElementByXPath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input").sendKeys(Keys.ENTER);

	}
	
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("this is skiped test");
	}
}
