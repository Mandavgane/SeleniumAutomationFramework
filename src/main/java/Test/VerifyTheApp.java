package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VerifyTheApp {
	
	@Test
	public void verifyTheHomePage() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books?viewmode=grid");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='listbox']//a[contains(text(),'Gift Cards')]")));
		
		driver.findElement(By.xpath("//div[@class='listbox']//a[contains(text(),'Gift Cards')]")).click();
	}
	

}
