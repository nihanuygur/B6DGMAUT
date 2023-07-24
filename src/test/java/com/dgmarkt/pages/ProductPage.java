package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(css = "button#button-cart")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityInput;




}
