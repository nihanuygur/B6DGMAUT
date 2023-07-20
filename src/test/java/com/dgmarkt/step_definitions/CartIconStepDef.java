package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.ProductPage;
import com.dgmarkt.pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartIconStepDef {

    HomePage homePage=new HomePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    ProductPage productPage = new ProductPage();
    @Given("The user hover over {string} product and clicks to the {string} icon.")
    public void theUserHoverOverProductAndClicksToTheIcon(String productName, String command) {
//        homePage.chooseProduct(productName);
//        homePage.chooseButtonGroup(command);
        homePage.navigateToProduct(productName,command);
    }

    @When("The user clicks shopping cart! link from pop-up message and closes the message")
    public void theUserClicksShoppingCartLinkFromPopUpMessageAndClosesTheMessage() {
        homePage.shoppingCartLink.click();
    }

    @Then("The user should see that the {string} has been added to the Shopping Cart page")
    public void theUserShouldSeeThatTheHasBeenAddedToTheShoppingCartPage(String productName) {
       Assert.assertTrue( shoppingCartPage.isProductAdded(productName));
    }

    @Given("The user selects {string} product and clicks to the {string} icon.")
    public void theUserSelectsProductAndClicksToTheIcon(String productName, String command) throws InterruptedException {
//        homePage.navigateToProduct(productName,command);
        productPage.addToCartFromProPage(productName);

    }
}
