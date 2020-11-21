package locate;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		 driver.get("http://automationpractice.com/index.php");
		  
		  driver.manage().window().maximize(); // maximize web page
		
		//className
		  int sliders=driver.findElementsByClassName(("homeslider-container")).size();
		  System.out.println(sliders);
		  
		  //TagName
		  int links=driver.findElementsByTagName(("a")).size();
		  System.out.println(links);

	}

}
