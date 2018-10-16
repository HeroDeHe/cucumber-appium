package utils;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;


/**
 * @author quoc tran
 *
 */
public class Settings {	
	
	public static AndroidDriver driver;
	
	@Before
	public void setUpAppium() throws Exception {
		System.out.println("This will run before the Scenario");
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6.0");
        caps.setCapability("appPackage", "com.android.chrome");
        caps.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
        caps.setCapability("noReset", "true");
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);		
	}
	
	@After
	public void tearDown() {
		System.out.println("This will run after the Scenario");		
		driver.close();
	}
}
