package m_POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class b02_02_01_Demo {
	public b02_02_01_Demo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement UN;
	
	@FindBy(name="pwd")
	WebElement pwd;
	
	@FindBy(xpath="//div[text()='Login ']")
	WebElement loginButton;
	
	@FindBy(id="container_tasks")
	WebElement taskButton;
	
	@FindBy(xpath="//div[text()='Add New']")
	WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	WebElement createNewCust;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	WebElement custName;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	WebElement createCust;
	public void action(String username, String password, String customerName) throws InterruptedException {
		UN.sendKeys(username);
		pwd.sendKeys(password);
		loginButton.click();
		taskButton.click();
		addNewButton.click();
		createNewCust.click();
		Thread.sleep(2000);
		custName.sendKeys(customerName);
		createCust.click();
	}
	
	

}
