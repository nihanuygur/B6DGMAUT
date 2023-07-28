package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage{
    @FindBy(className = "a-close-newsletter")
    public WebElement closePopupButton;


    @FindBy(xpath = "//*[text()='My Account']")
    public WebElement myAccountMenu;

    @FindBy(xpath = "//a[text()='Login']")
    public WebElement loginSubMenu;

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement registerSubMenu;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement loginButton;


    @FindBy(css = ".cbk_newsletter")
    public WebElement dontShowAgain;
    @FindBy (xpath = "//*[text()='Password must be between 4 and 20 characters!")
    public WebElement message;
    @FindBy (xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    public void fillPasswordFields(String passwordOrConfirmPass,String input){
     Driver.get().findElement(By.xpath("//input[@placeholder='" + passwordOrConfirmPass + "']")).sendKeys(input);
    }
    public WebElement changePassMessages(String message) {

       return Driver.get().findElement(By.xpath("//div[contains(text(),'" + message + "')]"));

    }


    public void login(String email, String password) {
        dontShowAgain.click();
        closePopupButton.click();
        myAccountMenu.click();
        loginSubMenu.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
}
