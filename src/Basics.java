import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		driver = Base.Capabilities();

		// xpath, id, className (css selector) and androidUIAutomator

		// driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		// //works!
		new WebDriverWait(driver, 10).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Preference']")))
				.click(); // works as well!

	}

}
