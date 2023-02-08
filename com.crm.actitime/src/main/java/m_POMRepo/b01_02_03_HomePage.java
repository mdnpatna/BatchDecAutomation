package m_POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b01_02_03_HomePage {
	WebDriver driver;

	public b01_02_03_HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(linkText="Logout")
	WebElement logoutlink;
	
	public String verifyTitle() {
		return driver.getTitle();
	}
	public void logoutAction() {
		logoutlink.click();
	}

}
