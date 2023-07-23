package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.ShoppingCartPage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CartIconStepDef {

    HomePage homePage = new HomePage();
    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();


    @Given("The user selects {string} product and clicks to the {string} icon.")
    public void the_user_selects_product_and_clicks_to_the_icon(String productName, String command)  {
        categoriesBasePage.goToProductPage(productName);
    }

    @When("The user clicks shopping cart! link from pop-up message and closes the message")
    public void the_user_clicks_shopping_cart_link_from_pop_up_message_and_closes_the_message()  {

        Driver.get().findElement(By.xpath("//a[normalize-space()='shopping cart']")).click();
    }

    @Then("The user should see that the {string} has been added to the Shopping Cart page")
    public void the_user_should_see_that_the_has_been_added_to_the_shopping_cart_page(String productName) {
        Assert.assertTrue(shoppingCartPage.isProductAdded(productName));
    }

    @Given("The user hover over {string} product and clicks to the {string} icon.")
    public void theUserHoverOverProductAndClicksToTheIcon(String productName, String commend) {
        categoriesBasePage.hoverAndAddProduct(productName,commend);
    }

    @Then("The user should see product successfully added message")
    public void theUserShouldSeeProductSuccessfullyAddedMessage() {
        Assert.assertTrue(homePage.closeMessageButton.isDisplayed());
        homePage.closeMessageButton.click();
    }

    @And("The user should be able to access the cart from the view cart button")
    public void theUserShouldBeAbleToAccessTheCartFromTheViewCartButton() {
        homePage.cartButton.click();
        homePage.viewCartButton.click();

    }
}
