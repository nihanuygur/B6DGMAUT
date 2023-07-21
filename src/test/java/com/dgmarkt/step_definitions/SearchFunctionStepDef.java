package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SearchFunctionStepDef {
    HomePage homePage = new HomePage();


    @Given("The user clicks to {string}")
    public void the_user_clicks_to(String searchButton) {
        homePage.searchButton.click();

    }

    @Then("The user clicks the {string}")
    public void theUserClicksThe(String searchArea) {
        homePage.searchArea.click();

    }

    @Then("The user should write {string} at searching area and click {string}")
    public void theUserShouldWriteAtSearchingAreaAndClick(String TV, String searchButton2) throws InterruptedException {

        homePage.searchArea.sendKeys("TV");
        Thread.sleep(500);
        homePage.searchButton2.click();
    }



    @And("Verify that {string} screen is displayed")
    public void verifyThatScreenIsDisplayed(String searchTV) {
        Assert.assertEquals(homePage.searchTV.getText(), "Search - TV");
    }


    @And("Verify that displayed {string} contains TV")
    public void verifyThatDisplayedContainsTV(String productTV) {
        Assert.assertTrue(homePage.productTV.isDisplayed());
    }
    @Then("The user can write {string} at searching area and click {string}")
    public void theUserCanWriteAtSearchingAreaAndClick(String apple, String searchButton2) throws InterruptedException {
        homePage.searchArea.sendKeys("apple");
        Thread.sleep(500);
        homePage.searchButton2.click();
    }
    @And("Verify that {string} message is displayed")
    public void verifyThatMessageIsDisplayed(String productNotFoundMsg) {

        Assert.assertTrue(homePage.productNotFoundMsg.isDisplayed());

    }


}
