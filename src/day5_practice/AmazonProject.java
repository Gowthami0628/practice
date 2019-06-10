package day5_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class AmazonProject {
			ChromeDriver driver;
			public void invokeBrowser() {
			
			System.setProperty("webdriver.chrome.driver", "G:/edureka/Downloads/chromedriver_win32/Chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
			}
	public void searchProduct(String product , String category) {
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(product);
			WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
			Select selectDropdown = new Select(dropdown);
			selectDropdown.selectByVisibleText(category);
			driver.findElement(By.xpath("//input[@value='Go']")).click();
			String result =driver.findElement(By.xpath("//span[text()='1-24 of over 4,000 results for']")).getText();
			System.out.println(result);
			}
	public String getNthProduct(int ProductNumber) {
			String productXpath = String.format("//div[@class='s-result-list sg-row']/div[@data-index='%d']", ProductNumber);
		    return driver.findElement(By.xpath(productXpath)).getText();
			}

	public void getAllProducts() {
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']/div"));
		for(WebElement product : allProduct) {
			System.out.println(product.getText());
			System.out.println("-----------------");
			}	
			}
	public void getAllProductsViaScrolldown() {
			List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']/div"));
			Actions action = new Actions(driver);
			for(WebElement product : allProduct) {
			action.moveToElement(product).build().perform();
			System.out.println(product.getText());
			System.out.println("-----------------");
				}	
				}
	public void getAllProductsViaScrolldownUsingJavaSript() {
		List<WebElement> allProduct = driver.findElements(By.xpath("//div[@class='s-result-list sg-row']/div"));
		int x;int y;
		for(WebElement product : allProduct) {
			x =product.getLocation().x;
			y =product.getLocation().y;
			scrollBy(x, y);
		System.out.println(product.getText());
		System.out.println("-----------------");
			}	
			}
	private void scrollBy(int x,int y) {
		JavascriptExecutor jsEngine;
	    String jsCommand = String.format("window.scrollBy(%d,%d)", x,y);
	    jsEngine = (JavascriptExecutor) driver;
	    jsEngine.executeScript(jsCommand);
	}
	}