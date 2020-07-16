package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourPodPointPage extends BasePage {
    public YourPodPointPage(WebDriver driver) {
        super(driver);
    }

@FindBy (id = "vehicleBrand")
    private WebElement vehicleBrandLocator;


    @FindBy (id = "vehicleId")
    private WebElement vehicleModelLocator;

    @FindBy (xpath = "//input[@id='optOut']")
    private WebElement notEligibleCheckBoxLocator;


    @FindBy (xpath = "//label[@for='model-S7']//span[@class='h3']")
    private WebElement fullPriceLocator;

    @FindBy (xpath = "//p[@class='text-success p-b-md']/span[1]")
    private List<WebElement> olevGrantLocator;

    @FindBy (xpath = "//div[@name='optionalExtras']//div[@class='selection']")
    private List<WebElement> compartibleExtrasListLocator;

    @FindBy (xpath = "//div[@class='selection']//p[@class='h4']")
    private List<WebElement> compartibleExtrasPriceListLocator;


    @FindBy (css = "h3.p-b-none")
    private WebElement totalPriceLocator;

    public void selectBrand(String brandName){
        selectFromDropDownWithVisibilityOfElement(vehicleBrandLocator, brandName);
    }
    public void selectModel(String modelName){
        selectFromDropDownWithVisibilityOfElement(vehicleModelLocator, modelName);
    }

    public void tickNotElegibleCheckBox() throws InterruptedException {
        Thread.sleep(5000);
    notEligibleCheckBoxLocator.click();
    }

    public String getFullPrice(){
        return fullPriceLocator.getText();
    }
    public String getPriceWithOlevGrant(){
        return olevGrantLocator.get(1).getText();
    }

    public int getTotalCompartibleExtras(){
        int sizeOfCompartibleExtras =  compartibleExtrasListLocator.size();
        return sizeOfCompartibleExtras;
    }

    public void chooseFirstCompartibleExtra(){
        click(compartibleExtrasListLocator.get(0));
    }
    public String getTotalPrice(){
        return  totalPriceLocator.getText();
    }
    public String getPriceOfFirstCompartibleExtraWithCurrency(){
        return compartibleExtrasPriceListLocator.get(0).getText();
    }


}
