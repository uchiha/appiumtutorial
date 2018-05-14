import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		MobileElement elems;
		driver = Base.Capabilities();
		TouchAction tp = new TouchAction(driver);
		// click views
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Views']")))
				.click();

		// Tap - tapping with a webelement inside is DEPRECATED!
		tp.tap(new WebDriverWait(driver, 10).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Expandable Lists']")))).perform();

		// click Drag and Drop
		// new WebDriverWait(driver, 10)
		// .until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Expandable
		// Lists']")))
		// .click();

		// click custom adapter
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']")))
				.click();

		// long press - DEPRECATED!
		tp.press(new WebDriverWait(driver, 10).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='People Names']"))))
				.waitAction(Duration.ofMillis(3000)).release().perform();

		System.out.println("it contains: \"" + new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/title"))).getText() + "\"");
	}

}
