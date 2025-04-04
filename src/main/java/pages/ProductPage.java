package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WaitUtils;

import java.time.Duration;

public class ProductPage {

    AndroidDriver driver;

    public ProductPage(AndroidDriver driver) {
        this.driver = driver;
    }

    public void clickFilterButton() {
        try {
            WebElement filtreBtn = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.widget.TextView[@text='Filtrele']"), 10
            );
            filtreBtn.click();
            //System.out.println("Filtrele butonuna tıklandı.");
        } catch (Exception e) {
            System.out.println("Filtrele butonuna tıklanamadı.");
            Assert.fail("Filtrele butonuna tıklanamadı.");
        }
    }

    public void scrollToFiyatAraligi() {
        try {
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Fiyat Aralığı\"))"
            ));
            //System.out.println("Fiyat Aralığı alanına scroll yapıldı.");
        } catch (Exception e) {
            System.out.println("Fiyat Aralığına scroll başarısız.");
            Assert.fail("Fiyat Aralığına scroll başarısız.");
        }
    }

    public void clickFiyatAraligi() {
        try {
            WebElement fiyatAraligi = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.widget.TextView[@resource-id='com.pozitron.hepsiburada:id/tvFilterName' and @text='Fiyat Aralığı']"),
                    6
            );
            fiyatAraligi.click();
            //System.out.println("Fiyat Aralığı filtresine tıklandı.");
        } catch (Exception e) {
            System.out.println("Fiyat Aralığı filtresine tıklanamadı.");
            Assert.fail("Fiyat Aralığı filtresine tıklanamadı.");
        }
    }

    public void selectPriceRange() {
        try {
            WaitUtils.setImplicitWait(10);
            WebElement fiyatRange = driver.findElement(
                    AppiumBy.xpath("(//android.widget.CheckBox[@resource-id='com.pozitron.hepsiburada:id/cbMultiSelection'])[4]")

            );

            fiyatRange.click();

           // System.out.println("Fiyat aralığı seçildi.");
        } catch (Exception e) {
            System.out.println("Fiyat aralığı seçilemedi. Hata: " + e.getMessage());
            Assert.fail("Fiyat aralığı seçilemedi.");
        }
    }


    public void clickFirstUygula() {
        try {
            WebElement uygulaBtn = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.pozitron.hepsiburada:id/content_wrapper']/android.widget.LinearLayout"),
                    10
            );
            uygulaBtn.click();
            //System.out.println("İlk Uygula butonuna tıklandı.");
        } catch (Exception e) {
            System.out.println("İlk Uygula butonuna tıklanamadı.");
            Assert.fail("İlk Uygula butonuna tıklanamadı.");
        }
    }

    public void scrollToDegerlendirmePuani() {
        try {
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Değerlendirme Puanı\"))"
            ));
            //System.out.println("Değerlendirme Puanı alanına scroll yapıldı.");
        } catch (Exception e) {
            System.out.println("Scroll yapılamadı.");
            Assert.fail("Scroll yapılamadı.");
        }
    }

    public void clickDegerlendirmePuani() {
        try {
            WebElement degerBtn = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.widget.TextView[@resource-id='com.pozitron.hepsiburada:id/tvFilterName' and @text='Değerlendirme Puanı']"),
                    10
            );
            degerBtn.click();
            //System.out.println("Değerlendirme Puanı seçildi.");
        } catch (Exception e) {
            System.out.println("Değerlendirme Puanı bulunamadı.");
            Assert.fail("Değerlendirme Puanı bulunamadı.");
        }
    }

    public void select4YildizVeUzeri() {
        try {
            WebElement radio = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("(//android.widget.RadioButton[@resource-id='com.pozitron.hepsiburada:id/rbSingleSelection'])[1]"),
                    10
            );
            radio.click();
//System.out.println("4 yıldız ve üzeri seçildi.");
        } catch (Exception e) {
            System.out.println("Yıldız seçimi başarısız.");
            Assert.fail("Yıldız seçimi başarısız.");
        }
    }

    public void clickSecondUygula() {
        try {
            WebElement uygulaBtn = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.view.ViewGroup[@resource-id='com.pozitron.hepsiburada:id/content_wrapper']/android.widget.LinearLayout"),
                    10
            );
            uygulaBtn.click();
//System.out.println("İkinci Uygula butonuna tıklandı.");
        } catch (Exception e) {
            System.out.println("İkinci Uygula butonuna tıklandı.");
            Assert.fail("İkinci Uygula butonuna tıklanmadı.");
        }
    }

    public void clickThirdUygula() {
        WebElement uygulaBtn = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiSelector().textContains(\"Uygula\")"));
        uygulaBtn.click();

    }

    private String firstProductName;

    public String getFirstProductNameFromCategoriesPage() {
        try {
            WebElement firstProductElement = WaitUtils.waitForElementVisible(
                    AppiumBy.xpath("//android.widget.TextView[@resource-id='productBox[2]']"),
                    10
            );

            return firstProductName = firstProductElement.getText();
        } catch (Exception e) {
            System.out.println("İlk ürün adı alınamadı: " + e.getMessage());
            return null;
        }

    }

    public void clickFirstItem(){
        try{
            WebElement firstItem = WaitUtils.waitForElementClickable(
                    AppiumBy.xpath("//android.widget.TextView[@resource-id=\"productBox[2]\"]/android.view.View[2]/android.view.View/android.view.View"),
                    10
            );
            firstItem.click();
        }catch (Exception e){
            System.out.println("Urun bulunamadı");
            Assert.fail("Urun bulunamadı");
        }
    }

    public boolean isFirstProductNameMatching() {
        try {
            if (firstProductName == null) {
                firstProductName = getFirstProductNameFromCategoriesPage();
            }

            WebElement productNameElement = WaitUtils.waitForElementVisible(
                    AppiumBy.xpath("//android.widget.TextView[@text='" + firstProductName + "']"),
                    10
            );

            String productNameFromPage = productNameElement.getText();
            if (firstProductName.equals(productNameFromPage)) {
                System.out.println("Ürün adı eşleşiyor: " + productNameFromPage);
                return true;
            } else {
                System.out.println("Ürün adı eşleşmiyor: " + productNameFromPage);
                return false;
            }

        } catch (Exception e) {
            System.out.println("Ürün adı kontrol edilirken bir hata oluştu: " + e.getMessage());
            return false;
        }
    }

}
