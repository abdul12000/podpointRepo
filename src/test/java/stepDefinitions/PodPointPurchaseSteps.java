package stepDefinitions;

import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.YourPodPointPage;
import utilities.Utility;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class PodPointPurchaseSteps extends BaseUtil {
    private BaseUtil base;
    private int priceOfFirstCompartibleExtra;
    private int totalPrice;
    private int fullPrice;

    public PodPointPurchaseSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am on the Url \"([^\"]*)\"$")
    public void i_am_on_the_Url(String url) throws Throwable {
        base.driver.get(url);

    }

    @When("^I select \"([^\"]*)\" and \"([^\"]*)\" in the Select your car fields$")
    public void i_select_and_in_the_Select_your_car_fields(String brandName, String modelName) throws Throwable {
        YourPodPointPage yourPodPointPage = new YourPodPointPage(base.driver);
        yourPodPointPage.selectBrand(brandName);
        yourPodPointPage.selectModel(modelName);

    }

    @When("^I check the box \"([^\"]*)\"$")
    public void i_check_the_box(String arg1) throws Throwable {
        YourPodPointPage yourPodPointPage = new YourPodPointPage(base.driver);
        yourPodPointPage.tickNotElegibleCheckBox();

    }

    @When("^I select \"([^\"]*)\" option connection type$")
    public void i_select_option_connection_type(String connectionType) throws Throwable {
        Thread.sleep(4000);
        base.driver.findElement(By.xpath("//h4[contains(text(),'" + connectionType + "')]")).click();

    }

    @Then("^the prices for the (\\d+)KW power rating contains the following$")
    public void thePricesForTheKWPowerRatingContainsTheFollowing(int arg0, DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        Thread.sleep(3000);
        YourPodPointPage yourPodPointPage = new YourPodPointPage(base.driver);
        assertThat(yourPodPointPage.getFullPrice(), is(equalTo(data.get(1).get(1))));
        assertThat(yourPodPointPage.getPriceWithOlevGrant(), is(equalTo(data.get(2).get(1))));
        fullPrice = Utility.extractAllNumbersFromXter(data.get(1).get(1));
    }


    @When("^I click on the \"([^\"]*)\" power rating$")
    public void iClickOnThePowerRating(String powerRating) throws Throwable {
        base.driver.findElement(By.xpath("//h4[contains(text(),'" + powerRating + "')]")).click();
    }


    @Then("^(\\d+) compatible extras are shown$")
    public void compatible_extras_are_shown(int numberOfCompartibleExtras) throws Throwable {
        YourPodPointPage yourPodPointPage = new YourPodPointPage(base.driver);
        Thread.sleep(4000);
        assertThat(yourPodPointPage.getTotalCompartibleExtras(), is(equalTo(numberOfCompartibleExtras)));
    }

    @When("^I choose the first compartible extra$")
    public void i_choose_the_first_compartible_extra() throws Throwable {
        YourPodPointPage yourPodPointPage = new YourPodPointPage(base.driver);
        priceOfFirstCompartibleExtra = Utility.extractAllNumbersFromXter(yourPodPointPage.getPriceOfFirstCompartibleExtraWithCurrency());
        yourPodPointPage.chooseFirstCompartibleExtra();
    }

    @Then("^the Total price correctly matches (\\d+)kw unit price plus the compartible extra price$")
    public void the_Total_price_correctly_matches_kw_unit_price_plus_the_compartible_extra_price(int arg1) throws Throwable {
        YourPodPointPage yourPodPointPage = new YourPodPointPage(base.driver);
        Thread.sleep(4000);
        totalPrice = Utility.extractAllNumbersFromXter(yourPodPointPage.getTotalPrice());
        assertThat(totalPrice, is(equalTo(priceOfFirstCompartibleExtra + fullPrice)));

        System.out.println(totalPrice);
        System.out.println(priceOfFirstCompartibleExtra);
        System.out.println(fullPrice);
    }


}
