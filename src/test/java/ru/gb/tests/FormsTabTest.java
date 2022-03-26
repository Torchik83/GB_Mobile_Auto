package ru.gb.tests;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

    @Listeners(AllureListener.class)
    public class FormsTabTest extends BaseTest {

        public static final String VALID_FORMS_TEXT = "FORM COMPONENTS";
        @Test
        @Description("Проверяем сообщение об ошибке при невалидной email.")
        public void CheckFormsTab() {
            openApp("pixel 5")
                    .clickFormsButton()
                    .checkFormsPage(VALID_FORMS_TEXT);
        }
    }


