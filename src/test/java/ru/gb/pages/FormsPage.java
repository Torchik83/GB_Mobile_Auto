package ru.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import ru.gb.locators.FormsPageLocator;

public class FormsPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private FormsPageLocator locator() {
        return new FormsPageLocator();
    }

    @Step("Кликаем по кнопке 'Forms' в форме")
    public FormsPage clickFormsButton() {
        Selenide.$(locator().formsButton()).click();
        return new FormsPage();
    }

    @Step("Проверяем страницу Forms")
    public FormsPage checkFormsPage(String text) {
        Selenide.$(locator().formsText()).shouldHave(Condition.text(text));
        return new FormsPage();
    }
}
