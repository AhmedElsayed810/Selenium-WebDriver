package com.Saucedemo.pages.Cart;

import com.Saucedemo.base.BasePage;
import com.Saucedemo.pages.Products.ProductsAssertions;
import com.Saucedemo.pages.Products.ProductsLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class CartKeywords extends BasePage {
    public CartKeywords(WebDriver driver) {
        super(driver);
    }

    private static final By cartTitle = (CartAssertions.cartTitle);
    private static final By firstProductText = (CartAssertions.firstProductName);
    private static final By secondProductText = (CartAssertions.secondProductName);



    public void assertYourCartTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cartTitle));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Your Cart";
        assertEquals(expectedText, actualText, "Your Cart title text does not match expected text");
    }


    public void assertFirstProductTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductText));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Sauce Labs Fleece Jacket";
        assertEquals(expectedText, actualText, "Your Cart title text does not match expected text");
    }


    public void assertSecondProductTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(secondProductText));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Sauce Labs Backpack";
        assertEquals(expectedText, actualText, "Your Cart title text does not match expected text");
    }
    public void clickCheckoutBtn(){
        driver.findElement(CartLocators.checkoutBtn).click();
    }




}
