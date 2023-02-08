package n_BasicTextScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import m_POMRepo.b01_02_01_LoginPage;
import m_POMRepo.b01_02_03_HomePage;

public class a01_02_02_ToVerifyHomePage {

	public static void main(String[] args) {
		String expectedTitle="Enter";
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		b01_02_01_LoginPage login= new b01_02_01_LoginPage(driver);
		login.loginAction("admin","manager");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		b01_02_03_HomePage home= new b01_02_03_HomePage(driver);
		String actualTitle=home.verifyTitle();
		
		if(actualTitle.contains(expectedTitle)) {
			System.out.println("Pass: The title is verified");
	}
		else {
			System.out.println("Fail: The title is not verified");
		}
		home.logoutAction();
		
		driver.quit();
		
	}
}
