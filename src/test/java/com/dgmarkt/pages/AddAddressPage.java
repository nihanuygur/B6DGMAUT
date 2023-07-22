package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddAddressPage extends BasePage {
    @FindBy(xpath = "//h2[text()='Add Address']")
    public WebElement addAddressHeader;
     @FindBy(xpath = "//select[@id='input-country']")
    public WebElement countryDropdown;

    @FindBy(xpath = "//select[@id='input-zone']")
    public WebElement regionDropdown;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continuebutton;



    public WebElement warningMessage(String message)
    {
        return Driver.get().findElement(By.xpath("//div[text()='"+message+"']"));

    }

    public WebElement inputBox(String inputName) {

        return Driver.get().findElement(By.xpath("//input[@placeholder='" + inputName + "']"));
    }

    public void enterData(String firstName, String lastName, String company, String address1, String city, String postcode) {
        inputBox("First Name").sendKeys(firstName);
        inputBox("Last Name").sendKeys(lastName);
        inputBox("Company").sendKeys(company);
        inputBox("Address 1").sendKeys(address1);
        inputBox("City").sendKeys(city);
        inputBox("Post Code").sendKeys(postcode);
    }


}
