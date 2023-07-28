package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductComparePage extends BasePage {

    @FindBy(tagName = "h1")
    public WebElement ProductComparisonText;

    @FindBy(id = "compare-total")
    public WebElement productCompareButton;

    @FindBy(xpath = "(//input[@type='button'])[1]")
    public WebElement firstProductsAddtoCartButton;

    @FindBy(xpath = "(//input[@type='button'])[2]")
    public WebElement secondProductsAddtoCartButton;

    @FindBy(xpath = "(//*[text()='Remove'])[1]")
    public WebElement firstProductsRemoveButton;

    @FindBy(xpath = "//div[@id='content']/p")
    public WebElement noElementText;

    public void hoverOverAndCompareProduct(String productName) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();


        WebElement product = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')][contains(@class,'responsive')]"));
        jse.executeScript("arguments[0].scrollIntoView(true);", product);

        WebElement compareButton = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Compare this Product']/.."));
        jse.executeScript("arguments[0].click();", compareButton);


    }
}
