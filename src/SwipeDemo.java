import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		MobileElement elems;
		driver = Base.Capabilities();
		TouchAction tp = new TouchAction(driver);
		// click views
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Views']")))
				.click();

		// date widgets
		new WebDriverWait(driver, 10).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Date Widgets']")))
				.click();

		// 2. Inline
		new WebDriverWait(driver, 10).until(ExpectedConditions
				.elementToBeClickable((MobileElement) driver.findElementByAndroidUIAutomator("text(\"2. Inline\")")))
				.click();

		// "9" in the clock face
		// new WebDriverWait(driver, 10).until(
		// ExpectedConditions.elementToBeClickable((MobileElement)
		// driver.findElementByAndroidUIAutomator("content-desc(9)")))
		// .click(); //not working! even with "content-desc(\"9\")"
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='9']")))
				.click(); // this worked!

		// swipe from 15 -> 45 in the clock hand
		tp.press(new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='15']"))))
				.waitAction(Duration.ofMillis(3000))
				.moveTo(new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@content-desc='45']"))))
				.release().perform();

	}

}
