package locate;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String baseUrl = "http://www.facebook.com/"; 
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();	

//                driver.get(baseUrl); 
//                driver.manage().window().maximize();
//                WebElement link_Home = driver.findElementByLinkText(("Home"));
//                WebElement td_Home = driver
//                        .findElementByXPath(("//html/body/div"
//                        + "/table/tbody/tr/td"
//                        + "/table/tbody/tr/td"
//                        + "/table/tbody/tr/td"
//                        + "/table/tbody/tr"));    
//                 
//                Actions builder = new Actions(driver);
//                Action mouseOverHome = builder
//                        .moveToElement(link_Home)
//                        .build();
//                 
//                String bgColor = td_Home.getCssValue("background-color");
//                System.out.println("Before hover: " + bgColor);        
//                mouseOverHome.perform();        
//                bgColor = td_Home.getCssValue("background-color");
//                System.out.println("After hover: " + bgColor);
		
		
		driver.get(baseUrl);
		WebElement txtUsername = driver.findElementById(("email"));

		Actions builder = new Actions(driver);
		Action seriesOfActions = builder
			.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build();
			
		seriesOfActions.perform() ;

	}

}
