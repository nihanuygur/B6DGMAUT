package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage{

    @FindBy(xpath ="//span[text()='My Account']")
    public WebElement  myAccountFirstClick;

    @FindBy(xpath ="//a[text()='My Account']")
    public WebElement  myAccountSecondClick;

    @FindBy(xpath ="//a[text()='Edit Account']")
    public WebElement  editAccount;

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement editFirstName;

    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement editLastName;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement editEmailAddress;

    @FindBy(xpath = "//input[@id='input-telephone']")
    public WebElement editTelephoneNumber;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement clickContinueButton;

    @FindBy(xpath = "//a[text()='Back']")
    public WebElement clickBackButton;

    @FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
    public WebElement successfullyUpdate;

    @FindBy(xpath = "//div[@class='text-danger']")
    public WebElement firstNameAlert;

    @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
    public WebElement lastNameAlert;

    @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
    public WebElement emailAlert;

    @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
    public WebElement telephoneAlert;



}
