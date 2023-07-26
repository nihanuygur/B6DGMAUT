package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubCategoryPage extends BasePage{
    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryButton;

    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthAndBeautyButton;

    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement televisionsButton;

    @FindBy(xpath = "(//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessoriesButton;

    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networkingButton;

    @FindBy(xpath = "//h1[text()='Health & Beauty']")
    public WebElement healthAndBeautyPage;

    @FindBy(xpath = "//h1[text()='Televisions']")
    public WebElement televisionsPage;

    @FindBy(xpath = "//h1[text()='TV Accessories']")
    public WebElement tvAccessoriesPage;

    @FindBy(xpath = "//h1[text()='Networking']")
    public WebElement networkingPage;

}
