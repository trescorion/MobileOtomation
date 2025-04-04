package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CategoryPage;
import pages.HomePage;
import pages.PermissionPage;
import pages.ProductPage;
import utils.DriverManager;

public class StepDefinitions {

    PermissionPage permissionPage = new PermissionPage(DriverManager.getDriver());

    @Given("the app is opened and notification permission is denied")
    public void denyNotificationPermission() {
        permissionPage.clickDontAllow();
    }

    @Given("the categories tab is clicked")
    public void clickCategoriesTab() {
        HomePage homePage = new HomePage(DriverManager.getDriver());
        homePage.clickCategoryTab();
    }

    @And("the \"Android Phones\" category is selected")
    public void selectAndroidPhonesCategory() {
        CategoryPage categoryPage = new CategoryPage(DriverManager.getDriver());
        categoryPage.clickAndroidPhones();
    }

    @And("the filter button is clicked")
    public void clickFilterButton() {
        new ProductPage(DriverManager.getDriver()).clickFilterButton();
    }

    @And("scroll to and click on the \"Price Range\"")
    public void scrollAndClickPriceRange() {
        ProductPage page = new ProductPage(DriverManager.getDriver());
        page.scrollToFiyatAraligi();
        page.clickFiyatAraligi();
    }

    @And("a specific price range is selected")
    public void selectPriceRange() {
        new ProductPage(DriverManager.getDriver()).selectPriceRange();
    }


    @And("the first \"Apply\" button is clicked")
    public void clickFirstApplyButton() {
        new ProductPage(DriverManager.getDriver()).clickFirstUygula();
    }

    @And("the rating filter is selected")
    public void selectRatingFilter() {
        ProductPage page = new ProductPage(DriverManager.getDriver());
        page.scrollToDegerlendirmePuani();
        page.clickDegerlendirmePuani();
        page.select4YildizVeUzeri();
    }

    @And("the second \"Apply\" button is clicked")
    public void clickSecondApplyButton() {
        new ProductPage(DriverManager.getDriver()).clickSecondUygula();
    }

    @And("the third \"Apply\" button is clicked")
    public void clickThirdApplyButton() {
        new ProductPage(DriverManager.getDriver()).clickThirdUygula();
    }

    @And("the first product name is retrieved")
    public void getFirstProductName() {
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        String firstProductName = productPage.getFirstProductNameFromCategoriesPage();

        System.out.println("First Product Name: " + firstProductName);
        assert firstProductName != null && !firstProductName.isEmpty();
    }

    @And("click First Item")
    public void clickFirstItem() {
        new ProductPage(DriverManager.getDriver()).clickFirstItem();
    }

    @And("check name")
    public void checkName() {
        new ProductPage(DriverManager.getDriver()).isFirstProductNameMatching();
    }


}
