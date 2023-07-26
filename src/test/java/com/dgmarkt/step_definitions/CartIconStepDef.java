package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class  CartIconStepDef {

    HomePage homePage = new HomePage();
    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    ProductPage productPage = new ProductPage();


    @Given("The user selects {string} product and clicks to the Add to Cart icon.")
    public void the_user_selects_product_and_clicks_to_the_icon(String productName) {
        categoriesBasePage.goToProductPage(productName);
    }

    @When("The user clicks shopping cart! link from pop-up message and closes the message")
    public void the_user_clicks_shopping_cart_link_from_pop_up_message_and_closes_the_message() {

        categoriesBasePage.shoppingCartLink.click();
    }

    @Then("The user should see that the {string} has been added to the Shopping Cart page")
    public void the_user_should_see_that_the_has_been_added_to_the_shopping_cart_page(String productName) {
        assertTrue(shoppingCartPage.isProductAdded(productName));
    }

    @Given("The user hover over {string} product and clicks to the {string} icon.")
    public void theUserHoverOverProductAndClicksToTheIcon(String productName, String commend) {
        categoriesBasePage.hoverAndAddProduct(productName, commend);
    }

    @Then("The user should see product successfully added message")
    public void theUserShouldSeeProductSuccessfullyAddedMessage() {
        assertTrue(homePage.closeMessageButton.isDisplayed());
        homePage.closeMessageButton.click();
    }

    @And("The user should be able to access the cart from the view cart button")
    public void theUserShouldBeAbleToAccessTheCartFromTheViewCartButton() {
        homePage.cartButton.click();
        homePage.viewCartButton.click();

    }

    @Given("The user clicks Checkout button and navigates to Checkout Page")
    public void the_user_clicks_checkout_button_and_navigates_to_checkout_page() {
//        shoppingCartPage.checkoutButton.click();
        shoppingCartPage.checkoutBtnShoppingCart.click();
    }

    @When("The user clicks radio button to use existing address and then click on Continue button in Billing Details")
    public void the_user_clicks_radio_button_to_use_existing_address_and_then_click_on_continue_button_in_billing_details() {
//        checkOutPage.existingAddressBilling.click();
        checkOutPage.continueBillingDetails.click();
    }

    @When("The user clicks radio button to use existing address and then click on Continue button in Delivery Details")
    public void the_user_clicks_radio_button_to_use_existing_address_and_then_click_on_continue_button_in_delivery_details() {
//        checkOutPage.existingAddressDelivery.click();
        checkOutPage.continueDeliveryDetails.click();

    }

    @When("The user controls if is it clicked Flat Shipping Rate the radio button and clicks on Continue button.")
    public void the_user_controls_if_is_it_clicked_flat_shipping_rate_the_radio_button_and_clicks_on_continue_button() {

        checkOutPage.continueDeliveryMethod.click();

    }

    @When("The user controls if is it clicked Cash On Delivery the radio button and then clicks on I agree button and Continue button.")
    public void the_user_controls_if_is_it_clicked_cash_on_delivery_the_radio_button_and_then_clicks_on_i_agree_button_and_continue_button() throws InterruptedException {

        checkOutPage.IAgreeButton.click();
        checkOutPage.continuePaymentMethod.click();

    }

    @Then("The user should be able to click on Confirm Order button")
    public void the_user_should_be_able_to_click_on_confirm_order_button() {
        checkOutPage.confirmOrderButton.click();

    }

    @And("The user should be able to see {string} message")
    public void theUserShouldBeAbleToClickOnTheCartSymbolButtonAndSeeMessage(String expectedMessage) throws InterruptedException {
        Thread.sleep(1000);
        assertEquals(expectedMessage, checkOutPage.orderedMessage.getText());

    }

    @When("The user should be able to complete checkout with valid inputs")
    public void theUserShouldBeAbleToCompleteCheckoutWithValidInputs() {
        checkOutPage.checkoutWithExistingAddress();
    }

    @When("The user clicks add New Address option and leaves empty required fields then clicks on Continue button in Billing Details")
    public void theUserClicksAddNewAddressOptionAndLeavesEmptyRequiredFieldsThenClicksOnContinueButtonInBillingDetails() {
        checkOutPage.addNewAddress.click();
        checkOutPage.continueBillingDetails.click();
    }

    @And("The user should be able to see the error messages about fields")
    public void theUserShouldBeAbleToSeeTheErrorMessagesAboutFields(List<String> expectedMessages) {
//        List<WebElement> actualMessages = checkOutPage.getMessages();
//        System.out.println("actualMessages.size() = " + actualMessages.size());
//        for (WebElement item :actualMessages) {
//            System.out.println("item.getText()" + item.getText());
//            for (int i = 0; i < actualMessages.size(); i++) {
//                System.out.println("expectedMessages.get(i) = " + expectedMessages.get(i));
//                assertEquals(expectedMessages.get(i), item.getText());
//
//            }
//        }
        List<String> actualList = BrowserUtils.getElementsText(By.xpath(checkOutPage.messagesPath()));
        Assert.assertEquals(expectedMessages, actualList);

    }

    @When("The user clicks add New Address option and {string},{string},{string},{string},{string},{string},{string},{string},{string} then clicks on Continue button in Billing Details")
    public void theUserClicksAddNewAddressOptionAndThenClicksOnContinueButtonInBillingDetails(String firstName, String lastName, String category, String address1, String address2, String city, String postCode, String country, String state) {
        checkOutPage.addNewAddressInvalid(firstName, lastName, category, address1, address2, city, postCode, country, state);
    }

    @And("The user should be able to see the error {string} about fields")
    public void theUserShouldBeAbleToSeeTheErrorAboutFields(String expectedMessage) {
        for (WebElement item : checkOutPage.getMessages()) {
            assertEquals(expectedMessage, item.getText());
        }
    }

    @Given("The user selects {string} product and navigates to product's page.")
    public void theUserSelectsProductAndNavigatesToProductSPage(String productName) {
        categoriesBasePage.goToProductPage(productName);

    }

    @Given("The user updates Quantity Area as {string} and clicks to the Add to Cart icon.")
    public void theUserUpdatesQuantityAreaAsAndClicksToTheAddToCartIcon(String number) {
        productPage.quantityInput.clear();
        productPage.quantityInput.sendKeys(number);
        productPage.addToCartBtn.click();

    }

    @When("The user should click Remove button")
    public void theUserShouldClickRemoveButton() {
        shoppingCartPage.removeButton.click();
    }

    @Then("The {string} should not be in the cart")
    public void theShouldNotBeInTheCart(String productName) {
        assertTrue(shoppingCartPage.emptyMessage.isDisplayed());
    }

    @When("The user should click Update button after entering {string} to Quantity area")
    public void theUserShouldClickUpdateButtonAfterEnteringToQuantityArea(String number) {
        shoppingCartPage.updateQuantity(number);

    }

    @Then("The user should be able to see the Success message on the Shopping Page")
    public void theUserShouldBeAbleToSeeMessageOnTheShoppingPage() {
        assertTrue(shoppingCartPage.successMessage.isDisplayed());
    }
}
