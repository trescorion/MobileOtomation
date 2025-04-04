package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import utils.DriverManager;

public class WaitUtils {

    public static WebElement waitForElementClickable(By locator, int timeout) {
        AndroidDriver driver = DriverManager.getDriver();
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static WebElement waitForElementVisible(By locator, int timeout) {
        AndroidDriver driver = DriverManager.getDriver();
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void setImplicitWait(int seconds) {
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

}
