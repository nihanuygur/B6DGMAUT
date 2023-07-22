package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage {

    @FindBy(xpath = "//div[@class='container-inner']/h1")
    public WebElement forgottenPasswordHeader;

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement emailInput;

    @FindBy(xpath = "//*[@value='Continue']")
    public WebElement continueButton;

//    @FindBy(xpath = "//*[text()=' An email with a confirmation link has been sent your email address.']")
//    public WebElement successMessage;

    public WebElement forgottenEmailMessage(String message) {

        return Driver.get().findElement(By.xpath("//*[text()=' " + message + "']"));
    }


}
