package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartIconStepDef {

    HomePage homePage=new HomePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    @Given("The user hover over {string} product and clicks to the Add To Cart icon.")
    public void theUserHoverOverProductAndClicksToTheAddToCartIcon(String productName) {

//        System.out.println(productName);
//        System.out.println("//*[text()='" + productName + "']");
        homePage.navigateToProduct(productName);
//        homePage.addToCartWithIcon(productName);

    }
    @When("The user clicks shopping cart! link from pop-up message and closes the message")
    public void theUserClicksShoppingCartLinkFromPopUpMessageAndClosesTheMessage() {

//        homePage.goToCartByClickingShoppingCardLink();
    }


    @Then("The user should see that the {string} has been added to the Shopping Cart page")
    public void theUserShouldSeeThatTheHasBeenAddedToTheShoppingCartPage(String productName) {
//        Assert.assertTrue(shoppingCartPage.isProductAdded(productName));
    }

//    @Then("The user should see that the {string} has been added to the Shopping Cart page")
//    public void theUserShouldSeeThatTheHasBeenAddedToTheShoppingCartPage(String productName) {
//        Assert.assertTrue(shoppingCartPage.isProductAdded(productName));
//    }
}
