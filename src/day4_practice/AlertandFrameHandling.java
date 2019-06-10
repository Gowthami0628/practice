package day4_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertandFrameHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;
		
	        	System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
	        	driver = new ChromeDriver();
	        	driver.manage().window().maximize();
	        	driver.manage().deleteAllCookies();
	        	driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
	        	driver.switchTo().frame("iframeResult");
	        	//driver.switchTo().defaultContent();//switch back from a frame
	        	driver.findElement(By.tagName("button")).click();
	        	Thread.sleep(3000);
	        	Alert alert = driver.switchTo().alert();
	        	System.out.println(alert.getText());
	        	alert.accept();
	}

}
