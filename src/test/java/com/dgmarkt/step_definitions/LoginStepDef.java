package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDef {


    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("The user is on the login panel")
    public void the_user_is_on_the_login_panel() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters the given credentials and clicks login button")
    public void the_user_enters_the_given_credentials_and_clicks_login_button() {
        loginPage.login();
    }
    @Then("Verify that the user is on the Home Page")
    public void verify_that_the_user_is_on_the_home_page() {
        Assert.assertTrue(homePage.closePopupButton.isDisplayed());
    }
}
