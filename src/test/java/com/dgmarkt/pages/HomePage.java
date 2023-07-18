package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(className = "a-close-newsletter")
    public WebElement closePopupButton;


    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myAccountMenu;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginSubMenu;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()=' Congratulation! Login Successfully']")
    public WebElement successMessage;


    public void login(){
        closePopupButton.click();
        myAccountMenu.click();
        loginSubMenu.click();
        emailInput.sendKeys(ConfigurationReader.get("email"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }




}
