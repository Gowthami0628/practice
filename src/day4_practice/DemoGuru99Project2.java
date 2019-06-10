package day4_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class DemoGuru99Project2 {
		public static void main(String[] args) {
			Guru99Project guru = new Guru99Project();
			guru.invokeBrowser();
			guru.login("mngr189631", "gUvebAd");
			guru.addCustomer();
			String customerId = guru.getCustomerId();
			guru.addAccount(customerId);
			System.out.println(customerId);
			String AccountID = guru.getAccountId();
			System.out.println(AccountID);
		}
	}
