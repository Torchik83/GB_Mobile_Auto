package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFailScreenshotTest extends BaseTest {

//    @Test
//    @Description("Проверяем поведение теста при неудачной проверки UI главной страницы с помощью скриншота.")
//    public void CheckFailMainPageScreenshot() {
//        openApp("Pixel 4a")
//                .checkFailScreenshot();
//    }
}
