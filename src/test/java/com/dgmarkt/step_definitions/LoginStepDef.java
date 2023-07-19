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


    @Given("The user is on the home page")
    public void theUserIsOnTheHomePage() {
        Assert.assertTrue(homePage.closePopupButton.isDisplayed());
    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        homePage.login();
    }
    @And("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        Assert.assertTrue(homePage.successMessage.isDisplayed());
    }



}
