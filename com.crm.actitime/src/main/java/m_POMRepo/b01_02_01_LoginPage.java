package m_POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b01_02_01_LoginPage {
	
	public b01_02_01_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement userNameTextField;
	
	@FindBy(name="pwd")
	WebElement passwordTextField;
	
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginButton;
	
	public void loginAction(String username, String password) {
		userNameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

}
