package caseStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {
	
	public static void main(String[] args) {
		//1. Launch Chrome browser using Selenium WebDriver
		System.setProperty("webdriver.chrome.driver", "G:\\edureka\\Downloads\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		//2. Navigate to “https://www.edureka.co/”
		driver.get("https://www.edureka.co/");
		//3. Maximise the Browser Window
		driver.manage().window().maximize();
		//4. Inspect the search box with text “Search for a Course”
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='close close_exit_popup']")).click();
		driver.findElement(By.id("search-inp")).sendKeys("Search for a Course");
		driver.findElement(By.id("typeahead__button")).click();
		driver.quit();
		/*
		 * 5. Get attributes id, name, xpath, class name, css values 6. Inspect the “Log
		 * In” link to get the link text and partial link text
		 */
		
		
	}
	

}
