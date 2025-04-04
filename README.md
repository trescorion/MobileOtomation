İlgili apk;

https://limewire.com/d/Ul34o#4MwsvChT2A

İlgili stepler;

Feature: Price and name verification

  Scenario: Perform price verification
    Given the app is opened and notification permission is denied
    Given the categories tab is clicked
    And the "Android Phones" category is selected
    And the filter button is clicked
    And scroll to and click on the "Price Range"
    And a specific price range is selected
    And the first "Apply" button is clicked
    And the rating filter is selected
    And the second "Apply" button is clicked
    And the third "Apply" button is clicked
    And the first product name is retrieved
    And click First Item
    And check name

Inspector için kullandığım Json;

{
  "appium:automationName": "UiAutomator2",
  "platformName": "Android",
  "appium:platformVersion": "13",
  "appium:deviceName": "Pixel_7",
  "appium:noReset": true,
  "appium:app": "C:/Users/PC/OneDrive/Belgeler/hepsiburada.apk"
}
