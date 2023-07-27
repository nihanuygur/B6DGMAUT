package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnPage extends BasePage {

    @FindBy(css = "#content>p")
    public WebElement message;

    @FindBy(css = "//*[@name='return_reason_id'][@value='1']")
    public WebElement returnReasonFirst;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitButton;

    public void completeReturn(String radioButton) {
        Driver.get().findElement(By.xpath("//*[@name='return_reason_id'][@value='" + radioButton + "']")).click();
        submitButton.click();
    }
}
