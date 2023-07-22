package com.dgmarkt.pages;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
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
}

