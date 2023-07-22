package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.categoryPages.HealthAndBeautyPage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class CompareProductIconStepDef {
    HealthAndBeautyPage healthAndBeautyPage=new HealthAndBeautyPage();

    @Then("The user hover over the product")
    public void the_user_hover_over_the_product() {
        JavascriptExecutor jse = (JavascriptExecutor)Driver.get();
        jse.executeScript("window.scrollBy(0,500)");

        JavascriptExecutor executor = (JavascriptExecutor) Driver.get();
        executor.executeScript("arguments[0].scrollIntoView(true);", healthAndBeautyPage.product1);
        executor.executeScript("arguments[0].click();", healthAndBeautyPage.product1Compare);

//        Actions actions = new Actions(Driver.get());
//        actions.moveToElement(healthAndBeautyPage.product1).perform();




    }
}
