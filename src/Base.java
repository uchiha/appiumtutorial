import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File holder = new File("src");
		File app = new File(holder, "ApiDemos-debug.apk");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		// belows for my emulator
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5_API_24_1");
		
		// belows for my Sony Xperia XA1
//		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
//		caps.setCapability(MobileCapabilityType.UDID, "RQ3005MHH5");
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        
        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        
        
	}

}
