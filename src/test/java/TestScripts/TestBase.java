package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase  {
	public   ThreadLocal<WebDriver> driver =
            new ThreadLocal<>(); ;
	@BeforeMethod
	public void setup() {
		
		driver.set(new ChromeDriver()); 
		  getDriver().get("https://demowebshop.tricentis.com/books?viewmode=grid");
		  getDriver().manage().window().maximize();	
	}
	
	public WebDriver getDriver() {
		return driver.get();
	}
	
	@AfterMethod
	public void tearDown() {
		if(getDriver()!=null) {
			getDriver().quit();
			driver.remove();
		}
	}
	
}
