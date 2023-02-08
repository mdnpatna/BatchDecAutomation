package genericUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class a07_02_04_BaseClass {
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data base connection has been established");
	}
	@BeforeClass
	public void bcConfig() {
		System.out.println("The browser has been launched");
		System.out.println("navigated to url successfully");
	}
	@BeforeMethod
	public void bmConfig() {
		System.out.println("Logged in successfully");
		
	}
	@AfterMethod
	public void amConfig() {
		System.out.println("Logged out successfully");
		
	}
	@AfterClass
	public void acConfig() {
		System.out.println("Browser has been closed");
		
	}
	@AfterSuite
	public void asConfig() {
		System.out.println("Data Base has been closed");
		
	}

}
