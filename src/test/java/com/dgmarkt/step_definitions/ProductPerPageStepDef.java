package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductPerPageStepDef {

    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();


    @When("User selects {string} from SHOW")
    public void user_selects_from_show(String number) throws InterruptedException {

        categoriesBasePage.numberOfProducts(number);
        Thread.sleep(3000);
    }

    @Then("The message contains {string}")
    public void the_message_contains(String expectedMessage) {
        String actualMessage = categoriesBasePage.numberOfProductText.getText();

        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertTrue(actualMessage.contains(expectedMessage));

    }

}
