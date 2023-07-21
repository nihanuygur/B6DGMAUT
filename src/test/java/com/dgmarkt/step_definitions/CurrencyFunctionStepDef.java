package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class CurrencyFunctionStepDef {

    HomePage homePage = new HomePage();


    @Given("The user clicks {string} button")
    public void the_user_clicks_button(String currency) {

        homePage.currencyNav.click();
    }


    @Then("The user selects {string} currency")
    public void theUserSelectsCurrency(String currencyName) throws InterruptedException {
        homePage.currencySelector(currencyName);
        Thread.sleep(500);
    }
}

