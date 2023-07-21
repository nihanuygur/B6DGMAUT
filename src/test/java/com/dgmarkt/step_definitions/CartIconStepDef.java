package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.ProductPage;
import com.dgmarkt.pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartIconStepDef {

    HomePage homePage = new HomePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    ProductPage productPage = new ProductPage();


    @Given("The user selects {string} product and clicks to the {string} icon.")
    public void the_user_selects_product_and_clicks_to_the_icon(String product, String command) {

    }
    @When("The user clicks shopping cart! link from pop-up message and closes the message")
    public void the_user_clicks_shopping_cart_link_from_pop_up_message_and_closes_the_message() {
    }
    @Then("The user should see that the {string} has been added to the Shopping Cart page")
    public void the_user_should_see_that_the_has_been_added_to_the_shopping_cart_page(String product) {
    }
}
