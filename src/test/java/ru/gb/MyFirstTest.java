package ru.gb;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class MyFirstTest {
    @Test
    public void CheckEmptyEmail() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Pixel");
        capabilities.setCapability("udid", "emulator-5554");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", "C:\\Users\\vvk23\\Downloads\\Android-NativeDemoApp-0.2.1.apk");
        MobileDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        //      Нажимаем Login в меню
        Thread.sleep(2000);
        MobileElement loginMenuButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Login\"]/android.view.ViewGroup/android.widget.TextView");
        loginMenuButton.click();
        Thread.sleep(2000);
//      Нажимаем Login на странице логин/пароль.
        MobileElement loginButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]/android.view.ViewGroup");
        loginButton.click();
        Thread.sleep(2000);
//      Проверяем текст ошибки.
        MobileElement errorText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Login-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView[1]");
        Assert.assertEquals(errorText.getText(), "Please enter a valid email address");
//      Проверка вкладки "Forms"
        MobileElement formsButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.view.ViewGroup/android.widget.TextView");
        formsButton.click();
        Thread.sleep(2000);
//      Проверка элементов на вкладке "Forms"
        MobileElement checkText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[1]");
        Assert.assertEquals(checkText.getText(), "Input field");
        MobileElement checkText2 = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]");
        Assert.assertEquals(checkText2.getText(), "Switch");
        MobileElement checkText3 = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"select-Dropdown\"]/android.widget.TextView[1]");
        Assert.assertEquals(checkText3.getText(), "Dropdown");
        Thread.sleep(2000);
//      Нажатие на конопку "Activate"
        MobileElement activateButton = (MobileElement) driver.findElementByXPath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup");
        activateButton.click();
        Thread.sleep(2000);
//      Проверка надписи "This button is active"
        MobileElement visibleText = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView");
        Assert.assertEquals(visibleText.getText(), "This button is active");
//      Нажатие на кнопку "OK"
        MobileElement okButton = (MobileElement) driver.findElementById("android:id/button1");
        okButton.click();
//      Проверка выхода в окно  "Form components"
        MobileElement formText = (MobileElement) driver.findElementByXPath("//android.widget.ScrollView[@content-desc=\"Forms-screen\"]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView");
        Assert.assertEquals(formText.getText(), "Form components");
    }
}
