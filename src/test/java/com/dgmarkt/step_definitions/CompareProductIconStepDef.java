package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.ProductComparison;
import com.dgmarkt.pages.ProductPage;
import com.dgmarkt.pages.categoryPages.HealthAndBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class CompareProductIconStepDef {
    HealthAndBeautyPage healthAndBeautyPage = new HealthAndBeautyPage();
    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    ProductComparison productComparison = new ProductComparison();

    @Then("The user hover over the product and clicks compare icon")
    public void the_user_hover_over_the_product_and_clicks_compare_icon() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,500)");

        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].scrollIntoView(true);", healthAndBeautyPage.product1);
        executor.executeScript("arguments[0].click();", healthAndBeautyPage.product1Compare);


    }

    @Then("The user clicks product comparison link and see the product in the page")
    public void theUserClicksProductComparisonLinkAndSeeTheProductInThePage() throws InterruptedException {
        //Thread.sleep(2000);
        BrowserUtils.clickWithJS(categoriesBasePage.productComparisonLink);
        Thread.sleep(2000);
        Assert.assertTrue(productComparison.product1.isDisplayed());


    }

    @Then("The user close pop up message")
    public void theUserClosePopUpMessage() {
        categoriesBasePage.closePopupButton.click();

    }

    @Then("The user see only one product on the list in product comparison page")
    public void theUserSeeOnlyOneProductOnTheListInProductComparisonPage() {
    }
}
