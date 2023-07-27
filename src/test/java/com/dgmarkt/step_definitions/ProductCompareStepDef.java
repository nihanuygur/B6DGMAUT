package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.ProductComparePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductCompareStepDef {

    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    ProductComparePage productComparePage = new ProductComparePage();


    @When("The user clicks to Product Compare button")
    public void theUserClicksToProductCompareButton() {
        categoriesBasePage.compareProductNav.click();
    }


    @Then("The user should be able to see Product Comparison title")
    public void theUserShouldBeAbleToSeeProductComparisonTitle() {
        String expectedText = "Product Comparison";
        String actualText = productComparePage.ProductComparisonText.getText();
        Assert.assertEquals(expectedText, actualText);
    }


    @And("The user hover over the {string} and {string} add to comparison")
    public void theUserHoverOverTheAndAddToComparison(String product1, String product2) throws InterruptedException {

        productComparePage.hoverOverAndCompareProduct(product1);
        categoriesBasePage.closePopupButton.click();

        Thread.sleep(1000);

        productComparePage.hoverOverAndCompareProduct(product2);
        categoriesBasePage.closePopupButton.click();

        Thread.sleep(1000);

    }

    @Then("The user clicks product comparison link and should see the {string} and {string} in the page")
    public void theUserClicksProductComparisonLinkAndShouldSeeTheAndInThePage(String product1, String product2) throws InterruptedException {
        BrowserUtils.clickWithJS(productComparePage.productCompareButton);
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,600)");

        WebElement product = Driver.get().findElement(By.xpath("//table/tbody/tr/td[contains(text(),'" + product1 + "')]"));
        Assert.assertTrue(product.isDisplayed());

        WebElement productt = Driver.get().findElement(By.xpath("//table/tbody/tr/td[contains(text(),'" + product2 + "')]"));
        Assert.assertTrue(product.isDisplayed());
    }

    @Then("The user clicks the Add to Cart button for each product")
    public void theUserClicksTheAddToCartButtonForEachProduct() throws InterruptedException {
        BrowserUtils.clickWithJS(productComparePage.firstProductsAddtoCartButton);
        Thread.sleep(2000);

        WebElement addToCartPopupClose = Driver.get().findElement(By.xpath("(//button[@class='close'])[1]"));
        addToCartPopupClose.click();
        Thread.sleep(2000);

        BrowserUtils.clickWithJS(productComparePage.secondProductsAddtoCartButton);
        Thread.sleep(2000);
        WebElement addToCartSecondPopupClose = Driver.get().findElement(By.xpath("//button[@class='close']"));
        Thread.sleep(2000);

    }

    @Then("The user clicks the Remove button to remove products")
    public void theUserClicksTheRemoveButtonToRemoveProducts() throws InterruptedException {
        BrowserUtils.clickWithJS(productComparePage.firstProductsRemoveButton);
        Thread.sleep(2000);

        WebElement popupForRemove = Driver.get().findElement(By.xpath("//button[@class='close']"));

        popupForRemove.click();

        BrowserUtils.clickWithJS(productComparePage.firstProductsRemoveButton);
        Thread.sleep(2000);

        WebElement popupForSecondRemove = Driver.get().findElement(By.xpath("//button[@class='close']"));
        popupForSecondRemove.click();


    }

    @And("The user should not see any products in the page")
    public void theUserShouldNotSeeAnyProductsInThePage() {
        //You have not chosen any products to compare.
        String expectedText ="You have not chosen any products to compare.";
        String actualText = productComparePage.noElementText.getText();

        Assert.assertEquals(expectedText, actualText);
    }
}
