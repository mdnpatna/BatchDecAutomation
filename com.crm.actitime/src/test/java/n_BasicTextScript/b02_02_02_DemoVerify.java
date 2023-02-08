package n_BasicTextScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import m_POMRepo.b02_02_01_Demo;
import m_POMRepo.b01_02_03_HomePage;

public class b02_02_02_DemoVerify {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		
		b02_02_01_Demo way=new b02_02_01_Demo(driver);
		way.action("admin","manager","Akash1");
		
		b01_02_03_HomePage lo=new b01_02_03_HomePage(driver);
		lo.logoutAction();
		
		
	}

}
