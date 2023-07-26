package com.dgmarkt.step_definitions;
import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class PriceSliderStepDef extends CategoriesBasePage {


    CategoriesBasePage categoryPage = new CategoriesBasePage();

    @When("sees the price slider")
    public void sees_the_price_slider() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,500)");
        Assert.assertTrue(categoryPage.PriceSlider2.isDisplayed());
    }

    @Then("The user change the minimum value to {int} and {int}")
    public void theUserChangeTheMinimumValueToAnd(int minValue, int maxValue) throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,300)");


         //Actions actions =new Actions(Driver.get());
         // actions.clickAndHold(PriceSliderMin).build().perform();


        int start = Integer.parseInt(categoryPage.MinText.getAttribute("value"));
        int finish =Integer.parseInt(categoryPage.MaxText.getAttribute("value"));
        

        WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(categoryPage.PriceSliderMin));


        for (int i = start; i < minValue; i++) {
             Thread.sleep(500);
            categoryPage.PriceSliderMin.sendKeys(Keys.ARROW_RIGHT);

        }

        for (int i = finish; i > maxValue ; i--) {
            Thread.sleep(500);
            categoryPage.PriceSliderMax.sendKeys(Keys.ARROW_LEFT);

        }


        Thread.sleep(5000);
        BrowserUtils.scrollToElement(categoryPage.PriceSliderMin);
    }

}





