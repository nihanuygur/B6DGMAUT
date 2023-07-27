package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePage{

    @FindBy(css = ".btn.btn-info")
    public WebElement orderViewIcon;


    @FindBy(xpath = "//*[@data-original-title='Reorder']")
    public WebElement reOrderIcon;

    @FindBy(xpath = "//*[@data-original-title='Return']")
    public WebElement returnIcon;

    @FindBy(xpath = "//*[text()='Product Name']/../../../tbody//td")
    public WebElement productName;


    public void addOrRemove (String command){
        Driver.get().findElement(By.xpath("//*[@data-original-title='"+command+"']")).click();
    }

}
