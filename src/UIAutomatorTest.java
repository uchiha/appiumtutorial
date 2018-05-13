import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver;
		MobileElement elems;
		driver = Base.Capabilities();
		// Thread.sleep(10000);
		// findElementByAndroidUIAutomator("attribute("Value")");
		// driver.findElementByAndroidUIAutomator("text(\"Views\")").click(); //** both works!
		// driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

		new WebDriverWait(driver, 10).until(ExpectedConditions
				.elementToBeClickable((MobileElement) driver.findElementByAndroidUIAutomator("text(\"Views\")")))
				.click();
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.elementToBeClickable((MobileElement) driver.findElementByAndroidUIAutomator("text(\"Animation\")")))
				.click();

		// findElementByAndroidUIAutomator("new UiSelector().property(value)")
		// this stuff verifies if the elements have clickable properties
//		System.out.println(
//				"whats up: " + driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); // works

	}

}
