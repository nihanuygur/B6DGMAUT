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

    @FindBy(xpath = "//div[@id='slider-price']")
     public WebElement PriceSlider2;

    @FindBy(xpath = "//input[@placeholder='Min']")
    public WebElement MinText;

    @FindBy(xpath = "//input[@placeholder='Max']")
    public WebElement MaxText;

    @FindBy(xpath = "(//div[@id='slider-price']//span)[1]")
    public WebElement PriceSliderMin;

    @FindBy(xpath = "(//div[@id='slider-price']//span)[2]")
    public WebElement PriceSliderMax;
    @FindBy(css = ".product-item")
    public WebElement firstProduct;


    @FindBy(css = ".button-cart")
    public WebElement firstAddToCart;

    @FindBy(xpath = "//div/a[text()='product comparison']")
    public WebElement productComparisonLink;

    @FindBy(xpath = "//button[@data-dismiss='alert']")
    public WebElement closePopupButton;

    @FindBy(xpath = "//*[text()='shopping cart']")
    public WebElement shoppingCartLink;

    @FindBy(xpath = "//button[text()='×']")
    public WebElement popUpClose;

    @FindBy(xpath = "//*[text()=' Success: You have added ']")
    public WebElement popUpMessage;

    @FindBy(xpath = "//h1/a")
    public WebElement browseProductTitle;
    @FindBy(xpath = "//div[@id='product']/div/button")
    public WebElement browseProductAddToCartButton;





    public void selectViewOption(String viewOption) {

        //clicking to the option
        Driver.get().findElement(By.xpath("//button[@title='" + viewOption + "']")).click();
    }

    public void selectPriceRage(double priceRange) {

    }

    public void selectPriceRageMax(double priceRangeMax) {



        //clicking to the option
        Driver.get().findElement(By.xpath("//div[@style='left:'" + priceRangeMax + "%;']")).click();
    }

    public void goToProductPage(String productName) {
        WebElement product = Driver.get().findElement(By.xpath("//img[@title='" + productName + "']"));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.clickWithJS(product);
        Driver.get().findElement(By.xpath("//button[@id='button-cart']")).click();
    }

    public void hoverAndAddProduct(String productName, String groupButton) {
        WebElement product = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName +
                "')][contains(@class,'responsive')]"));

        BrowserUtils.scrollToElement(product);
        BrowserUtils.hover(product);
        WebElement groupButtons = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName +
                "')]/../../../..//span[text()='" + groupButton + "']/.."));

        groupButtons.click();
    }

    /**
     * This method is created for select a product with its order/index number on a category page,
     * Exp: first product in the category
     * 5. product in the category
     *
     * @param number
     */
    public void selectProductWithIndex(int number) {
        WebElement product = Driver.get().findElement(By.xpath("(//*[@class='product-item'])[" + number + "]"));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.hover(product);
        WebElement addToCartButton = Driver.get().findElement(By.xpath("(//*[@class='button-cart'])[" + number + "]"));
        addToCartButton.click();
    }

    public String getTextProduct(String productName) {
        return Driver.get().findElement(By.xpath("//a[text()='" + productName + "']")).getText();

    }

    public void chooseProduct(String productName) throws InterruptedException {
        WebElement product = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')][contains(@class,'responsive')]"));
        BrowserUtils.scrollToElement(product);
        Thread.sleep(1000);
        BrowserUtils.hover(product);

    }


    public void chooseButtonGroup(String groupButton) {
        WebElement chooseGroupButton = Driver.get().findElement(By.xpath("//span[text()='" + groupButton + "']"));
        chooseGroupButton.isDisplayed();

    }

    public void clickButtonGroup(String groupButtonClick) {
        Driver.get().findElement(By.xpath("//span[text()='" + groupButtonClick + "']/..")).click();

    }

    public void clickMainButtonGroup(String groupMainButtonClick) {
        Driver.get().findElement(By.xpath("//span[text()='" + groupMainButtonClick + "']/../..")).click();

    }

    public void hoverAndCompareProduct(String productName) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,800)");

        WebElement product = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')][contains(@class,'responsive')]"));
        jse.executeScript("arguments[0].scrollIntoView(true);", product);

        WebElement compareButton = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Compare this Product']/.."));
        jse.executeScript("arguments[0].click();", compareButton);


    }

    public void clickButtonsOnBrowseProduct(String buttonName){
        Driver.get().findElement(By.xpath("//div[@class='btn-group']/button[@title='"+buttonName+"']")).click();
    }

    public void chooseOptionForPopUp(String options){
        Driver.get().findElement(By.xpath("//a[text()='"+options+"']")).click();
    }



}

