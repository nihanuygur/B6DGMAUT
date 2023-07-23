package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.ProductComparison;
import com.dgmarkt.pages.ProductPage;
import com.dgmarkt.pages.categoryPages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.*;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CompareProductIconStepDef {
    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();
    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    ProductComparison productComparison = new ProductComparison();

    @And("The user hover over the {string} and see compare icon")
    public void theUserHoverOverTheAndSeeCompareIcon(String productName) throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,800)");

        WebElement product= Driver.get().findElement(By.xpath("//a/img[@title='"+productName+"']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", product);

        WebElement compareButton= Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Compare this Product']/.."));
        Thread.sleep(3000);
        Assert.assertTrue(compareButton.isEnabled());
    }

    @Then("The user close pop up message")
    public void theUserClosePopUpMessage() {
         categoriesBasePage.closePopupButton.click();

    }

    @And("The user hover over the {string} and clicks compare icon")
    public void theUserHoverOverTheAndClicksCompareIcon(String productName) {
        categoriesBasePage.hoverAndCompareProduct(productName);

    }

    @Then("The user clicks product comparison link and see the {string} in the page")
    public void theUserClicksProductComparisonLinkAndSeeTheInThePage(String productName) throws InterruptedException {
        BrowserUtils.clickWithJS(categoriesBasePage.productComparisonLink);
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,600)");

        WebElement product= Driver.get().findElement(By.xpath("//table/tbody/tr/td[text()='"+productName+"']"));
        Assert.assertTrue(product.isDisplayed());

    }
    @And("The user hover over the {string} and add two times compare icon")
    public void theUserHoverOverTheAndAddTimesCompareIcon(String productName) {

        categoriesBasePage.hoverAndCompareProduct(productName);

        categoriesBasePage.closePopupButton.click();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        WebElement compareButton= Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Compare this Product']/.."));
        jse.executeScript("arguments[0].click();", compareButton);


    }

    @Then("The user see only one product on the list in product comparison page")
    public void theUserSeeOnlyOneProductOnTheListInProductComparisonPage() {
        String actualNumber=productComparison.columnNumber.getAttribute("colspan");
        String expectedNumber="2";
        Assert.assertEquals(expectedNumber,actualNumber);

    }


    @And("The user hover over the {string} and {string} and {string} and {string} and {string} add to comparison")
    public void theUserHoverOverTheAndAndAndAndAddTwoTimesCompareIcon(String product1, String product2, String product3, String product4, String product5) {

        categoriesBasePage.hoverAndCompareProduct(product1);

        categoriesBasePage.closePopupButton.click();
        categoriesBasePage.hoverAndCompareProduct(product2);

        categoriesBasePage.closePopupButton.click();
        categoriesBasePage.hoverAndCompareProduct(product3);

        categoriesBasePage.closePopupButton.click();
        categoriesBasePage.hoverAndCompareProduct(product4);

        categoriesBasePage.closePopupButton.click();
        categoriesBasePage.hoverAndCompareProduct(product5);

    }
    @Then("The user clicks product comparison see only four products on the list in product comparison page")
    public void theUserClicksProductComparisonSeeOnlyFourProductsOnTheListInProductComparisonPage() throws InterruptedException {
        BrowserUtils.clickWithJS(categoriesBasePage.productComparisonLink);
        Thread.sleep(2000);
        String actualNumber=productComparison.columnNumber5.getAttribute("colspan");
        String expectedNumber="5";
        Assert.assertEquals(expectedNumber,actualNumber);
    }
}
