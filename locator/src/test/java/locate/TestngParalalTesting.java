package locate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParalalTesting {
	
	WebDriver driver = null;
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("i am inside test 1"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void test2() throws InterruptedException {
		System.out.println("i am inside test 2"+Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.close();
	}

}
