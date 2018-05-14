import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class MiscDriverMethods {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;
		MobileElement elems;
		driver = Base.Capabilities();
		TouchAction tp = new TouchAction(driver);
		// are you in dev env or any others?
		System.out.println("The current activity is: " + driver.currentActivity());
		// are you in webview, native or hybrid app?
		System.out.println("The context of this test is: " + driver.getContext());
		// orientation
		System.out.println("The orientation is: " + driver.getOrientation());
		// check if the device is locked
		System.out.println("Is it locked? " + driver.isLocked());

		// :)
		// driver.hideKeyboard();

		// click views
		new WebDriverWait(driver, 10)
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text='Views']")))
				.click();
		
		// pressing the back button on android!
		driver.pressKeyCode(AndroidKeyCode.BACK);

	}

}
