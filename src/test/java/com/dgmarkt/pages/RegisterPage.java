package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    Faker faker = new Faker();
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='input-register-email']")
    public WebElement eMailInput;

    @FindBy(xpath = "//input[contains(@type, 'tel')]")
    public WebElement telephoneInput;

    @FindBy(xpath = "//input[@id='input-register-password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@placeholder='Password Confirm']")
    public WebElement passwordConfirmInput;

    @FindBy(xpath = "//input[contains(@name, 'agree')]")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[text()='login form']")
    public WebElement loginForm;

    @FindBy(xpath = "//div[contains(@class, 'text-danger')]")
    public WebElement errorMessage;

    @FindBy(xpath = "//button[contains(@onclick, 'account')]")
    public WebElement registrationSuccessfulPage;

    public void register1(String firstName, String lastName, String telephone, String password) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        eMailInput.sendKeys(faker.internet().emailAddress());
        telephoneInput.sendKeys(telephone);
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(password);
        privacyPolicy.click();
        continueButton.click();
    }


    public void register2(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        eMailInput.sendKeys(email);
        telephoneInput.sendKeys(telephone);
        passwordInput.sendKeys(password);
        passwordConfirmInput.sendKeys(passwordConfirm);
        privacyPolicy.click();
        continueButton.click();
    }


}
