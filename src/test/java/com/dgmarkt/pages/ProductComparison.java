package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparison extends BasePage{

    @FindBy(xpath = "//table/tbody/tr/td[text()='Capsule Plate 6pcs']")
    public WebElement product1;

}
