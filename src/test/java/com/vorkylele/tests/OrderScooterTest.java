package com.vorkylele.tests;import com.vorkylele.utils.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Epic("Корректное оформление заказа самоката")
@DisplayName("Корректное оформление заказа самоката")
public class OrderScooterTest extends BaseTest {

    @Feature("Оформление заказа, через верхнюю кнопку 'Заказать'")
    @DisplayName("Оформление заказа, через верхнюю кнопку 'Заказать'")
    @Test
    public void createOrderUpperBtnSuccessResult() {
        startPage
                .clickUpperBtnOrder();
        dataOfUserPage
                .setDataUser()
                .setStationOfMetro()
                .confirmDataUser();
        infoOfDeliveryPage
                .completeInfoOfDelivery();
        successOrderPage
                .checkResultOfWindowOfSuccessfulOrder();
    }

    @Feature("Оформление заказа, через нижнюю кнопку 'Заказать'")
    @DisplayName("Оформление заказа, через нижнюю кнопку 'Заказать'")
    @Test
    public void createOrderDownBtnSuccessResult() {
        startPage
                .clickDownBtnOrder();
        dataOfUserPage
                .setDataUser()
                .setStationOfMetro()
                .confirmDataUser();
        infoOfDeliveryPage
                .completeInfoOfDelivery();
        successOrderPage
                .checkResultOfWindowOfSuccessfulOrder();
    }
}
