package com.dgmarkt.step_definitions;


import com.dgmarkt.pages.AccountPage;
import com.dgmarkt.pages.ChangePasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ChangePasswordStepDef {
    AccountPage accountPage = new AccountPage();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    @When("The user enters valid credentials {string} and {string} for login")
    public void theUserEntersValidCredentialsAndForLogin(String email, String password) {
          changePasswordPage.login(email,password);
    }


    @When("User click on {string} under My Account")
    public void user_click_on_under_my_account(String changePass) {
        accountPage.chooseFromMyAccount(changePass);
    }

    @And("User in {string} add {string}")
    public void userInAdd(String chosePass, String sendPass) {
        changePasswordPage.fillPasswordFields(chosePass,sendPass);
    }


    @Then("The user click Continue button and can see the {string}")
    public void theUserClickContinueButtonAndCanSeeThe(String message) {
        changePasswordPage.continueButton.click();
        String actualMessage = changePasswordPage.changePassMessages(message).getText();
        System.out.println("actualMessage = " + actualMessage);
      Assert.assertEquals(message,actualMessage);



    }




    @And("Change the default credentials go to {string} and {string} and {string} for the change Password")
    public void changeTheDefaultCredentialsGoToAndAndForTheChangePassword(String changePass, String pass, String confirmPass) {
        accountPage.chooseFromMyAccount(changePass);
        changePasswordPage.fillPasswordFields("Password",pass);
        changePasswordPage.fillPasswordFields("Password Confirm",confirmPass);
        changePasswordPage.continueButton.click();
    }
}
