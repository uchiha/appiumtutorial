import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver;

		File holder = new File("src");
		File app = new File(holder, "ApiDemos-debug.apk");

		DesiredCapabilities caps = new DesiredCapabilities();
		// belows for my emulator
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5_API_24_1");

		// belows for my Sony Xperia XA1
		// caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		// caps.setCapability(MobileCapabilityType.UDID, "RQ3005MHH5");
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps); 
		return driver;
		// at this end, appium will wait for additional command for 6 sec

	}
	
	public static AndroidDriver<AndroidElement> atMobileApp() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver;

		// NOTE: https://discuss.appium.io/t/app-activity-is-not-available-in-mobilecapabilitytype/10691/2

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "nz.govt.at.atmobile");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "nz.govt.at.atmobile.MainActivity");

		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps); 
		return driver;
	}

}
