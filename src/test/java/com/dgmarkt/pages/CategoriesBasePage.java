package com.dgmarkt.pages;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CategoriesBasePage extends BasePage {

    //here we will be locating web elements and implementing functions that are same in the all categories

    @FindBy(tagName = "h1")
    public WebElement categoryTitle;

    @FindBy(id = "input-sort")
    public WebElement sortingInput;

    @FindBy(xpath = "//select[@id='input-sort']/option[@selected='selected']")
    public WebElement sortInputSelected;

    @FindBy(id = "input-limit")
    public WebElement limitInput;

    @FindBy(id = "compare-total")
    public WebElement compareProductNav;

    @FindBy(xpath = "//div[@class='inner']/h4")
    public List<WebElement> productsList;

    @FindBy(xpath = "//div[@class='box-price']/p")
    public List<WebElement> pricesList;

    @FindBy(xpath = "//div[@class='list-group-item']")
   public WebElement PriceSlider;

    //@FindBy(xpath = "//div[@style='left: 8.09399%; width: 77.5457%;']")
     //public WebElement FullSlider;



    public void selectViewOption(String viewOption) {

        //clicking to the option
        Driver.get().findElement(By.xpath("//button[@title='" + viewOption + "']")).click();
    }
    public void selectPriceRage(double priceRange) {

        //clicking to the option
        Driver.get().findElement(By.xpath("//div[@style='left:'" + priceRange + "%;']")).click();
    }
    public void selectPriceRageMax(double priceRangeMax) {

        //clicking to the option
        Driver.get().findElement(By.xpath("//div[@style='left:'" + priceRangeMax + "%;']")).click();
    }
    @FindBy(css = ".product-item")
    public WebElement firstProduct;


    @FindBy(css = ".button-cart")
    public WebElement firstAddToCart;

    @FindBy(xpath = "//div/a[text()='product comparison']")
    public WebElement productComparisonLink;

    @FindBy(xpath = "//button[@data-dismiss='alert']")
    public WebElement closePopupButton;



    public void goToProductPage(String productName) {
        WebElement product = Driver.get().findElement(By.xpath("//img[@title='" + productName + "']"));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.clickWithJS(product);
        Driver.get().findElement(By.xpath("//button[@id='button-cart']")).click();
    }

    public void hoverAndAddProduct(String productName) {

        WebElement product = Driver.get().findElement(By.xpath("(//img[contains(@title,'" + productName + "')])[2]"));
        BrowserUtils.scrollToElement(product);

        BrowserUtils.hover(product);
        WebElement cart = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Add to Cart']/.."));

        cart.click();
    }

    /**
     * This method is created for select a product with its order/index number on a category page,
     * Exp: first product in the category
     *         5. product in the category
     * @param number
     */
    public void selectProductWithIndex(int number) {
        WebElement product = Driver.get().findElement(By.xpath("(//*[@class='product-item'])[" + number + "]"));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.hover(product);
        WebElement addToCartButton = Driver.get().findElement(By.xpath("(//*[@class='button-cart'])[" + number + "]"));
        addToCartButton.click();
    }

    public void hoverAndCompareProduct(String productName) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,800)");

        WebElement product= Driver.get().findElement(By.xpath("//a/img[@title='"+productName+"']"));
        jse.executeScript("arguments[0].scrollIntoView(true);", product);

        WebElement compareButton= Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Compare this Product']/.."));
        jse.executeScript("arguments[0].click();", compareButton);


    }

}

