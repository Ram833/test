package locate;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
//		 driver.get("http://automationpractice.com/index.php");
//		 driver.get("http://automationpractice.com/index.php");
		   
		  driver.get("http://demo.guru99.com/test/ajax.html");
		  driver.manage().window().maximize(); // maximize web page
		    List elements = (List) driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.countItems();i++){
		      System.out.println("Radio button text:" + ((java.util.List<WebElement>) elements).get(i).getAttribute("value"));
		    }

	}

}
