package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath = "//a[text()='Account']")
    public WebElement accountHeader;


    public void clickMenu(String menuName) {
        Driver.get().findElement(By.xpath("//*[text()='" + menuName + "']")).click();

    }

    public void chooseFromMyAccount(String myAccountList){
        Driver.get().findElement(By.xpath("//a[text()='"+myAccountList+"']")).click();
    }
}
