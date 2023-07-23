package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.WishListPage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.List;

public class WishListIconStepDef {
    HomePage homePage = new HomePage();
    CategoriesBasePage categoriesBasePage = new CategoriesBasePage();
    WishListPage wishListPage = new WishListPage();
    @Given("User choose Category {string}")
    public void user_choose_category(String chooseCategory) {
       homePage.navigateToCategory(chooseCategory);
    }
    @When("User hover over the Product {string}")
    public void userHoverOverTheProduct(String productName) throws InterruptedException {
        categoriesBasePage.chooseProduct(productName);

    }
    @Then("Verify that user can see {string}")
    public void verifyThatUserCanSee(String wishListIcon) {
        categoriesBasePage.chooseButtonGroup(wishListIcon);
    }

    @Given("The user hover over {string} product and clicks to the {string} icon")
    public void theUserHoverOverProductAndClicksToTheIcon(String chooseProductByName, String groupName) {
        categoriesBasePage.hoverAndAddProduct(chooseProductByName,groupName);
    }



    @When("The user clicks wish list! link from pop-up message and closes the message")
    public void theUserClicksWishListLinkFromPopUpMessageAndClosesTheMessage() {
        Driver.get().findElement(By.xpath("//a[normalize-space()='wish list']")).click();
    }


    @Then("The user should see that the {string} has been added to the Wish List page")
    public void theUserShouldSeeThatTheHasBeenAddedToTheWishListPage(String product) {
        //Assert.assertEquals(expectedProduct,categoriesBasePage.getTextProduct(product));
        Assert.assertTrue(Driver.get().findElement(By.xpath("//*[@class='text-left'][contains(text(),'" + product + "')]")).isDisplayed());
    }


}
