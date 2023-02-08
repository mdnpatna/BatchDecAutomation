package n_BasicTextScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import m_POMRepo.b01_02_01_LoginPage;
import m_POMRepo.b01_02_03_HomePage;

public class b06_02_04_ToVerifyHomePage {
	@Test

	public void b06_02_04_ToVerifyHomePage() {
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
		
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Pass: The title is verified");
		home.logoutAction();
		
		driver.quit();
		
	}
}
