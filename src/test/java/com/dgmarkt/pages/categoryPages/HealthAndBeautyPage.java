package com.dgmarkt.pages.categoryPages;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthAndBeautyPage extends CategoriesBasePage {

    @FindBy(xpath = "//img[@title='Capsule Plate 6pcs']")
    public WebElement capsulePlate;

    @FindBy(xpath = "//button[contains(@onclick,'5720397')]/span[text()='Add to Cart']/..")
    public WebElement addToCartCapsulePlate;

}
