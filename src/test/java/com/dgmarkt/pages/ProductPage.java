package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage {

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public WebElement addToCartBtn;



    public void addToCartFromProPage(String productName) throws InterruptedException {
        WebElement product = Driver.get().findElement(By.xpath("//a[text()='" + productName + "']"));
        product.click();
        BrowserUtils.scrollToElement(addToCartBtn);
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.get();
        executor.executeScript("arguments[0].click();", addToCartBtn);

    }


}
