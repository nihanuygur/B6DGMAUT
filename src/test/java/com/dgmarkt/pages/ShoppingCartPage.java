package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{

    // first product's update button in the Shopping Cart Page
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement updateButton;

    // first product's remove button in the Shopping Cart Page
    @FindBy(xpath = "//button[@data-original-title='Remove']")
    public WebElement removeButton;

    @FindBy(css = ".alert.alert-danger.alert-dismissible")
    public WebElement warningMessage;

    @FindBy(css = ".alert.alert-success.alert-dismissible")
    public WebElement successMessage;

    @FindBy(xpath = "//*[text()='Checkout']")
    public WebElement checkoutButton;


    public Boolean isProductAdded(String productName){
        WebElement product = Driver.get().findElement(By.xpath("//*[@class='text-left'][contains(text(),'" + productName + "')]"));

        return product.isDisplayed();

    }


}
