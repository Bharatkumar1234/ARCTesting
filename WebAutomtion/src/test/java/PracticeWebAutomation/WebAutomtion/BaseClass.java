package PracticeWebAutomation.WebAutomtion;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {
	public AndroidDriver driver;
	@Test
	public void setup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps= new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "OnePlus EB2101");
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("ignoreHiddenApiPolicyError", true);
		caps.setCapability("app", "C:\\Users\\admin\\Downloads\\ApiDemos-debug.apk");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
		
		Thread.sleep(5000);
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Access'ibility\"]")).click();
	
	}

}
