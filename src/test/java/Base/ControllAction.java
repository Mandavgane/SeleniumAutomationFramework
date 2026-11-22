package Base;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControllAction {
	protected  WebDriver driver;
	protected WebDriverWait wait;
	protected JavascriptExecutor js;
	
	public ControllAction(WebDriver driver) {
			this.driver= driver;
		
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		this.js= (JavascriptExecutor)driver;
		
	}

	protected  WebElement waitForElementToBeVisible(WebElement e) {
		return wait.until(ExpectedConditions.visibilityOf(e));
	}
	
	protected boolean isPageLoaded(WebElement el) {
		try {
			waitForElementToBeVisible(el);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	protected void scrolltoElement(WebElement el) {
	js.executeScript("arguments[0].scrollIntoView(true)", el);
	}
	
	
}
