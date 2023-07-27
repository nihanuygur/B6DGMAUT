package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderHistoryStepDef {

    HomePage homePage = new HomePage();
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    ProductReturnPage productReturnPage = new ProductReturnPage();
    AccountPage accountPage = new AccountPage();

    CheckOutPage checkOutPage = new CheckOutPage();

    @Given("The user clicks My Account menu and navigates to {string} Page")
    public void theUserClicksMyAccountMenuAndNavigatesToPage(String subMenu) {
        BrowserUtils.scrollToElement(homePage.myAccountMenu);
        homePage.navigateSubMenuOfMyAccount(subMenu);

    }

    @When("The user clicks {string} icon to see the order histories")
    public void theUserClicksViewIconToSeeAllOrderHistories(String command) {
        orderHistoryPage.orderViewIcon.click();
    }


    @And("The user should see the product's name {string} on the {string} page")
    public void theUserShouldSeeTheProductSNameOnTheOrderHistoryInformationPage(String productName, String pageName) {
        assertTrue(orderHistoryPage.productName.getText().toLowerCase().contains(productName.toLowerCase()));
    }

    @When("The user should click {string} icon for the product")
    public void theUserShouldClickReorderIconForTheProduct(String commend) {
        orderHistoryPage.addOrRemove(commend);
    }

    @Then("Verify that the user is on the {string} page")
    public void verifyThatTheUserIsOnThePage(String pageName) {
        assertEquals(pageName, homePage.currentPageHeader.getText());
    }

    @When("The user complete the form on the Product Returns Page and clicks submit button")
    public void theUserCompleteTheFormOnTheProductReturnsPageAndClicksSubmitButton() {
        productReturnPage.completeReturn("3");

    }

    @Then("The user should be able to see return request message")
    public void theUserShouldBeAbleToSeeReturnRequestMessage() {
        assertTrue(productReturnPage.message.isDisplayed());
    }

    @When("The user clicks view button on the product returns page")
    public void theUserClicksViewButtonOnTheProductReturnsPage() {
        orderHistoryPage.orderViewIcon.click();
    }

    @And("The user should see that the {string} as the returned product on Product Returns Page")
    public void theUserShouldSeeThatTheAsTheReturnedProductOnProductReturnsPage(String productName) {
        assertTrue(orderHistoryPage.productName.getText().toLowerCase().contains(productName.toLowerCase()));
    }

    @When("The user clicks {string} tab to see returned products")
    public void theUserClicksTabToSeeReturnedProducts(String tabName) {
        accountPage.clickMenu(tabName);
    }

    @Then("The user should be able to see warning message for the invalid inputs")
    public void theUserShouldBeAbleToSeeWarningMessageForTheInvalidInputs() {
        assertTrue(checkOutPage.message.isDisplayed());
    }

    @When("The user keeps the form fields empty and unchecked on the Product Returns Page or clicks submit button")
    public void theUserKeepsTheFormFieldsEmptyAndUncheckedOnTheProductReturnsPageAndClicksSubmitButton() {
        productReturnPage.submitButton.click();
    }
}
