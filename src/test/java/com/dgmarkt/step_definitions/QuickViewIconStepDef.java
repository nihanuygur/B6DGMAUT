package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class QuickViewIconStepDef {
    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    int cartSize = Integer.parseInt(Driver.get().findElement(By.xpath("(//span[@class='txt-count'])[2]")).getText());
    @Then("Verify that the user can browse the product")
    public void verify_that_the_user_can_browse_the_product() {
        Assert.assertTrue(categoriesBasePage.browseProductTitle.isDisplayed());
    }

    @And("The user clicks to {string} button")
    public void theUserClicksToButton(String butonName) {
        categoriesBasePage.clickButtonsOnBrowseProduct(butonName);
    }

    @And("The user clicks to Add To Cart button")
    public void theUserClicksToAddToCartButton() {
        Driver.get().findElement(By.xpath("//button[@id='button-cart']")).click();
        //categoriesBasePage.browseProductAddToCartButton.click();
    }

    @And("The user enters quantity as {string}")
    public void theUserEntersQuantityAs(String quantity) {
        WebElement inputQuantity = Driver.get().findElement(By.id("input-quantity"));
        inputQuantity.clear();
        inputQuantity.sendKeys(quantity);
    }

    @Then("The user should see that quantity is {string}")
    public void theUserShouldSeeThatQuantityIs(String quantity) {
        Assert.assertEquals(Integer.parseInt(quantity)+cartSize,Integer.parseInt(Driver.get().findElement(By.xpath("(//span[@class='txt-count'])[2]")).getText()));
    }

    @Then("The user should see that quantity is increased by {string}")
    public void theUserShouldSeeThatQuantityIsIncreasedBy(String quantity) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(Integer.parseInt(quantity)+cartSize,Integer.parseInt(Driver.get().findElement(By.xpath("(//span[@class='txt-count'])[2]")).getText()));
    }
}
