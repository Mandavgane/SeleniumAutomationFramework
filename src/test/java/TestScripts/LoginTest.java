package TestScripts;

import org.testng.annotations.Test;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ShoppingCart;

public class LoginTest extends TestBase{
	
	@Test
	public void login() {
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
	}
	
	
	

}
