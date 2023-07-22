package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterStepDef {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("The User is on the Register Page")
    public void the_user_is_on_the_register_page() {

        homePage.navigateToRegisterPage();
    }

    @When("The User registers by entering  {string} , {string} , {string} and {string}")
    public void the_user_registers_by_entering_and(String firstName, String lastName, String telephone, String password) {
        registerPage.register1(firstName, lastName, telephone, password);
    }

    @Then("The User should be able to register")
    public void the_user_should_be_able_to_register() {
        Assert.assertTrue(registerPage.registrationSuccessfulPage.isEnabled());
    }


    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {

        String actualMessage = registerPage.errorMessage.getText();


        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage, actualMessage);
    }


    @When("The User registers by entering  {string} , {string} ,{string} ,{string}, {string} and {string}")
    public void theUserRegistersByEnteringAnd(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {

        registerPage.register2(firstName, lastName, email, telephone, password, passwordConfirm);
    }
}
