package com.dgmarkt.step_definitions;

import com.beust.ah.A;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LogoutStepDef {

    HomePage homePage = new HomePage();



    @Given("The user clicks My Account drop down menu and click logout option")
    public void theUserClicksMyAccountDropDownMenuAndClickLogoutOption() {
        homePage.myAccountMenu.click();
        homePage.logout.click();

    }

    @When("The user clicks continue button on the Account Logout pop-up")
    public void theUserClicksContinueButtonOnTheAccountLogoutPopUp() {
        homePage.logoutContinue.click();
    }

    @Then("The user should be able to logout")
    public void theUserShouldBeAbleToLogout() {
        homePage.myAccountMenu.click();
        Assert.assertTrue("verify that login button is displayed",homePage.loginSubMenu.isDisplayed());
    }

    @When("The user presses Browser's Back button")
    public void theUserPressesBrowserSBackButton() {
    Driver.get().navigate().back();
    }

}
