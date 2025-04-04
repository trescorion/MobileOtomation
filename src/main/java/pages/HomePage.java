package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    AndroidDriver driver;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickCategoryTab() {
        try {
            // Sağ alttaki "Kategoriler" sekmesine tıklama
            WebElement kategoriBtn = driver.findElement(
                    AppiumBy.xpath("//*[contains(@text, 'Kategoriler')]")
            );
            kategoriBtn.click();

            System.out.println("Kategori sekmesine tıklandı.");
        } catch (Exception e) {
            System.out.println("Kategori butonuna tıklanamadı.");
        }
    }
}
