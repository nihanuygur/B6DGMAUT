package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparison extends BasePage{

    @FindBy(xpath = "//table/tbody/tr/td[text()='Capsule Plate 6pcs']")
    public WebElement product1;

    @FindBy(xpath = "//table/thead/tr/td[@colspan='2']")
    public WebElement columnNumber;
    @FindBy(xpath = "//table/thead/tr/td[@colspan='5']")
    public WebElement columnNumber5;

}
