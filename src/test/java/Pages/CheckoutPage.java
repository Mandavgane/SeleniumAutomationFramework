package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.ControllAction;

public class CheckoutPage extends ControllAction {
	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators:
	By btn_Continue_onBillingAddress = By.xpath("(//input[@title='Continue'])[1]");
	By btn_Continue_onShippingAddress = By.xpath("(//input[@value='Continue'])[2]///");
	By btn_Continue_onShippingMethod = By.xpath("(//input[@value='Continue'])[3]");
	By btn_Continue_onPaymentMethod = By.xpath("(//input[@value='Continue'])[4]");
	By btn_Continue_onPaymentInfo = By.xpath("(//input[@value='Continue'])[5]");
	By checkBox_PickUpInStror = By.xpath("//input[@id='PickUpInStore']");
	By btn_Confirm = By.xpath("//input[@value='Confirm']");
	
	//Actions:
	
	public void waitforPageLoad() {
		isPageLoaded(driver.findElement(btn_Continue_onBillingAddress));
		}
		
	public void click_btn_Continue_onBillingAddress() {
		driver.findElement(btn_Continue_onBillingAddress).click();
	}
	
	public void click_btn_Continue_onShippingAddress() {
		waitForElementToBeVisible(driver.findElement(btn_Continue_onShippingAddress));
		driver.findElement(btn_Continue_onShippingAddress).click();
	}
	
	public void click_btn_Continue_onShippingMethod() {
		waitForElementToBeVisible(driver.findElement(btn_Continue_onShippingMethod));
		driver.findElement(btn_Continue_onShippingMethod).click();
	}
	
	public void click_btn_Continue_onPaymentMethod() {
		waitForElementToBeVisible(driver.findElement(btn_Continue_onPaymentMethod));
		scrolltoElement(driver.findElement(btn_Continue_onPaymentMethod));
		driver.findElement(btn_Continue_onPaymentMethod).click();
	}
	
	public void click_btn_Continue_onPaymentInfo() {
		waitForElementToBeVisible(driver.findElement(btn_Continue_onPaymentInfo));
		scrolltoElement(driver.findElement(btn_Continue_onPaymentInfo));
		driver.findElement(btn_Continue_onPaymentInfo).click();
	}
	
	public void click_checkBox_PickUpInStror() {
		waitForElementToBeVisible(driver.findElement(checkBox_PickUpInStror));
		driver.findElement(checkBox_PickUpInStror).click();
	}
	
	public void click_btn_Confirm() {
		waitForElementToBeVisible(driver.findElement(btn_Confirm));
		scrolltoElement(driver.findElement(btn_Confirm));
		driver.findElement(btn_Confirm).click();
	}
	
	
}
