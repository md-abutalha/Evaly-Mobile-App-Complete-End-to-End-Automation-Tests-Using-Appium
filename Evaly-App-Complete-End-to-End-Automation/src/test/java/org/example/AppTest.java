package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
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

    @Test(priority = 1, description = "E2E Test")
    public void evalyTestPart1() {
        WebElement el4 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(0)"));
        el4.click();
        el4.click();
        WebElement el5 = driver.findElement(AppiumBy.accessibilityId("Categories"));
        el5.click();

        final PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
        Point start1 = new Point(101, 401);
        Point end1 = new Point(80, 2058);
        Sequence swipe1 = new Sequence(finger1, 1);
        swipe1.addAction(finger1.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start1.getX(), start1.getY()));
        swipe1.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe1.addAction(finger1.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end1.getX(), end1.getY()));
        swipe1.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe1));

        final PointerInput finger2 = new PointerInput(PointerInput.Kind.TOUCH, "finger2");
        Point start2 = new Point(139, 1978);
        Point end2 = new Point(152, 1535);
        Sequence swipe2 = new Sequence(finger2, 1);
        swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start2.getX(), start2.getY()));
        swipe2.addAction(finger2.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe2.addAction(finger2.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end2.getX(), end2.getY()));
        swipe2.addAction(finger2.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe2));

        WebElement el6 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/image\").instance(2)"));
        el6.click();
        WebElement el7 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/image\").instance(8)"));
        el7.click();
        WebElement el8 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Anker iPhone15 Magnetic Clear Case Back Cover - Transparent - A90A5H01\")"));
        el8.click();
        WebElement el9 = driver.findElement(AppiumBy.accessibilityId("Open navigation drawer"));
        el9.click();
        WebElement el10 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Anker iPhone15 Pro Max Magnetic Clear Case - Transparent - A90A8H01\")"));
        el10.click();

        final PointerInput finger3 = new PointerInput(PointerInput.Kind.TOUCH, "finger3");
        Point start3 = new Point(502, 2003);
        Point end3 = new Point(531, 1088);
        Sequence swipe3 = new Sequence(finger3, 1);
        swipe3.addAction(finger3.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start3.getX(), start3.getY()));
        swipe3.addAction(finger3.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe3.addAction(finger3.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end3.getX(), end3.getY()));
        swipe3.addAction(finger3.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe3));

        WebElement el11 = driver.findElement(AppiumBy.id("bd.com.evaly.evalyshop:id/add_cart"));
        el11.click();
        WebElement el12 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(2)"));
        el12.click();
        WebElement el13 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(3)"));
        el13.click();

    }

    @Test(priority = 2,description = "Sanity testing")
    public void evalyTestPart2() {
        // Element interactions
        WebElement el1 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(0)"));
        el1.click();
        WebElement el2 = driver.findElement(AppiumBy.accessibilityId("FAQ"));
        el2.click();
        WebElement el3 = driver.findElement(AppiumBy.accessibilityId("Open navigation drawer"));
        el3.click();
        WebElement el4 = driver.findElement(AppiumBy.accessibilityId("Wish List"));
        el4.click();
        WebElement el5 = driver.findElement(AppiumBy.accessibilityId("Open navigation drawer"));
        el5.click();
        WebElement el6 = driver.findElement(AppiumBy.accessibilityId("Return Policy"));
        el6.click();
        WebElement el7 = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"If your product is damaged, defective, incorrect, or incomplete upon delivery, kindly initiate a return request through the Evaly app or website within 7 days from the date of delivery.\"]"));
        el7.click();
        WebElement el8 = driver.findElement(AppiumBy.accessibilityId("Close tab"));
        el8.click();
        WebElement el9 = driver.findElement(AppiumBy.accessibilityId("Categories"));
        el9.click();
        WebElement el10 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/image\").instance(0)"));
        el10.click();

// Swipe action
        final PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Point start = new Point(624, 1526);
        Point end = new Point(628, 1286);
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        WebElement el11 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/image\").instance(9)"));
        el11.click();
        WebElement el12 = driver.findElement(AppiumBy.accessibilityId("Open navigation drawer"));
        el12.click();
        WebElement el13 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/image\").instance(3)"));
        el13.click();
        WebElement el14 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/image\").instance(6)"));
        el14.click();
        WebElement el15 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Apple iPad 9th Gen Global - 3GB RAM - 64GB ROM - 12MP Camera - 10.2 Inch Display \")"));
        el15.click();

// Tap action
        Point tapPoint1 = new Point(552, 1771);
        Sequence tap1 = new Sequence(finger, 1);
        tap1.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), tapPoint1.x, tapPoint1.y));
        tap1.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap1.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap1.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap1));

        Point tapPoint2 = new Point(498, 1256);
        Sequence tap2 = new Sequence(finger, 1);
        tap2.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), tapPoint2.x, tapPoint2.y));
        tap2.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        tap2.addAction(new Pause(finger, Duration.ofMillis(50)));
        tap2.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(tap2));

// Second swipe action
        start = new Point(527, 1952);
        end = new Point(540, 1472);
        swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), start.getX(), start.getY()));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), end.getX(), end.getY()));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        driver.perform(Arrays.asList(swipe));

        WebElement el16 = driver.findElement(AppiumBy.id("bd.com.evaly.evalyshop:id/buy_now"));
        el16.click();
        WebElement el17 = driver.findElement(AppiumBy.id("bd.com.evaly.evalyshop:id/closeBtn"));
        el17.click();
        WebElement el18 = driver.findElement(AppiumBy.id("bd.com.evaly.evalyshop:id/add_cart"));
        el18.click();
        WebElement el19 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(2)"));
        el19.click();
        WebElement el20 = driver.findElement(AppiumBy.accessibilityId("DELETE"));
        el20.click();
        WebElement el21 = driver.findElement(AppiumBy.id("android:id/button1"));
        el21.click();
        WebElement el22 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"bd.com.evaly.evalyshop:id/navigation_bar_item_icon_view\").instance(3)"));
        el22.click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
