package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static org.hamcrest.CoreMatchers.startsWith;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

public class OrderOfScooter {

    private WebDriver driver;
    private String expectedStartTextOfSuccessfulOrderCreation = "Заказ оформлен";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
    }

    @Test
    public void firstOrder() {
        driver = new ChromeDriver(); // По заданию, необходимо отправить проект на ревью с подключенным Google Chrome,
        // по факту - тесты в хроме не работаю, ломаются на моменте с кнопкой "Да"
        // тесты запускаются в мозилке, например :)

        PageOfStart objectPageOfStart = new PageOfStart(driver);
        PageWithDataOfUser objectPageWithDataOfUser = new PageWithDataOfUser(driver);
        PageWithInfoOfDeliveryAndRent objectPageWithInfoOfDeliveryAndRent = new PageWithInfoOfDeliveryAndRent(driver);
        PageWithWindowOfSuccessfulOrderCreation objectPageWithWindowOfSuccessfulOrderCreation = new PageWithWindowOfSuccessfulOrderCreation(driver);

        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickUpperButtonOfOrder();
        objectPageWithDataOfUser.setName("Иван");
        objectPageWithDataOfUser.setSurname("Иванович");
        objectPageWithDataOfUser.setAddress("Пушкина");
        objectPageWithDataOfUser.setPoneNumber("+79111111111");
        objectPageWithDataOfUser.clickDropDownListOfMetro();
        objectPageWithDataOfUser.clickStationOfMetroPreobrazhenskay();
        objectPageWithDataOfUser.clickButtonOfConfirm();
        objectPageWithInfoOfDeliveryAndRent.clickFieldOfData();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfData();
        objectPageWithInfoOfDeliveryAndRent.clickDropDownListOfPeriod();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfPeriod();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfOrder();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfConfirm();
        String actualTextOfSuccessfulOrderCreation = objectPageWithWindowOfSuccessfulOrderCreation.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat(actualTextOfSuccessfulOrderCreation, startsWith(expectedStartTextOfSuccessfulOrderCreation));
    }

    @Test
    public void secondOrder() {
        driver = new ChromeDriver();

        PageOfStart objectPageOfStart = new PageOfStart(driver);
        PageWithDataOfUser objectPageWithDataOfUser = new PageWithDataOfUser(driver);
        PageWithInfoOfDeliveryAndRent objectPageWithInfoOfDeliveryAndRent = new PageWithInfoOfDeliveryAndRent(driver);
        PageWithWindowOfSuccessfulOrderCreation objectPageWithWindowOfSuccessfulOrderCreation = new PageWithWindowOfSuccessfulOrderCreation(driver);

        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();

        new WebDriverWait(driver, 5)
                .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button")));
        WebElement element = driver.findElement(By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objectPageOfStart.clickDownButtonOfOrder();
        objectPageWithDataOfUser.setName("Бублик");
        objectPageWithDataOfUser.setSurname("Бубликович");
        objectPageWithDataOfUser.setAddress("Ленина");
        objectPageWithDataOfUser.setPoneNumber("+79222222222");
        objectPageWithDataOfUser.clickDropDownListOfMetro();
        objectPageWithDataOfUser.clickStationOfMetroPreobrazhenskay();
        objectPageWithDataOfUser.clickButtonOfConfirm();
        objectPageWithInfoOfDeliveryAndRent.clickFieldOfData();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfData();
        objectPageWithInfoOfDeliveryAndRent.clickDropDownListOfPeriod();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfPeriod();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfOrder();
        objectPageWithInfoOfDeliveryAndRent.clickButtonOfConfirm();
        String actualTextOfSuccessfulOrderCreation = objectPageWithWindowOfSuccessfulOrderCreation.getTextOfWindowOfSuccessfulOrder();
        MatcherAssert.assertThat(actualTextOfSuccessfulOrderCreation, startsWith(expectedStartTextOfSuccessfulOrderCreation));
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}