package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ControllAction;
import io.qameta.allure.Step;

public class LoginPage extends ControllAction {
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators:
	By email = By.xpath("//input[@id='Email']");
	By passward = By.xpath("//input[@id='Password']");
	By btnLogin = By.xpath("//input[@value='Log in']");
	
	//Methods:
	public void waitforPageLoad() {
		isPageLoaded(driver.findElement(btnLogin));
	}
	
	@Step("Enter The Email")
	public void entrEmail() {
		driver.findElement(email).sendKeys("ram172@gmail.com");
	}
	
	@Step("Enter The Password")
	public void entrPassword() {
		driver.findElement(passward).sendKeys("Ram@123");
	}
	
	@Step("Click on Login button")
	public void clicklogInBtn() {
		driver.findElement(btnLogin).click();;
	}
	
}
