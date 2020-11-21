package locate;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		  
		 driver.manage().window().maximize(); // maximize web page

//		 print the title
		JavascriptExecutor jexc =  (JavascriptExecutor) driver;
		String script = "return document.title;";
		String title = (String) jexc.executeScript(script);
		System.out.println(title);
		
//		click button
		driver.switchTo().frame("iframeResult");
		jexc.executeScript("myFunction()");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
//		scroll in webpage
		driver.navigate().to("https://www.w3schools.com/");
		WebElement certifiedButton = driver.findElementByXPath("/html/body/div[6]/div[12]/p/a");
		jexc.executeScript("arguments[0].scrollIntoView(true);", certifiedButton);
		
////		highlight
//		WebElement button = driver.findElementByXPath("/html/body/button");
//		jexc.executeScript("arguments[0].style.border='3px solid red", button);
		 
	}

}
