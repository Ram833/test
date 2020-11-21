package locate;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";					
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);	
        driver.manage().window().maximize();
        //click on the "Facebook" logo on the upper left portion		
			driver.findElementByCssSelector(("a[title=\"Go to Facebook home\"]")).click();					

			//verify that we are now back on Facebook's homepage		
			if (driver.getTitle().equals("Facebook-log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }		

	}

}
