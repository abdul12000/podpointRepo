package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 15);
    }

    private void waitForVisibilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    private void waitForClickabilityOfElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void click(WebElement element){
        waitForClickabilityOfElement(element);
                element.click();
    }
    public void sendKeys(WebElement element, String value){
        waitForVisibilityOfElement(element);
        element.sendKeys(value);

    }

    public void selectFromDropDownWithVisibilityOfElement(WebElement element, String name){
        waitForVisibilityOfElement(element);
        Select select = new Select(element);
        select.selectByVisibleText(name);
    }


}
