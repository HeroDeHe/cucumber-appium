package utils;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


/**
 * @author quoc tran
 *
 */
public class Settings {	
	
	public static AppiumDriver<WebElement> driver;
	
	@Before
	public static void setUpAppium() throws Exception {
		System.out.println("This will run before the Scenario");
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        
        //caps.setCapability("noReset", "true");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);		
	}
	
	@After
	public static void tearDown() {
		System.out.println("This will run after the Scenario");		
		driver.close();
	}
}
