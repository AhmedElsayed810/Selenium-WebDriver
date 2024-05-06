package com.Saucedemo.pages.Cart.Checkout.Overview;

import com.Saucedemo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class OverviewKeywords extends BasePage {
    public OverviewKeywords(WebDriver driver) {
        super(driver);
    }

    private static final By overviewTitle = (OverviewAssertions.overviewTitle);
    private static final By subtotalValue = (OverviewAssertions.subtotalValue);

    private static final String EXPECTED_URL = "https://www.saucedemo.com/checkout-step-two.html";



    public void assertProductsTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(overviewTitle));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Checkout: Overview";
        assertEquals(expectedText, actualText, "Product text does not match expected text");
    }


    public void assertSubtotalValue() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(subtotalValue));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Item total: $79.98";
        assertEquals(expectedText, actualText, "Subtotal Value text does not match expected text");
    }


    public void clickFinishBtn(){
        driver.findElement(OverviewLocators.finishButn).click();
    }



    public void assertURLMatchesExpected() {
        String currentURL = driver.getCurrentUrl();
        assertEquals(currentURL, EXPECTED_URL, "Current URL does not match expected URL");
    }



}
