package Listeners;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestScripts.TestBase;
import io.qameta.allure.Allure;

public class ScreenshotListener implements ITestListener {
	
	@Override
    public void onTestFailure(ITestResult result) {

		TestBase tb =  (TestBase) result.getInstance();

        WebDriver driver;
		
			driver = tb.getDriver();
		

        if (driver != null) {

            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);

            Allure.addAttachment(
            	    "Failed Test Screenshot - " + result.getName(),
            	    "image/png",
            	    new ByteArrayInputStream(screenshot),
            	    ".png"
            	);
            
            System.out.println("Screenshot attached to Allure");

            System.out.println(
                    "Screenshot attached for: " +
                    result.getName()
            );
        }
    }

}
