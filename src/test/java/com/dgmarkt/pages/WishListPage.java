package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishListPage extends BasePage{

    @FindBy(xpath = "//a[@data-original-title='Remove']")
    public List<WebElement> productsWishList;
}
