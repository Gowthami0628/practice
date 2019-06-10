package day4_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Guru99Project {
		
		ChromeDriver driver;
		
    public void invokeBrowser() {
        	
        	System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
        	driver = new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.manage().deleteAllCookies();
        	driver.get("http://demo.guru99.com/v4/");
        }
    
    public void login(String userId, String userPassword) {
    	WebElement userIdElement;
    	userIdElement = driver.findElement(By.name("uid"));
    	userIdElement.sendKeys(userId);
    	driver.findElement(By.name("password")).sendKeys(userPassword);
    	driver.findElement(By.name("btnLogin")).click();
    	
    }
    
    public void addCustomer() {
    	driver.findElement(By.linkText("New Customer")).click();
    	driver.findElement(By.name("name")).sendKeys("Gowthami");
    	driver.findElement(By.xpath("//input[@value='m']")).click();
    	driver.findElement(By.name("dob")).sendKeys("13-04-2019");
    	driver.findElement(By.name("addr")).sendKeys("NereducherlasuryapetIndia");
    	driver.findElement(By.name("city")).sendKeys("Nereducherla");
    	driver.findElement(By.name("state")).sendKeys("Hyderabad");
    	driver.findElement(By.name("pinno")).sendKeys("508218");
    	driver.findElement(By.name("telephoneno")).sendKeys("88886142100");
    	String emailID = "Gowthami" + System.currentTimeMillis() + "@gmail.com";
    	driver.findElement(By.name("emailid")).sendKeys(emailID);
    	driver.findElement(By.name("password")).sendKeys("abcd1234");
    	driver.findElement(By.name("sub")).click();
    	
    } 
    public String getCustomerId() {
    	return driver.findElement(By.xpath("//table[@id='customer']/tbody/tr[4]/td[2]")).getText();
    	
    }
    
    public void addAccount(String customerId) {
    	driver.findElement(By.linkText("New Account")).click();
    	driver.findElement(By.name("cusid")).sendKeys(customerId);
    	WebElement dropdown = driver.findElement(By.name("selaccount"));
    	Select selAccount = new Select(dropdown);
    	selAccount.selectByVisibleText("Savings");
    	driver.findElement(By.name("inideposit")).sendKeys("53624");
    	boolean isMultipleflag = selAccount.isMultiple();
    	System.out.println(isMultipleflag);
    	driver.findElement(By.name("button2")).click();	
    }
    public String getAccountId() {
		return driver.findElement(By.xpath("//table[@id='account']/tbody/tr[4]/td[2]")).getText();
    	
    	
    	
    }
	}
