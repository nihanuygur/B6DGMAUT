package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.EditAccountPage;
import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EditAccountStepDef {

    EditAccountPage editAccountPage=new EditAccountPage();
    HomePage homePage=new HomePage();

    @Given("The user clicks on the My Account button")
    public void theUserClicksOnTheMyAccountButton() {
        editAccountPage.myAccountFirstClick.click();
        editAccountPage.myAccountSecondClick.click();
    }

    @When("The user clicks on the Edit Account button")
    public void theUserClicksOnTheEditAccountButton() {
        editAccountPage.editAccount.click();
    }

    @When("The user updates the First Name as {string}")
    public void theUserUpdatesTheFirstNameAs(String firstName) {
        editAccountPage.editFirstName.clear();
        editAccountPage.editFirstName.sendKeys(firstName);
    }

    @When("The user updates the Last Name as {string}")
    public void theUserUpdatesTheLastNameAs(String lastName) {
        editAccountPage.editLastName.clear();
        editAccountPage.editLastName.sendKeys(lastName);
    }

    @Given("The user updates the email as {string}")
    public void theUserUpdatesTheEmailAs(String email) {
        editAccountPage.editEmailAddress.clear();
        editAccountPage.editEmailAddress.sendKeys(email);
    }

    @When("The user updates the telephone number as {string}")
    public void theUserUpdatesTheTelephoneNumberAs(String telephoneNum) {
        editAccountPage.editTelephoneNumber.clear();
        editAccountPage.editTelephoneNumber.sendKeys(telephoneNum);
    }

    @And("The user clicks on the Continue button")
    public void theUserClicksOnTheContinueButton() {
        editAccountPage.clickContinueButton.click();
    }

    @Then("The user updates their account successfully")
    public void theUserUpdatesTheirAccountSuccessfully() {
        Assert.assertTrue(editAccountPage.successfullyUpdate.isEnabled());
    }

    @And("The user clicks on the Back button")
    public void theUserClicksOnTheBackButton() {
        editAccountPage.clickBackButton.click();
        editAccountPage.editAccount.click();
    }

    @Then("The user can see the Edit Account without changes")
    public void theUserCanSeeTheEditAccountWithoutChanges() {
        Assert.assertEquals(editAccountPage.editFirstName.getAttribute("value"),"user2");
        Assert.assertEquals(editAccountPage.editLastName.getAttribute("value"),"one2");
        Assert.assertEquals(editAccountPage.editEmailAddress.getAttribute("value"),"userone2@gmail.com");
        Assert.assertEquals(editAccountPage.editTelephoneNumber.getAttribute("value"),"9876543210");
    }

    @Given("The user updates the First Name as blank")
    public void theUserUpdatesTheFirstNameAsBlank() {
        editAccountPage.editFirstName.clear();
    }

    @When("The user enters valid credentials for the Edit Account login")
    public void theUserEntersValidCredentialsForTheEditAccountLogin() {
        homePage.loginMyAccount();
    }

    @When("The user updates the Last Name as blank")
    public void theUserUpdatesTheLastNameAsBlank() {
        editAccountPage.editLastName.clear();
    }

    @Then("The user should not be able to update their Edit Account with blank First Name")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithBlankFirstName() {
        Assert.assertEquals(editAccountPage.firstNameAlert.getText(),"First Name must be between 1 and 32 characters!");
    }

    @Then("The user should not be able to update their Edit Account with blank Last Name")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithBlankLastName() {
        Assert.assertEquals(editAccountPage.lastNameAlert.getText(),"Last Name must be between 1 and 32 characters!");
    }

    @Given("The user updates the email as blank")
    public void theUserUpdatesTheEmailAsBlank() {
        editAccountPage.editEmailAddress.clear();
    }

    @Then("The user should not be able to update their Edit Account with blank email")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithBlankEmail() {
        Assert.assertEquals(editAccountPage.emailAlert.getText(),"E-Mail Address does not appear to be valid!");
    }

    @Then("The user should not be able to update their Edit Account with invalid E-Mail")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithInvalidEMail() {
        Assert.assertEquals(editAccountPage.emailAlert.getText(),"E-Mail Address does not appear to be valid!");
    }

    @Then("The user should not be able to update their Edit Account with invalid First Name")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithInvalidFirstName() {
        Assert.assertEquals(editAccountPage.firstNameAlert.getText(),"First Name must be between 1 and 32 characters!");
    }

    @Then("The user should not be able to update their Edit Account with invalid Last Name")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithInvalidLastName() {
        Assert.assertEquals(editAccountPage.lastNameAlert.getText(),"Last Name must be between 1 and 32 characters!");
    }

    @Then("The user should not be able to update their Edit Account with invalid Telephone")
    public void theUserShouldNotBeAbleToUpdateTheirEditAccountWithInvalidTelephone() {
        Assert.assertEquals(editAccountPage.telephoneAlert.getText(),"Telephone must be between 3 and 32 characters!");
    }

    @And("Change the default credentials for the Edit Account")
    public void changeTheDefaultCredentialsForTheEditAccount() {
        editAccountPage.editAccount.click();
        editAccountPage.editFirstName.clear();
        editAccountPage.editFirstName.sendKeys("user2");
        editAccountPage.editLastName.clear();
        editAccountPage.editLastName.sendKeys("one2");
        editAccountPage.editEmailAddress.clear();
        editAccountPage.editEmailAddress.sendKeys("userone2@gmail.com");
        editAccountPage.editTelephoneNumber.clear();
        editAccountPage.editTelephoneNumber.sendKeys("9876543210");
        editAccountPage.clickContinueButton.click();
    }
}
