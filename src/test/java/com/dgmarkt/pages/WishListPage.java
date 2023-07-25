package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;
import java.util.List;

public class WishListPage extends BasePage{

    @FindBy(xpath = "//h2[text()='My Wish List']")
    public WebElement onWishList;
    @FindBy(xpath = "//a[@data-original-title='Remove']")
    public List<WebElement> productsWishList;

    @FindBy(xpath = "//*[contains(text(),'modified your wish list!')]")
    public WebElement removeMessageWishList;

    public void findProductAddToCartOrRemove(String productName,String addOrDelete){
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+productName+"')]/../..//button[contains(@data-original-title,'"+addOrDelete+"')]")).click();
    }
    public void findProductAddRemove(String productName,String delete){
        Driver.get().findElement(By.xpath("//a[contains(text(),'"+productName+"')]/../..//*[contains(@data-original-title,'"+delete+"')]")).click();
    }

    public void productInWishList(String productName){
        WebElement product = Driver.get().findElement(By.xpath("//*[@class='text-left'][contains(text(),'" + productName + "')]"));
        Assert.assertTrue(product.isDisplayed());
    }
}