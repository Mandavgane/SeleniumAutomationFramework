package TestScripts;

import org.testng.annotations.Test;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ShoppingCart;

public class BuyTheProduct extends TestBase{
	
	@Test
	public void buyTheProduct() {
		//Navigate to home page and click on Login link
		HomePage hp = new HomePage(getDriver());
		hp.waitForPageLoaded();
		hp.clickLoginLink();
		
		//Enter the Email Password On Login Page
		LoginPage lgp = new LoginPage(getDriver());
		lgp.waitforPageLoad();
		lgp.entrEmail();
		lgp.entrPassword();
		lgp.clicklogInBtn();
		
		//Select The Product and Click on Shopping cart Link
		hp.waitForPageLoaded();
		hp.clicklinkApparel_Shoes();
		hp.clickaddToCart_Blue_Jeans();
		System.out.println("Click on Shopping cart");
		hp.clicklinkShoppingCart();
		
		ShoppingCart sc = new ShoppingCart(getDriver());
		//Click on Term and Condition and Checkout button
		sc.waitforPageLoad();
		sc.clickcheckBoxTermandCond();
		sc.clickBtn_Checkout();
		
		CheckoutPage ckout= new CheckoutPage(getDriver());
		ckout.waitforPageLoad();
		ckout.click_btn_Continue_onBillingAddress();
		//ckout.click_checkBox_PickUpInStror();
		ckout.click_btn_Continue_onShippingAddress();
		ckout.click_btn_Continue_onShippingMethod();
		ckout.click_btn_Continue_onPaymentMethod();
		ckout.click_btn_Continue_onPaymentInfo();
		ckout.click_btn_Confirm();
	}
}
