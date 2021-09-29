import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class LunchApp {
    @Test
    public void testRunner() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("version", "----");
        capabilities.setCapability("deviceName", "--------");
        capabilities.setCapability("platformName", "--------");
        capabilities.setCapability("automationName", "------");

        capabilities.setCapability("appPackage", "-------");
        capabilities.setCapability("appActivity", "---------");
        capabilities.setCapability("orientation", "-----");
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

    }
}

