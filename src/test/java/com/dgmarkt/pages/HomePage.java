package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public void navigateMyAccount()
    {
        Actions actions = new Actions(Driver.get());
        WebElement dropDown = Driver.get().findElement(By.xpath("//li[@class='nav header-dropdown']"));
        actions.moveToElement(dropDown);
        actions.moveToElement(Driver.get().findElement(By.xpath("//a[text()='My Account']"))).click().perform();
    }




}
