package com.vorkylele.tests;

import com.vorkylele.utils.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.vorkylele.utils.ExpectedResults.*;
import static com.vorkylele.utils.ExpectedResults.EXPECTED_EIGHTH_TEXT_DROP_DOWN_LIST;

@Epic("Корректное отображение текста выпадающих списков блока 'Вопросы о важном'")
@DisplayName("Корректное отображение текста выпадающих списков блока 'Вопросы о важном'")
public class DropDownListTest extends BaseTest {
    @Feature("Проверка всех выпадающих списков")
    @DisplayName("Проверка всех выпадающих списков")
    @Test
    public void dropDownListCheckAllTextSuccessResult() {
        startPage
                .checkTextOfFirstDropDownList(EXPECTED_FIRST_TEXT_DROP_DOWN_LIST)
                .checkTextOfSecondDropDownList(EXPECTED_SECOND_TEXT_DROP_DOWN_LIST)
                .checkTextOfThirdDropDownList(EXPECTED_THIRD_TEXT_DROP_DOWN_LIST)
                .checkTextOfFourthDropDownList(EXPECTED_FOURTH_TEXT_DROP_DOWN_LIST)
                .checkTextOfFifthDropDownList(EXPECTED_FIFTH_TEXT_DROP_DOWN_LIST)
                .checkTextOfSixthDropDownList(EXPECTED_SIXTH_TEXT_DROP_DOWN_LIST)
                .checkTextOfSeventhDropDownList(EXPECTED_SEVENTH_TEXT_DROP_DOWN_LIST)
                .checkTextOfEighthDropDownList(EXPECTED_EIGHTH_TEXT_DROP_DOWN_LIST);
    }
}
