package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class CategoryPage {

    AndroidDriver driver;

    public CategoryPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickAndroidPhones() {
        try {
            WebElement androidTelefonlar = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.widget.TextView[@text='Android Telefonlar']"), 6
            );
            androidTelefonlar.click();
            System.out.println("Android Telefonlar kategorisine tıklandı.");
        } catch (Exception e) {
            System.out.println("Android Telefonlar kategorisine tıklanamadı.");
        }
    }
}
