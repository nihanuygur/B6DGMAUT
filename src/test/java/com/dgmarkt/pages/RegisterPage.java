package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='input-register-email']")
    public WebElement eMail;

    @FindBy(xpath = "//input[contains(@type, 'tel')]")
    public WebElement telephone;

    @FindBy(xpath = "//input[@id='input-register-password']")
    public WebElement password;

    @FindBy(xpath = "//input[@placeholder='Password Confirm']")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//input[contains(@name, 'agree')]")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='login form']")
    public WebElement loginForm;

    @FindBy(xpath = "//div[contains(@class, 'firstname')]")
    public WebElement firstNameErrorMessage;

    @FindBy(xpath = "//div[contains(@class, 'lastname')]")
    public WebElement lastNameErrorMessage;

    @FindBy(xpath = "//div[contains(@class, 'email')]")
    public WebElement eMailErrorMessage;

    @FindBy(xpath = "//div[contains(@class, 'telephone')]")
    public WebElement telephoneErrorMessage;

    @FindBy(xpath = "//div[contains(@class, 'password')]")
    public WebElement passwordErrorMessage;

    @FindBy(xpath = "//div[contains(@class, 'password')]")
    public WebElement passwordConfirmErrorMessage;










}
