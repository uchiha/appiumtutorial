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

		// click preference
		new WebDriverWait(driver, 10).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Preference']")))
				.click(); // works as well!

		// click 3. Preference dependencies
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")))
				.click();

		// click Wi-Fi tickbox
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("android:id/checkbox")))
				.click();

		// click wifi settings
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.RelativeLayout)[2]")))
				.click();

		// send some text in the pop up
		// new WebDriverWait(driver, 10).until(
		// ExpectedConditions.elementToBeClickable(By.id("android:id/edit"))).sendKeys("NoMatch");
		// //works but slow
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")))
				.sendKeys("NoMatch"); // slow too... :(

		// click ok android.widget.Button
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.widget.Button")))
				.get(1).click();

	}

}
