package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.ProductComparePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductCompareStepDef {

    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    ProductComparePage productComparePage = new ProductComparePage();

    @When("The user clicks to Product Compare button")
    public void theUserClicksToProductCompareButton() {
        categoriesBasePage.compareProductNav.click();
    }


    @Then("The user should be able to see Product Comparison title")
    public void theUserShouldBeAbleToSeeProductComparisonTitle() {
        String expectedText = "Product Comparison";
        String actualText = productComparePage.ProductComparisonText.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @When("The user clicks the Compare this product button in the upper right corner of the photo of the product he wants to compare.")
    public void theUserClicksTheCompareThisProductButtonInTheUpperRightCornerOfThePhotoOfTheProductHeWantsToCompare() {

    }
}
