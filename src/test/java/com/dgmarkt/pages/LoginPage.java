package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@name='login']")
    public WebElement loginButton;

    public void login(){

        emailInput.sendKeys(ConfigurationReader.get("firstAuthEmail"));
        passwordInput.sendKeys(ConfigurationReader.get("firstAuthPassword"));
        loginButton.click();

    }

}
