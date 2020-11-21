package locate;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
//		 driver.get("http://automationpractice.com/index.php");
		 driver.get("https://www.facebook.com/");
		  
		  driver.manage().window().maximize(); // maximize web page
		  
		//Tag & ID
//		  driver.findElementByCssSelector(("input#email")).sendKeys("ram.chak833@gmail.com");
//		  driver.findElementByClassName("VfPpkd-RLmnJb").click();
		  
		  // Tag & Class
		  //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("John");
		  //driver.findElement(By.cssSelector(".inputtext")).sendKeys("John");
		  
		  //Tag & attribute
		  //driver.findElement(By.cssSelector("[name=email]")).sendKeys("Smith");
		  //driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Smith");
		 
		  //Tag , class & attribute
		  driver.findElementByCssSelector(("input.inputtext[data-testid=royal_email]")).sendKeys("ramchakraborty@yahoo.in");
		  driver.findElementByCssSelector(("input.inputtext[data-testid=royal_pass]")).sendKeys("Princeneil@1234");
		  driver.findElementById("u_0_b").click();;

	}

}
