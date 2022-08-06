package pageObject;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class PageWithInfoOfDeliveryAndRent {
    private WebDriver driver;
    public PageWithInfoOfDeliveryAndRent(WebDriver driver) {
        this.driver = driver;
    }

    private By fieldOfData = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    public void clickFieldOfData() {
        driver.findElement(fieldOfData).click();
    }

    private By buttonOfData = By.cssSelector(".react-datepicker__day--019");
    public void clickButtonOfData() {
        driver.findElement(buttonOfData).click();
    }

    private By dropDownListOfPeriod = By.cssSelector(".Dropdown-placeholder");
    public void clickDropDownListOfPeriod() {
        driver.findElement(dropDownListOfPeriod).click();
    }

    private By buttonOfPeriod = By.xpath(".//div[text()='сутки']");
    public void clickButtonOfPeriod() {
        driver.findElement(buttonOfPeriod).click();
    }

    private By buttonOfOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    public void clickButtonOfOrder() {
        driver.findElement(buttonOfOrder).click();
    }

    private By buttonOfConfirm = By.xpath(".//button[text()='Да' and @class='Button_Button__ra12g Button_Middle__1CSJM']");
    public void clickButtonOfConfirm() {
        driver.findElement(buttonOfConfirm).click();
    }
}
