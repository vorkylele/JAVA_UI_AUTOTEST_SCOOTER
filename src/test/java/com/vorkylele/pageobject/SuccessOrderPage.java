package com.vorkylele.pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SuccessOrderPage {
    // Elements
    private SelenideElement windowOfSuccessfulOder = $(".Order_ModalHeader__3FDaJ");
    // Actions
    @Step("Проверить наличие текста 'Заказ оформлен' при успешном заказе")
    public SuccessOrderPage checkResultOfWindowOfSuccessfulOrder() {
        windowOfSuccessfulOder.shouldHave(text("Заказ оформлен"));

        return this;
    }
}
