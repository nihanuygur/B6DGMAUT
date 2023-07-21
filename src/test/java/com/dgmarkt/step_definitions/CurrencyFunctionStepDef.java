package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CurrencyFunctionStepDef {

    HomePage homePage = new HomePage();


    @Given("The user clicks {string} button")
    public void the_user_clicks_button(String currency) {
      homePage.currencyNav.click();
    }

    @Then("The sub-category is {string}")
    public void theSubCategoryIs(String currency) {
      //  homePage.navigateToCurrency(currency);
    }
}
