package day6_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTesting {
	WebDriver driver;
	
	//we can call all 3 browser types are implementing a interface called webdriver
	
	public void invokeBrowser(String browsertype) throws Exception {
		
		if(browsertype.equalsIgnoreCase("chrome")) {

		System.setProperty("webdriver.chrome.driver",
				"G:\\edureka\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		}else if (browsertype.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.edge.driver",
					"G:\\edureka\\Downloads\\geckodriver-v0.24.0-win64");

			driver = new FirefoxDriver();
			
		}else {
			throw new Exception("Invalid broswer type");
		}	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/v4");
	}

}
