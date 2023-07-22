package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoriesBasePage extends BasePage {

    //here we will be locating web elements and implementing functions that are same in the all categories

    @FindBy(tagName = "h1")
    public WebElement categoryTitle;

    @FindBy(id = "input-sort")
    public WebElement sortingInput;

    @FindBy(xpath = "//select[@id='input-sort']/option[@selected='selected']")
    public WebElement sortInputSelected;

    @FindBy(id = "input-limit")
    public WebElement limitInput;

    @FindBy(id = "compare-total")
    public WebElement compareProductNav;

    @FindBy(xpath = "//div[@class='inner']/h4")
    public List<WebElement> productsList;

    @FindBy(xpath = "//div[@class='box-price']/p")
    public List<WebElement> pricesList;

    @FindBy(xpath = "//*[@class='price']")
    public WebElement firstProductsPrice;

}
