package locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/login.html";	
		driver.manage().window().maximize();
        driver.get(baseUrl);					

        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement email = driver.findElementById(("email"));							

        // Get the WebElement corresponding to the Password Field		
        WebElement password = driver.findElementByName(("passwd"));							

        email.sendKeys("ram.chak833@gmail.com");					
        password.sendKeys("Princeneil@143");					
        System.out.println("Text Field Set");					
         
        // Deleting values in the text box		
        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					

        // Find the submit button		
        WebElement login = driver.findElementById(("SubmitLogin"));							
                    		
        // Using click method to submit form		
        email.sendKeys("ram.chak833@gmail.com");					
        password.sendKeys("Princeneil@143");					
        login.click();			
        System.out.println("Login Done with Click");					
        		
        //using submit method to submit the form. Submit used on password field		
        driver.get(baseUrl);					
        driver.findElementById(("email")).sendKeys("ram.chak833@gmail.com");							
        driver.findElementByName(("passwd")).sendKeys("Princeneil@143");							
        driver.findElementById(("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");					

	}

}
