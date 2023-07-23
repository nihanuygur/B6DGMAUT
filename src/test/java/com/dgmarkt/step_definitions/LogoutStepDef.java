package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepDef {

    HomePage homePage=new HomePage();



    @Given("The user clicks My Account drop down menu and click logout option")
    public void theUserClicksMyAccountDropDownMenuAndClickLogoutOption() {
        homePage.myAccountMenu.click();
        homePage.logout.click();

    }

    @When("The user clicks continue button on the Account Logout pop-up")
    public void theUserClicksContinueButtonOnTheAccountLogoutPopUp() {
    }

    @Then("The user should be able to logout")
    public void theUserShouldBeAbleToLogout() {
    }
}
