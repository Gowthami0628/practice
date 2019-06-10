package caseStudy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


   public class CaseStudy5 {
	
	  ChromeDriver driver;
	  
   public void invokeBrowser() {
		
	System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
   	driver = new ChromeDriver();
   	driver.manage().window().maximize();
   	driver.manage().deleteAllCookies();
   	driver.get("https://www.edureka.co/");
   	driver.manage().timeouts().pageLoadTimeout(35, TimeUnit.SECONDS);
   	driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		
	}
    public void Login(String username , String password) {
    	    driver.findElement(By.linkText("Log In")).click();
    	    waitTillElementVisible(20,By.id("si_popup_email"));
        	driver.findElement(By.id("si_popup_email")).sendKeys(username);
        	driver.findElement(By.id("si_popup_passwd")).sendKeys(password);
        	driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
    }
    private void waitTillElementVisible(int timeOutInSeconds , By locator) {
        		
        	WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	    		
    }    	
    public void clickonMyProfile() {
        	driver.findElement(By.xpath("//a[@class ='dropdown-toggle trackButton']")).click();
        	waitTillElementVisible(10,By.linkText("My Profile"));
        	driver.findElement(By.linkText("My Profile")).click();
    }
    public void UpdateProfessionalDetails(String indus , String currjob) {
    	   driver.findElement(By.xpath("//a[@id='professional_details']/i[@class='icon-pr-edit']")).click();
    	   waitTillElementVisible(10,By.xpath("//input[@name='companyName']"));
    	   WebElement companyname = driver.findElement(By.xpath("//input[@name='companyName']"));
		   companyname.clear();
    	   companyname.sendKeys("changingsoon");
    	   waitTillElementVisible(10,By.xpath("//select[@name='currentIndustry']"));
    	   WebElement selIndustry = driver.findElement(By.xpath("//select[@name='currentIndustry']"));
		   Select industry = new Select(selIndustry);   
		   industry.selectByVisibleText(indus);
		   waitTillElementVisible(10,By.xpath("//select[@name='currentjob']"));
		   WebElement currentjob = driver.findElement(By.xpath("//select[@name='currentjob']"));
		   Select cjob = new Select(currentjob);
		   cjob.selectByVisibleText(currjob);
		   waitTillElementVisible(10,By.xpath("//input[@name='userSkill']"));
		   WebElement skill = driver.findElement(By.xpath("//input[@name='userSkill']"));
		   skill.clear();
		   skill.sendKeys("automation");
		   waitTillElementVisible(10,By.xpath("//button[text()='Next']"));
    	   driver.findElement(By.xpath("//button[text()='Next']")).click();
    }
    public void UpdatePersonalDetails() {
 	       //driver.findElement(By.xpath("//a[@class='success active-link']']")).click();
 	       driver.findElement(By.xpath("//li[@class='onboarding-tabs personal-details-tab']/a[@data-toggle='tab']")).click();
		   driver.findElement(By.xpath("//button[text()='Next']")).click();
 }
}


