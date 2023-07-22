package com.dgmarkt.step_definitions;
import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ProductViewStepDef  {
    HomePage homePage = new HomePage();
    CategoriesBasePage categoryPage = new CategoriesBasePage();


    @Given("The user hovers over the category and selects one of the four sub-categories {string}from the sub-categories.")
    public void theUserHoversOverTheCategoryAndSelectsOneOfTheFourSubCategoriesFromTheSubCategories(String categoryName) {
        homePage.navigateToCategory(categoryName);{

        }
    }
    @When("user click on product view icon{string}")
    public void userClickOnProductViewIcon(String viewOption) {
        categoryPage.selectViewOption(viewOption);

    }
    @Then("Check if the product view has changed after the user clicks on the product view icon")
    public void checkIfTheProductViewHasChangedAfterTheUserClicksOnTheProductViewIcon() {

    }
}


