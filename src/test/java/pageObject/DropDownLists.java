package pageObject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DropDownLists {

    private WebDriver driver;
    private String expectedFirstText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String expectedSecondText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String expectedThirdText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String expectedFourthText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String expectedFifthText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String expectedSixthText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String expectedSeventhText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String expectedEighthText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        }

    @Test
    public void testOfFirstDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickFirstDropDownList();
        String actualFirstText = objectPageOfStart.getFirstText();
        assertEquals(expectedFirstText, actualFirstText);
    }

    @Test
    public void testOfSecondDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickSecondDropDownList();
        String actualSecondText = objectPageOfStart.getSecondText();
        assertEquals(expectedSecondText, actualSecondText);
    }

    @Test
    public void testOfThirdDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickThirdDropDownList();
        String actualThirdText = objectPageOfStart.getThirdText();
        assertEquals(expectedThirdText, actualThirdText);
    }

    @Test
    public void testOfFourthDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickFourthDropDownList();
        String actualFourthText = objectPageOfStart.getFourthText();
        assertEquals(expectedFourthText, actualFourthText);
    }

    @Test
    public void testOfFifthDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickFifthDropDownList();
        String actualFifthText = objectPageOfStart.getFifthText();
        assertEquals(expectedFifthText, actualFifthText);
    }
    @Test
    public void testOfSixthDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickSixthDropDownList();
        String actualSixthText = objectPageOfStart.getSixthText();
        assertEquals(expectedSixthText, actualSixthText);
    }
    @Test
    public void testOfSeventhDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickSeventhDropDownList();
        String actualSeventhText = objectPageOfStart.getSeventhText();
        assertEquals(expectedSeventhText, actualSeventhText);
    }
    @Test
    public void testOfEighthDropDownList() {
        driver = new ChromeDriver();
        PageOfStart objectPageOfStart = new PageOfStart(driver);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        objectPageOfStart.clickConfirmButton();
        objectPageOfStart.clickEighthDropDownList();
        String actualEighthText = objectPageOfStart.getEighthText();
        assertEquals(expectedEighthText, actualEighthText);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}