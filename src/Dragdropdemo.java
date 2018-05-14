import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Dragdropdemo {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		MobileElement elems;
		driver = Base.Capabilities();
		TouchAction tp = new TouchAction(driver);

		// click views
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Views']")))
				.click();

		// Click drag and drop
		new WebDriverWait(driver, 10).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Drag and Drop']")))
				.click();

		// drag and drop 1st dot to 3rd dot
//		tp.longPress(new WebDriverWait(driver, 10)
//				.until(ExpectedConditions.elementToBeClickable(By.id("io.appium.android.apis:id/drag_dot_1"))))
//				.moveTo(new WebDriverWait(driver, 10)
//						.until(ExpectedConditions.elementToBeClickable(By.id("io.appium.android.apis:id/drag_dot_3"))))
//				.release().perform(); // this works, another approach is below, just getting elements of similar class
		
		tp.longPress(new WebDriverWait(driver, 10)
				.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("android.view.View"))).get(0))
				.moveTo(new WebDriverWait(driver, 10)
						.until(ExpectedConditions.elementToBeClickable(By.id("io.appium.android.apis:id/drag_dot_3"))))
				.release().perform();

	}

}
