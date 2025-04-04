package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WaitUtils;


import java.time.Duration;

public class PermissionPage {

    AndroidDriver driver;

    public PermissionPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickDontAllow() {
        try {
            WebElement dontAllowBtn = WaitUtils.waitForElementClickable(
                    AppiumBy.id("com.android.permissioncontroller:id/permission_deny_and_dont_ask_again_button"),
                    10
            );
            dontAllowBtn.click();
            System.out.println("Popup'a başarıyla tıklandı.");

        } catch (Exception e) {
            System.out.println("Popup bulunamadı veya zaten görünmedi.");
        }
    }
}

