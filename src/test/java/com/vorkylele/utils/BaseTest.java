package com.vorkylele.utils;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.vorkylele.config.WebDriverProvider;
import com.vorkylele.pageobject.DataOfUserPage;
import com.vorkylele.pageobject.InfoOfDeliveryPage;
import com.vorkylele.pageobject.StartPage;
import com.vorkylele.pageobject.SuccessOrderPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.vorkylele.config.ConfigSingle.config;

@DisplayName("Конфигурация тестов")
public class BaseTest extends WebDriverProvider {
    protected static StartPage startPage = new StartPage();
    protected DataOfUserPage dataOfUserPage = new DataOfUserPage();
    protected InfoOfDeliveryPage infoOfDeliveryPage = new InfoOfDeliveryPage();
    protected SuccessOrderPage successOrderPage = new SuccessOrderPage();

    @DisplayName("Конфигурация перед классом тестов")
    @BeforeAll
    public static void beforeClass() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        createDriver();
        Selenide.open(config.getBaseUriProperties());
        startPage.checkCookieBtn();
    }

    @DisplayName("Конфигурация после теста")
    @AfterEach
    public void afterTest(){
        Selenide.open(config.getBaseUriProperties());
    }
}
