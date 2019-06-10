package day3_practice;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChrome {
		ChromeDriver driver;
        
   public void invokeBrowser() {
        	
        	System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
        	driver = new ChromeDriver();
        	Dimension dim = new Dimension(1020, 1080);
        	driver.manage().window().setSize(dim);
        	//driver.manage().window().maximize();
        	driver.manage().deleteAllCookies();
        	driver.get("https://qatechhub.com");
        }
   public void printTitle() {
	   
	   String titleOfThePage = driver.getTitle();
	   System.out.println("Title of the page:" + titleOfThePage);
   }
   
   public void navigateCommands() {
	   
	   driver.navigate().to("https://facebook.com");
	   driver.navigate().back();
	   driver.navigate().forward();
	   driver.navigate().refresh();   
   }
   
  public void closeBrowser() {
	   
	   driver.close();//closes current active window  
	   //driver.quit();//closes all windows 
	   
   }

   }
