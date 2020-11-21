package locate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
//        String baseUrl = "http://demo.guru99.com/test/upload/";
//        
//
//        driver.get(baseUrl);
//        driver.manage().window().maximize();
//        WebElement uploadElement = driver.findElementById(("uploadfile_0"));
//
//        // enter the file path onto the file-selection input field
//        uploadElement.sendKeys("C:\\newhtml.html");
//
//        // check the "I accept the terms of service" check box
//        driver.findElementById(("terms")).click();
//
//        // click the "UploadFile" button
//        driver.findElementByName(("send")).click();
		
//		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
//		driver.get(baseUrl);
//		driver.manage().window().maximize();
//        WebElement downloadButton = driver.findElementById(("messenger-download"));
//        String sourceLocation = downloadButton.getAttribute("href");
//        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
//
//        try {
//        Process exec = Runtime.getRuntime().exec(wget_command);
//        int exitVal = exec.waitFor();
//        System.out.println("Exit value: " + exitVal);
//        } catch (Exception ex) {
//        System.out.println(ex.toString());
//        }
		
		
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();

		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");

		driver.findElementByXPath("//*[@id=\"ng-app\"]/body/div/div[2]/div[1]/input[1]").sendKeys("C:\\Users\\hi\\Downloads\\DailyReport-LEMANIC-10_10_2020-09_00_02");
		
	}

}
