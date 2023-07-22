package com.dgmarkt.step_definitions;
import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.xml.sax.Locator;


public class PriceSliderStepDef extends CategoriesBasePage  {

    CategoriesBasePage categoryPage = new CategoriesBasePage();
    @When("sees the price slider")
    public void sees_the_price_slider() {
        Assert.assertEquals(categoryPage.PriceSlider.getText(),PriceSlider);

    }

    @And("user enters a  {string} and {string}")
    public void userEntersAAnd(double priceRange, double priceRangeMax) throws InterruptedException {
        //Driver.get().findElement(By.xpath("//div[@style='left: 8.09399%; width: 77.5457%;']")).click();
        Thread.sleep(1000);
        categoryPage.selectPriceRage(priceRange);
        categoryPage.selectPriceRageMax(priceRangeMax);
    }




//        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.get();
//
//        jsExecutor.executeScript("arguments[0].value='" + priceRange + "priceRange", Driver.get().findElement(By.id("min-price")));
//        jsExecutor.executeScript("arguments[0].value='" + priceRangeMax + "priceRangeMax", Driver.get().findElement(By.id("max-price")));

    @Then("verify if the user can use the price slider")
    public void verify_if_the_user_can_use_the_price_slider() {
    }
}

