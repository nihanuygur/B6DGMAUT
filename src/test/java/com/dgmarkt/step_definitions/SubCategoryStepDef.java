package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.SubCategoryPage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class SubCategoryStepDef {
    HomePage homePage=new HomePage();
    SubCategoryPage subCategoryPage=new SubCategoryPage();

    @When("The user moves to Category button")
    public void theUserMovesToCategoryButton() throws InterruptedException {
        homePage.dontShowAgain.click();
        homePage.closePopupButton.click();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(subCategoryPage.categoryButton).perform();
        Thread.sleep(3000);

    }

    @When("The user can see the sub categories")
    public void theUserCanSeeTheSubCategories() {
        Assert.assertEquals(subCategoryPage.healthAndBeautyButton.getText(),"HEALTH & BEAUTY");
        Assert.assertEquals(subCategoryPage.televisionsButton.getText(),"TELEVISIONS");
        Assert.assertEquals(subCategoryPage.tvAccessoriesButton.getText(),"TV ACCESSORIES");
        Assert.assertEquals(subCategoryPage.networkingButton.getText(),"NETWORKING");
    }

    @When("The user clicks on the Health & Beauty sub-button")
    public void theUserClicksOnTheHealthBeautySubButton() {
        subCategoryPage.healthAndBeautyButton.click();
    }

    @Then("The user is on the Health & Beauty page")
    public void theUserIsOnTheHealthBeautyPage() {
        Assert.assertEquals(subCategoryPage.healthAndBeautyPage.getText(),"Health & Beauty");
    }

    @When("The user clicks on the Televisions sub-button")
    public void theUserClicksOnTheTelevisionsSubButton() {
        subCategoryPage.televisionsButton.click();
    }

    @Then("The user is on the Televisions page")
    public void theUserIsOnTheTelevisionsPage() {
        Assert.assertEquals(subCategoryPage.televisionsPage.getText(),"Televisions");
    }

    @When("The user clicks on the TV Accessories sub-button")
    public void theUserClicksOnTheTVAccessoriesSubButton() {
        subCategoryPage.tvAccessoriesButton.click();
    }

    @Then("The user is on the TV Accessories page")
    public void theUserIsOnTheTVAccessoriesPage() {
        Assert.assertEquals(subCategoryPage.tvAccessoriesPage.getText(),"TV Accessories");
    }

    @When("The user clicks on the Networking sub-button")
    public void theUserClicksOnTheNetworkingSubButton() {
        subCategoryPage.networkingButton.click();
    }

    @Then("The user is on the Networking page")
    public void theUserIsOnTheNetworkingPage() {
        Assert.assertEquals(subCategoryPage.networkingPage.getText(),"Networking");
    }
}
