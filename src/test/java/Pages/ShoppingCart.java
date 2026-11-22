package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ControllAction;

public class ShoppingCart extends ControllAction{
	
	public ShoppingCart(WebDriver driver) {
		super(driver);
	}
	
	//Locators:
	By textShoppingCart=By.xpath("//h1[text()='Shopping cart']");
	By checkBoxTermandCond=By.xpath("//input[@id='termsofservice']");
	By btn_CheckOut=By.xpath("//button[@id='checkout']");
	
	//Action
	public void waitforPageLoad() {
	isPageLoaded(driver.findElement(textShoppingCart));
	}
	
	public void clickcheckBoxTermandCond() {
		driver.findElement(checkBoxTermandCond).click();
		}
	
	public void clickBtn_Checkout() {
		driver.findElement(btn_CheckOut).click();
		}
	
	
}
