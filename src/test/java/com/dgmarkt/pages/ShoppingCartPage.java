package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage{



    public Boolean isProductAdded(String productName){
        WebElement product = Driver.get().findElement(By.xpath("//*[text()='" + productName + "']"));
        return product.isDisplayed();
    }
}
