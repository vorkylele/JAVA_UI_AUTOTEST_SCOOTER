package com.vorkylele.pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class StartPage {
    // Elements
    private SelenideElement acceptCookieBtn = $("#rcc-confirm-button");

    private SelenideElement
            firstDropDownList = $("#accordion__heading-0"),
            firstTextOfDropDownList = $("#accordion__panel-0"),
            secondDropDownList = $("#accordion__heading-1"),
            secondTextOfDropDownList = $("#accordion__panel-1"),
            thirdDropDownList = $("#accordion__heading-2"),
            thirdTextOfDropDownList = $("#accordion__panel-2"),
            fourthDropDownList = $("#accordion__heading-3"),
            fourthTextOfDropDownList = $("#accordion__panel-3"),
            fifthDropDownList = $("#accordion__heading-4"),
            fifthTextOfDropDownList = $("#accordion__panel-4"),
            sixthDropDownList = $("#accordion__heading-5"),
            sixthTextOfDropDownList = $("#accordion__panel-5"),
            seventhDropDownList = $("#accordion__heading-6"),
            seventhTextOfDropDownList = $("#accordion__panel-6"),
            eighthDropDownList = $("#accordion__heading-7"),
            eighthTextOfDropDownList = $("#accordion__panel-7");

    private ElementsCollection BtnOrder = $$x("//button[contains(text(), 'Заказать')]");


    // Actions
    @Step("Принять куки")
    public StartPage clickAcceptCookieBtn() {
        acceptCookieBtn.click();

        return this;
    }

    @Step("Проверить совпадение текст первого выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfFirstDropDownList(String text) {
        firstDropDownList.click();
        firstTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст второго выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfSecondDropDownList(String text) {
        secondDropDownList.click();
        secondTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст третьего выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfThirdDropDownList(String text) {
        thirdDropDownList.click();
        thirdTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст четвертого выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfFourthDropDownList(String text) {
        fourthDropDownList.click();
        fourthTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст пятого выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfFifthDropDownList(String text) {
        fifthDropDownList.click();
        fifthTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст шестого выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfSixthDropDownList(String text) {
        sixthDropDownList.click();
        sixthTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст седьмого выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfSeventhDropDownList(String text) {
        seventhDropDownList.click();
        seventhTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Проверить совпадение текст восьмого выпадающего списка блока 'Вопросы о важном'")
    public StartPage checkTextOfEighthDropDownList(String text) {
        eighthDropDownList.click();
        eighthTextOfDropDownList.shouldHave(text(text));

        return this;
    }

    @Step("Нажать на верхнюю кнопку 'Заказать'")
    public StartPage clickUpperBtnOrder() {
        BtnOrder.get(0).click();

        return this;
    }

    @Step("Нажать на нижнюю кнопку 'Заказать'")
    public StartPage clickDownBtnOrder() {
        BtnOrder.get(1).click();

        return this;
    }
}
