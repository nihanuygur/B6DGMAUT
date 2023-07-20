package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoriesBasePage;
import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SortByFunctionStepDef {
    HomePage homePage = new HomePage();
    CategoriesBasePage categoryPage = new CategoriesBasePage();

    @Given("The user navigates to {string} category")
    public void the_user_navigates_to_category(String categoryName) {
        homePage.navigateToCategory(categoryName);
    }

    @Then("The title is {string}")
    public void the_title_is(String categoryName) {
        String actualTitle = categoryPage.categoryTitle.getText();
        String expectedTitle = categoryName;
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @Then("the Sort By tab initially shows {string}")
    public void theSortByTabInitiallyShows(String sortInputSelected) throws InterruptedException {
        Thread.sleep(500);
        Assert.assertEquals(categoryPage.sortInputSelected.getText(), sortInputSelected);
    }

    @When("The user selects {string} in the sorting dropdown menu")
    public void theUserSelectsInTheSortingDropdownMenu(String sortInput) {
        Select sortBySelect = new Select(categoryPage.sortingInput);
        sortBySelect.selectByVisibleText(sortInput);
    }

    @Then("Verify that the products are actually alphabetically {string} sorted")
    public void verifyThatTheProductsAreActuallyAlphabeticallySorted(String sortingType) {
        List<WebElement> list = categoryPage.productsList;

        boolean flag = true;
        for (int i = 0; i < list.size() - 1; i++) {
            String a = list.get(i).getText();
            String b = list.get(i + 1).getText();
            System.out.println(a + "---" + b);
            if (sortingType.equals("Name (A - Z)") ? a.compareTo(b) > 0 : a.compareTo(b) < 0) {
                flag = false;
                break;
            }
        }
        Assert.assertTrue(flag);
    }


}
