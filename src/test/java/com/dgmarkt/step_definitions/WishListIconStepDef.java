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
    public void user_hover_over_the_product(String chooseProduct) {
        categoriesBasePage.chooseProduct(chooseProduct);
    }
    @Then("Verify that user can see {string}")
    public void verify_that_user_can_see(String wishListIcon) {

        categoriesBasePage.chooseButtonGroup(wishListIcon);
    }



//  @And("User can see the message {string}")
//   public void userCanSeeTheMessage(String expectedPopUpMessage) {
//
//      String actualMessage=categoriesBasePage.popUpWishList.getText();
//      Assert.assertEquals(expectedPopUpMessage,actualMessage);
//
//
//}

    @And("User click on {string}")
    public void userClickOn(String clickWishListIcon) {

        categoriesBasePage.clickButtonGroup(clickWishListIcon);

    }

    //    @And("User click on Add to Wish List")
//    public void userClickOnAddToWishList() {
//        Driver.get().findElement(By.xpath("//button[@title='Add to Wish List']")).click();
//    }

    @And("User click on main {string}")
    public void userClickOnMain(String mainGroup) {
        categoriesBasePage.clickMainButtonGroup(mainGroup);
    }
    @Then("Verify that user can see {string} in Wish List")
    public void verifyThatUserCanSeeInWishList(String expectedProduct) {
        Assert.assertEquals(expectedProduct,categoriesBasePage.getTextProduct(expectedProduct));

    }


    @Then("Verify that user can see all Products {int} in Wish List")
    public void verifyThatUserCanSeeAllProductsInWishList(int expectedProductsInWishList) {
        int actualList = wishListPage.productsWishList.size();
        System.out.println("actualList = " + actualList);
        Assert.assertEquals(expectedProductsInWishList,actualList);
    }
}
