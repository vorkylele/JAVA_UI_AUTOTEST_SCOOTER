package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageWithDataOfUser {
    private WebDriver driver;
    public PageWithDataOfUser(WebDriver driver) {
        this.driver = driver;
    }

    private By name = By.xpath(".//input[@placeholder='* Имя']");
    public void setName (String userName) {
        driver.findElement(name).sendKeys(userName);
    }

    private By surname  = By.xpath(".//input[@placeholder='* Фамилия']");
    public void setSurname (String userSurname) {
        driver.findElement(surname).sendKeys(userSurname);
    }

    private By address  = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    public void setAddress (String userAddress) {
        driver.findElement(address).sendKeys(userAddress);
    }

    private By dropDownListOfMetro  = By.xpath(".//input[@class='select-search__input']");
    public void clickDropDownListOfMetro() {
        driver.findElement(dropDownListOfMetro).click();
    }

    private By stationOfMetroPreobrazhenskaya  = By.xpath(".//button[@value='3']");
    public void clickStationOfMetroPreobrazhenskay() {
        driver.findElement(stationOfMetroPreobrazhenskaya).click();
    }

    private By phoneNumber  = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    public void setPoneNumber (String userPoneNumber) {
        driver.findElement(phoneNumber).sendKeys(userPoneNumber);
    }

    private By buttonOfConfirm = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public void clickButtonOfConfirm() {
        driver.findElement(buttonOfConfirm).click();
    }
}
