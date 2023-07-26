package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.CheckOutPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CurrencyFunctionStepDef {

    HomePage homePage = new HomePage();
    CategoriesBasePage categoriesBasePage=new CategoriesBasePage();
    CheckOutPage checkOutPage=new CheckOutPage();


    @Given("The user clicks {string} button")
    public void the_user_clicks_button(String currency) {

        homePage.currencyNav.click();
    }

    @Then("The user selects{string} currency")
    public void theUserSelectsCurrency(String currencyName) throws InterruptedException {
        homePage.selectCurrency(currencyName);
        Thread.sleep(1000);
    }

    @And("Verify that currency selected {string} by the user matches the currency on the products")
    public void verifyThatCurrencySelectedByTheUserMatchesTheCurrencyOnTheProducts(String currencyName) {

        BrowserUtils.scrollToElement(categoriesBasePage.firstProductsPrice);
      Assert.assertTrue(categoriesBasePage.firstProductsPrice.getText().contains(currencyName));
    }

    @Given("The user hover over {int} th product and clicks to the {string} icon.")
    public void theUserHoverOverThProductAndClicksToTheIcon(int index, String command) {
        categoriesBasePage.selectProductWithIndex(index);
    }


    @And("Verify that Flat Shipping rate matches selected {string}")
    public void verifyThatFlatShippingRateMatchesSelected(String ExpectedCurrencyType) {
        String actualResult=checkOutPage.flatShippingRate.getText();
        Assert.assertTrue(actualResult.contains(ExpectedCurrencyType));


    }
}


