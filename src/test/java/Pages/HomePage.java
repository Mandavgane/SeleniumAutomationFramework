package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ControllAction;
import io.qameta.allure.Step;

public class HomePage extends ControllAction{
	
	
	public HomePage (WebDriver driver) {
		super(driver);
	}
	//Locators:
	By linkLogin = By.xpath("//a[text()='Log in']");
	By linkApparel_Shoes = By.xpath("//div[@class='listbox']//a[contains(text(),'Apparel & Shoes')]");
	By addToCart_Blue_Jeans = By.xpath("(//input[@class='button-2 product-box-add-to-cart-button'])[3]");
	By linkShoppingCart = By.xpath("//span[text()='Shopping cart']");
	
	
	//Methods:
	
	public boolean waitForPageLoaded() {
		return isPageLoaded(driver.findElement(linkApparel_Shoes));
	}
	
	@Step("Click On Login link")
	public void clickLoginLink() {
		driver.findElement(linkLogin).click();
	}
	
	public void clicklinkApparel_Shoes() {
		driver.findElement(linkApparel_Shoes).click();
	}
	
	public void clickaddToCart_Blue_Jeans() {
		driver.findElement(addToCart_Blue_Jeans).click();
	}
	
	public void clicklinkShoppingCart() {
		driver.findElement(linkShoppingCart).click();
	}
	
}
