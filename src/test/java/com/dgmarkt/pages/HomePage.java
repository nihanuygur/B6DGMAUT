package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

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

    @FindBy(xpath = "//*[text()=' Congratulation! Login Successfully']")
    public WebElement successMessage;

    @FindBy(css = ".cbk_newsletter")
    public WebElement dontShowAgain;

    @FindBy(id = "logo")
    public WebElement logo;

    @FindBy(id = "search-by-category")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@id='btn-search-category']")
    public WebElement searchButton2;

    @FindBy(id = "wishlist-total")
    public WebElement wishListButton;

    @FindBy(xpath = "//*[@id='cart']/button")
    public WebElement cartButton;

    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryNav;

    @FindBy(xpath = "//*[@name='search']")
    public WebElement searchArea;

    @FindBy(xpath = "(//*[text()='Search - TV'])[2]")
    public WebElement searchTV;

    @FindBy(xpath = "(//a[contains(text(),'TV')])[2]")
    public WebElement productTV;

    @FindBy(xpath = "//p[text()='There is no product that matches the search criteria.']")
    public WebElement productNotFoundMsg;

    @FindBy(xpath = "//*[text()='shopping cart']")
    public WebElement shoppingCartLink;


    @FindBy(xpath = "//*[text()=' Success: You have added ']")
    public WebElement successfullyAddedMessage;
    @FindBy(css = "button.close")
    public WebElement closeMessageButton;

    @FindBy(xpath = "//*[text()=' View Cart']")
    public WebElement viewCartButton;
    @FindBy(css = "p.text-center")
    public WebElement cartEmptyMessage;


    @FindBy(xpath = "//div[text()=' Warning: No match for E-Mail Address and/or Password.']")
    public WebElement loginWarningMessage;

    @FindBy(css = ".forgotten")
    public WebElement forgottenPassword;

    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logout;

    @FindBy(xpath = "(//span[text()='Continue'])[2]")
    public WebElement logoutContinue;

    // after checking of get url it will be usable
    @FindBy (xpath = "//*[text()='Returning Customer']")
    public WebElement returningCustomer;

    public void login() {
        dontShowAgain.click();
        closePopupButton.click();
        myAccountMenu.click();
        loginSubMenu.click();
        emailInput.sendKeys(ConfigurationReader.get("email"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();

    }

    public void loginForNegativeScenarios(String mail, String password) {
        dontShowAgain.click();
        closePopupButton.click();
        myAccountMenu.click();
        loginSubMenu.click();
        emailInput.sendKeys(mail);
        passwordInput.sendKeys(password);
        loginButton.click();
    }


    public void navigateToCategory(String categoryName) {
        //hovering over to category navigator
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(categoryNav).perform();

        //clicking to the category
        Driver.get().findElement(By.xpath("//a[text()='" + categoryName + "']")).click();
    }


    public void navigateToRegisterPage() {
        closePopupButton.click();
        myAccountMenu.click();
        registerSubMenu.click();
    }

    public void navigateMyAccount() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        WebElement dropDown = Driver.get().findElement(By.xpath("//li[@class='nav header-dropdown']"));
        actions.moveToElement(dropDown);
        actions.moveToElement(Driver.get().findElement(By.xpath("//a[text()='My Account']"))).click().perform();

    }

    public void loginMyAccount(){
        dontShowAgain.click();
        closePopupButton.click();
        myAccountMenu.click();
        loginSubMenu.click();
        emailInput.sendKeys("userone2@gmail.com");
        passwordInput.sendKeys("userone22");
        loginButton.click();
    }

}
