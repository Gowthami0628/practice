package day7_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99Project {
	
	WebDriver driver;
	
	@BeforeClass
	public void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("http://demo.guru99.com/v4/");
		
	}
	
	@Test(priority = 0)
	public void verifyTitleOfThePage() {
		
		String TitleOfThePage = driver.getTitle();
		System.out.println(TitleOfThePage);
		
	}
	@Test(priority = 1000)
	public void verifyLoginToGuru99() {
		String username= "mngr189631";
		String password = "gUvebAd";
    	WebElement userId = driver.findElement(By.name("uid"));
    	userId.sendKeys(username);
    	driver.findElement(By.name("password")).sendKeys(password);
    	driver.findElement(By.name("btnLogin")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
		
	}

}
