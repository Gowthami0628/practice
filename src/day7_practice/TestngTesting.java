package day7_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTesting {
	
	@Test(priority=0, enabled = true)
	public void testcase7() {
		System.out.println("Testcase 7");
	}
	@Test(priority=1,enabled = true)
	public void testcase1() {
		System.out.println("Testcase 1");
	}
	@Test(priority=-1,enabled = true)
	public void testcase8() {
		System.out.println("Testcase 8");
	}
	
	@Test(priority=2,enabled = true)
	public void testcase3() {
		System.out.println("Testcase 3");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before a Method");	
	}
	@AfterMethod
    public void afterMethod() {
    	System.out.println("After a Method");
	}
	@BeforeClass
    public void BeforeClass() {
    	System.out.println("First method to be executed when a class loads");
	}
	@AfterClass
    public void AfterClass() {
    	System.out.println("Last method to be executed in a class");
	} 
}
