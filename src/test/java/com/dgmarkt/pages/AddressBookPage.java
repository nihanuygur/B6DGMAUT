package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage{
    @FindBy(xpath = "//div[h2='Address Book Entries']")
    public WebElement addressBookheader;

    @FindBy(xpath = "//a[text()='New Address']")
    public WebElement newAddressButton;

    @FindBy(xpath = "//a[text()='Edit']")
    public WebElement editButton;







}
