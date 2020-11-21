package locate;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;

public class DynamicWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
////		driver.get("https://www.asx.com.au/");
//		driver.manage().window().maximize();
//		
//		String beforeXpath = "//*[@id='customers']/tbody/tr[";
//		String afterxpath = "]/td[1]";
//		
//		for(int i=2; i<7; i++) {
//			String actualpath = beforeXpath+i+afterxpath;
//			WebElement element = driver.findElementByXPath(actualpath);
//			System.out.println(element.getText());
//		}
		
		
		driver.get("https://money.rediff.com/index.html");
		driver.manage().window().maximize();
		
		driver.findElementByXPath("//*[@id=\"div_nseindices\"]/div/div/p/a").click();
//		driver.findElementById("showMoreLess").click();
		
		WebElement webtable = driver.findElementByXPath("//table[@id='dataTable']//tbody");
		
		java.util.List<WebElement> rows = driver.findElementsByTagName("//tr");
		
		int countrows = rows.size();
		
		for(int i=0; i<countrows; i++) {
			java.util.List<WebElement> colums = rows.get(i).findElements(By.tagName("td"));
			
			int countcolumn = colums.size();
			
			for(int j=0; j<countcolumn; j++) {
				String text = colums.get(j).getText();
				System.out.println(text);
			}
		}
		
		System.out.println("finished");

	}
	

}
