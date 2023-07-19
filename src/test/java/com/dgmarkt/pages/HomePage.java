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

    @FindBy(id = "logo")
    public WebElement logo;

    @FindBy(id = "search-by-category")
    public WebElement searchButton;

    @FindBy(xpath = "//button[@id='btn-search-category']")
    public WebElement searchButton2;

    @FindBy(id = "wishlist-total")
    public WebElement wishListButton;

    @FindBy(id = "cart")
    public WebElement cartButton;

    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryNav;

    @FindBy(xpath = "//*[@name='search']")
    public WebElement searchArea;

    @FindBy(xpath = "(//*[text()='Search - TV'])[2]")
    public WebElement searchTV;

    public void login(){
        closePopupButton.click();
        myAccountMenu.click();
        loginSubMenu.click();
        emailInput.sendKeys(ConfigurationReader.get("email"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
    }

    public void navigateToCategory(String categoryName){
        //hovering over to category navigator
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(categoryNav).perform();

        //clicking to the category
        Driver.get().findElement(By.xpath("//a[text()='"+categoryName+"']")).click();
    }



}
