package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(xpath = "//*[text()=' Success: You have added ']")
    public  WebElement popUpWishList;

    public String getTextProduct(String productName) {
       return Driver.get().findElement(By.xpath("//a[text()='" + productName + "']")).getText();

    }
    public void chooseProduct(String productName){
        WebElement product = Driver.get().findElement(By.xpath("//a[text()='" + productName + "']"));
        BrowserUtils.hover(product);
    }



    public void chooseButtonGroup(String groupButton) {
        WebElement chooseGroupButton = Driver.get().findElement(By.xpath("//span[text()='" + groupButton + "']"));
        chooseGroupButton.isDisplayed();

    }

    public void clickButtonGroup(String groupButtonClick) {
    Driver.get().findElement(By.xpath("//span[text()='" + groupButtonClick + "']/..")).click();

    }
    public void clickMainButtonGroup(String groupMainButtonClick) {
        Driver.get().findElement(By.xpath("//span[text()='" + groupMainButtonClick + "']/../..")).click();

    }

}