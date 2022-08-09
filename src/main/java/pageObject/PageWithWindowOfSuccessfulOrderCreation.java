package pageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageWithWindowOfSuccessfulOrderCreation {
        private WebDriver driver;
        public PageWithWindowOfSuccessfulOrderCreation(WebDriver driver) {
                this.driver = driver;
        }

        private By windowOfSuccessfulOrder = By.cssSelector(".Order_ModalHeader__3FDaJ");
        public String getTextOfWindowOfSuccessfulOrder() {
                return driver.findElement(windowOfSuccessfulOrder).getText();
        }
}
