package com.vorkylele.pageobject;

import com.codeborne.selenide.SelenideElement;
import com.github.javafaker.Faker;
import io.qameta.allure.Step;

import java.util.Locale;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DataOfUserPage {
    Faker faker = new Faker(new Locale("ru_RU"));
    // Elements
    private SelenideElement
            name = $x("//*[@placeholder='* Имя']"),
            lastName = $x("//*[@placeholder='* Фамилия']"),
            address = $x("//*[@placeholder='* Адрес: куда привезти заказ']"),
            phoneNumber = $x("//*[@placeholder='* Телефон: на него позвонит курьер']");
    private SelenideElement
            dropDownListMetro = $(".select-search__input"),
            stationOfMetroPreobrazhenskaya = $x("//button[@value='3']");

    private SelenideElement btnConfirm = $x("//button[contains(text(), 'Далее')]");

    // Actions
    @Step("Заполнить данные пользователя")
    public DataOfUserPage setDataUser() {
        name.setValue(faker.name().firstName());
        lastName.setValue(faker.name().lastName());
        address.setValue(faker.address().secondaryAddress());
        phoneNumber.setValue(String.valueOf(faker.phoneNumber().phoneNumber()).replace("(", "").replace(")", "").replace("-", ""));

        return this;
    }

    @Step("Выбрать станцию метро 'Преображенская площадь'")
    public DataOfUserPage setStationOfMetro() {
        dropDownListMetro.click();
        stationOfMetroPreobrazhenskaya.click();

        return this;
    }

    @Step("Нажать кнопку 'Далее'")
    public DataOfUserPage confirmDataUser() {
        btnConfirm.click();

        return this;
    }
}
