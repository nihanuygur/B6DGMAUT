package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class QuickViewIconStepDef {
    HomePage homePage = new HomePage();
//    @Given("The user hovers over the Cello product")
//    public void theUserHoversOverTheCelloProduct() {
//        WebElement product = Driver.get().findElement(By.xpath("(//img[contains(@title,'" + productName + "')])[2]"));
//        BrowserUtils.scrollToElement(product);
//
//        BrowserUtils.hover(product);
//    }
//
//    @Then("The user should be able to see the quick view icon")
//    public void theUserShouldBeAbleToSeeTheQuickViewIcon() {
//        Assert.assertTrue(homePage.quickViewIconCello.isDisplayed());
//    }
}
