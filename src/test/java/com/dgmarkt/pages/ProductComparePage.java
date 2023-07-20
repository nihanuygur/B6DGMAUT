package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends BasePage {

    @FindBy(tagName = "h1")
    public WebElement ProductComparisonText;
}
