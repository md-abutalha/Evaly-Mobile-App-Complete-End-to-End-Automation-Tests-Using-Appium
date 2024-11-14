package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        BaseOptions options = new BaseOptions()
                .amend("platformName", "android")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:deviceName", "SM A505FN")
                .amend("appium:udid", "R58M43K2YCP")
                .amend("appium:appPackage", "bd.com.evaly.evalyshop")
                .amend("appium:appActivity", "bd.com.evaly.evalyshop.ui.main.MainActivity");

        URL remoteURL = new URL("http://127.0.0.1:4723");

        driver = new AndroidDriver(remoteURL, options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void sampleTest() {
        org.openqa.selenium.WebElement el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(0)"));
        el1.click();
        WebElement el2 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(11)"));
        ((WebElement) el2).click();
        WebElement el3 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Cart\")"));
        ((WebElement) el3).click();
        WebElement el4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(3)"));
        ((WebElement) el4).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
