package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.ForgotPasswordPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ForgottenPasswordStepDef {

    HomePage homePage=new HomePage();

    ForgotPasswordPage forgotPasswordPage=new ForgotPasswordPage();

    @Given("The user in on the forgotten password page")
    public void theUserInOnTheForgottenPasswordPage() {
        homePage.dontShowAgain.click();
        homePage.closePopupButton.click();
        homePage.myAccountMenu.click();
        homePage.loginSubMenu.click();
        homePage.forgottenPassword.click();
        Assert.assertTrue(forgotPasswordPage.forgottenPasswordHeader.isDisplayed());
    }

    @When("The user enter {string}")
    public void the_user_enter(String email) {
        forgotPasswordPage.emailInput.sendKeys(email);
        forgotPasswordPage.continueButton.click();
    }
    @Then("The user should be able to {string}")
    public void the_user_should_be_able_to(String message) {
    String actualMessage=forgotPasswordPage.forgottenEmailMessage(message).getText();
    Assert.assertEquals(message,actualMessage);

        System.out.println("actualMessage = " + actualMessage);
    }



}
