package locate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://automationpractice.com/index.php");
		  
		  driver.manage().window().maximize(); // maximize web page
		  
		  
		  // id & name locators
		  WebElement searchbox=driver.findElementById(("search_query_top"));
		  searchbox.sendKeys("T-shirts");
		  
		  driver.findElementByName(("submit_search")).click();

		  //linkText & partial linkText
		  driver.findElementByLinkText(("Printed Chiffon Dress")).click();
//		  driver.findElementByLinkText(("Chiffon Dress")).click();

	}

}
