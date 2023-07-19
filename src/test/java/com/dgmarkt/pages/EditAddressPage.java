package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAddressPage extends BasePage {
    AddAddressPage addAddressPage=new AddAddressPage();
    @FindBy(xpath = "//h2[text()='Edit Address']")
    public WebElement editAddressHeader;

    public void clearData() {
        addAddressPage.inputBox("First Name").clear();
        addAddressPage.inputBox("Last Name").clear();
        addAddressPage.inputBox("Company").clear();
        addAddressPage.inputBox("Address 1").clear();
        addAddressPage.inputBox("City").clear();
        addAddressPage.inputBox("Post Code").clear();
    }
}
