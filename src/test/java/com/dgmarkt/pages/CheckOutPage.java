package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutPage extends BasePage{

    @FindBy(css = "div.text-danger")
    public List<WebElement> messages;


    @FindBy(xpath = "//div[@class='radio']")
    public WebElement existingAddress;

    @FindBy(xpath = "//div[@class='radio'][2]")
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
    public List<WebElement> RegionDropdown;

    @FindBy(css = "input#button-payment-address")
    public List<WebElement> continueBillingDetails;

    @FindBy(css = "input#button-shipping-address")
    public List<WebElement> continueDeliveryDetails;


}
