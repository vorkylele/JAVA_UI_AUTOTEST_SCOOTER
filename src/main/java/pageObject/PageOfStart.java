package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageOfStart {
    private WebDriver driver;
    public PageOfStart(WebDriver driver) {
        this.driver = driver;
    }

    private By confirmButton = By.id("rcc-confirm-button");
    public void clickConfirmButton() {
        driver.findElement(confirmButton).click();
    }

    private By firstDropDownList = By.id("accordion__heading-0");
    private By firstText = By.xpath(".//div[@id='accordion__panel-0']/p");
    public void clickFirstDropDownList() {
        driver.findElement(firstDropDownList).click();
    }
    public String getFirstText() {
        return driver.findElement(firstText).getText();
    }

    private By secondDropDownList = By.id("accordion__heading-1");
    private By secondText = By.xpath(".//div[@id='accordion__panel-1']/p");
    public void clickSecondDropDownList() {
        driver.findElement(secondDropDownList).click();
    }
    public String getSecondText() {
        return driver.findElement(secondText).getText();
    }

    private By thirdDropDownList = By.id("accordion__heading-2");
    private By thirdText = By.xpath(".//div[@id='accordion__panel-2']/p");
    public void clickThirdDropDownList() {
        driver.findElement(thirdDropDownList).click();
    }
    public String getThirdText() {
        return driver.findElement(thirdText).getText();
    }

    private By fourthDropDownList = By.id("accordion__heading-3");
    private By fourthText = By.xpath(".//div[@id='accordion__panel-3']/p");
    public void clickFourthDropDownList() {
        driver.findElement(fourthDropDownList).click();
    }
    public String getFourthText() {
        return driver.findElement(fourthText).getText();
    }

    private By fifthDropDownList = By.id("accordion__heading-4");
    private By fifthText = By.xpath(".//div[@id='accordion__panel-4']/p");
    public void clickFifthDropDownList() {
        driver.findElement(fifthDropDownList).click();
    }
    public String getFifthText() {
        return driver.findElement(fifthText).getText();
    }

    private By sixthDropDownList = By.id("accordion__heading-5");
    private By sixthText = By.xpath(".//div[@id='accordion__panel-5']/p");
    public void clickSixthDropDownList() {
        driver.findElement(sixthDropDownList).click();
    }
    public String getSixthText() {
        return driver.findElement(sixthText).getText();
    }

    private By seventhDropDownList = By.id("accordion__heading-6");
    private By seventhText = By.xpath(".//div[@id='accordion__panel-6']/p");
    public void clickSeventhDropDownList() {
        driver.findElement(seventhDropDownList).click();
    }
    public String getSeventhText() {
        return driver.findElement(seventhText).getText();
    }

    private By eighthDropDownList = By.id("accordion__heading-7");
    private By eighthText = By.xpath(".//div[@id='accordion__panel-7']/p");
    public void clickEighthDropDownList() {

        driver.findElement(eighthDropDownList).click();
    }
    public String getEighthText() {

        return driver.findElement(eighthText).getText();
    }

    private By upperButtonOfOrder = By.className("Button_Button__ra12g");
    public void clickUpperButtonOfOrder() {
        driver.findElement(upperButtonOfOrder).click();
    }

    private By downButtonOfOrder = By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");
    public void clickDownButtonOfOrder() {
        driver.findElement(downButtonOfOrder).click();
    }
}
