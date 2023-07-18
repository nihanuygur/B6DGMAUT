package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AccountPage;
import com.dgmarkt.pages.AddAddressPage;
import com.dgmarkt.pages.AddressBookPage;
import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class AddAddressStepDef {
    HomePage homePage=new HomePage();
    AccountPage accountPage=new AccountPage();
    AddressBookPage addressBookPage=new AddressBookPage();
    AddAddressPage addAddressPage=new AddAddressPage();
    @Given("The user clicks My Account menu and navigates to My Account Page")
    public void the_user_clicks_my_account_menu_and_navigates_to_my_account_page() {
        homePage.navigateMyAccount();
        Assert.assertTrue(accountPage.accountHeader.isDisplayed());

    }
    @Then("The user clicks Address Book and navigates to the Address Book Entries")
    public void the_user_clicks_address_book_and_navigates_to_the_address_book_entries() {
        accountPage.clickMenu("Address Book");
        Assert.assertTrue(addressBookPage.addressBookheader.isDisplayed());


    }
    @Then("The user clicks New Address button and navigates to Add Address page")
    public void the_user_clicks_new_address_button_and_navigates_to_add_address_page() {
        addressBookPage.newAddressButton.click();
        Assert.assertTrue(addAddressPage.addAddressHeader.isDisplayed());

    }

    @Given("The user is on the Add Address Page")
    public void theUserIsOnTheAddAddressPage() {
        Assert.assertTrue(addAddressPage.addAddressHeader.isDisplayed());
    }

    @When("The user fills the Add Address form with data {string} and {string} and {string} and {string} and {string} and {string}")
    public void theUserFillsTheAddAddressFormWithInvalidFirstnameAndAndAndAndAnd(String firstName, String lastName, String company, String address1, String city, String postcode) {
        addAddressPage.enterData(firstName, lastName,company, address1, city,postcode);

    }
    @And("The user selects country as {string}")
    public void theUserSelectsCountryAs(String country) {
        Select select = new Select(addAddressPage.countryDropdown);
        select.selectByVisibleText(country);
    }

    @And("The user selects {string} as RegionState")
    public void the_user_selects_as_region_state(String region) {
        Select select =new Select(addAddressPage.regionDropdown);
        select.selectByVisibleText(region);

    }

@Then("The user clicks continue button and see warning {string}")
public void theUserClicksContinueButtonAndSeeWarning(String message) {
          addAddressPage.continuebutton.click();
        Assert.assertTrue(addAddressPage.warningMessage(message).isDisplayed());
}



    @When("The user does not select any country")
    public void the_user_does_not_select_any_country() {
        Select select = new Select(addAddressPage.countryDropdown);
        select.selectByIndex(0);

    }

    @And("The user does not select any region and state")
    public void theUserDoesNotSelectAnyRegionAndState() {
        Select select =new Select(addAddressPage.regionDropdown);
        select.selectByIndex(0);
    }





}
