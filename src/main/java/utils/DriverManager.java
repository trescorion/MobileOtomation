package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.Capabilities;

import java.net.URL;

public class DriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                Capabilities options = new BaseOptions()
                        .amend("appium:automationName", "UiAutomator2")
                        .amend("platformName", "Android")
                        .amend("appium:platformVersion", "13")
                        .amend("appium:deviceName", "emulator-5554")
                        .amend("appium:noReset", false)
                        .amend("appium:app", "C:/Users/PC/OneDrive/Belgeler/hepsiburada.apk")
                        .amend("appium:appPackage", "com.pozitron.hepsiburada")
                        .amend("appium:appActivity", "com.hepsiburada.ui.startup.SplashActivity")
                        .amend("appium:ensureWebviewsHavePages", true)
                        .amend("appium:nativeWebScreenshot", true)
                        .amend("appium:newCommandTimeout", 3600)
                        .amend("appium:autoGrantPermissions", true)  // bu kısımda çok uğraştım
                        .amend("appium:connectHardwareKeyboard", true);

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return driver;
    }

}
