package day5_practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://jqueryui.com/");
	driver.findElement(By.linkText("Droppable")).click();
	//since the frame doesn`t have any id , we have defined the we element
	WebElement frameElement = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frameElement);
	Actions action = new Actions(driver);
	WebElement source = driver.findElement(By.id("draggable"));
	WebElement target = driver.findElement(By.id("droppable"));
	String colorBeforeDragNDrop = target.getCssValue("color");
	//action.dragAndDrop(source, target).build().perform();	
	action.moveToElement(target).clickAndHold().moveToElement(source).release().build().perform();
	String colorAfterDragNDrop = target.getCssValue("color");
	System.out.println("Before Drag and Drop :" +colorBeforeDragNDrop);
	System.out.println("After Drag and Drop :" +colorAfterDragNDrop);
}
}
