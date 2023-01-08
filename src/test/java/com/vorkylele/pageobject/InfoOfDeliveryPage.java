package com.vorkylele.pageobject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class InfoOfDeliveryPage {
    // Elements
    private SelenideElement
            fieldOfData = $x("//*[@placeholder='* Когда привезти самокат']"),
            btnOfData = $(".react-datepicker__day--019"),
            dropDownListOfPeriodRent = $(".Dropdown-placeholder"),
            btnOfPeriodRent = $x("//*[contains(text(), 'сутки')]"),
            btnOfConfirm = $x("//button[contains(text(), 'Да')]");
    private ElementsCollection BtnOrder = $$x("//button[contains(text(), 'Заказать')]");

    // Actions
    @Step("Заполнить информацию о доставке и аренде")
    public InfoOfDeliveryPage completeInfoOfDelivery() {
        fieldOfData.click();
        btnOfData.click();
        dropDownListOfPeriodRent.click();
        btnOfPeriodRent.click();
        BtnOrder.get(1).click();
        btnOfConfirm.click();

        return this;
    }
}
