package com.Saucedemo.pages.Products;

import com.Saucedemo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertEquals;

public class ProductsKeywords extends BasePage {
    public ProductsKeywords(WebDriver driver) {
        super(driver);
    }
    private static final By productTitle = (ProductsAssertions.productTitle);


    public void assertProductsTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Products";
        assertEquals(expectedText, actualText, "Product title text does not match expected text");
    }


    public boolean isAppLogoDisplayed() {
        WebElement appLogoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ProductsAssertions.appLogo));
        return appLogoElement.isDisplayed();
    }


    public void selectHighToLowFilterOption(){

        Select filterDropDown = new Select(driver.findElement(ProductsLocators.filterTab));
        filterDropDown.selectByValue("hilo");
    }
    public void clickBackpackAddtoCartBtn(){
        driver.findElement(ProductsLocators.BackpackAddtoCartBtn).click();
    }
    public void clickfleeceJacketAddtoCartBtn(){
        driver.findElement(ProductsLocators.fleeceJacketAddtoCartBtn).click();
    }
    public void clickcartIcon(){
        driver.findElement(ProductsLocators.cartIcon).click();
    }






}
