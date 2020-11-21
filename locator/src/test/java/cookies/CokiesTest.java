package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CokiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://www.amazon.in/");
		  
		  driver.manage().window().maximize(); // maximize web page
		  
		  Set <Cookie> cookies =driver.manage().getCookies();
		  
		  System.out.println(cookies.size());

	}

}
