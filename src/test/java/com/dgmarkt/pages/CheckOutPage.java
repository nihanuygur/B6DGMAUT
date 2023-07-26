package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckOutPage extends BasePage {

    @FindBy(css = "div.text-danger")
    public WebElement message;


    @FindBy(xpath = "//input[@name='payment_address']")
    public WebElement existingAddressBilling;
    @FindBy(xpath = "//input[@name='shipping_address']")
    public WebElement existingAddressDelivery;

    @FindBy(xpath = "(//input[@name='payment_address'])[2]")
    public WebElement addNewAddress;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstnameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastnameInput;

    @FindBy(xpath = "//input[@name='address_1']")
    public WebElement address_1Input;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@name='postcode']")
    public WebElement postcodeInput;

    @FindBy(xpath = "//select[@name='country_id']")
    public List<WebElement> country_idDropdown;

    @FindBy(xpath = "//select[@name='zone_id']")
    public WebElement regionDropdown;

    @FindBy(css = "input#button-payment-address")
    public WebElement continueBillingDetails;

    @FindBy(css = "input#button-shipping-address")
    public WebElement continueDeliveryDetails;

    @FindBy(css = "input#button-shipping-method")
    public WebElement continueDeliveryMethod;

    @FindBy(css = "input#button-payment-method")
    public WebElement continuePaymentMethod;

    @FindBy(xpath = "//*[@name='agree']")
    public WebElement IAgreeButton;

    @FindBy(xpath = "//*[@value='Confirm Order']")
    public WebElement confirmOrderButton;

    @FindBy(xpath = "//*[@class='container-inner']/h1")
    public WebElement orderedMessage;

    @FindBy(xpath = "//*[@id='content']/p")
    public WebElement orderedMessage2;


    public void checkoutWithExistingAddress() {
        existingAddressBilling.click();
        continueBillingDetails.click();
        existingAddressDelivery.click();
        continueDeliveryDetails.click();
        continueDeliveryMethod.click();
        ((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", IAgreeButton);
        continuePaymentMethod.click();
        confirmOrderButton.click();

    }


    public List<WebElement> getMessages() {
        List<WebElement> messages = Driver.get().findElements(By.xpath("//div[@class='text-danger']"));
        return messages;
    }

    public String messagesPath() {
        String actualMessagesPath = "//div[@class='text-danger']";
        return actualMessagesPath;
    }


    public void addNewAddressInvalid(String firstName, String lastName, String company, String address1, String address2, String city, String postCode, String country, String state) {
        Select select = new Select(regionDropdown);

        addNewAddress.click();
        firstnameInput.sendKeys(firstName);
        lastnameInput.sendKeys(lastName);
        address_1Input.sendKeys(address1);
        cityInput.sendKeys(city);
        postcodeInput.sendKeys(postCode);
        select.selectByVisibleText(state);
        continueBillingDetails.click();

    }
}
