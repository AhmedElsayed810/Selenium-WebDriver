package com.Saucedemo.pages.Cart.Checkout.Overview.ThankYou;

import com.Saucedemo.base.BasePage;
import com.Saucedemo.pages.Cart.Checkout.Overview.OverviewAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class ThankYouKeywords extends BasePage {
    public ThankYouKeywords(WebDriver driver) {
        super(driver);
    }
    private static final By thankYouTitle = (ThankYouAssertions.thankYouTitle);
    private static final By thankYouMessage = (ThankYouAssertions.thankYouMessage);
    private static final By dispatchedMessage = (ThankYouAssertions.dispatchedMessage);


    public void assertThankYouPageTitleIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouTitle));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Checkout: Complete!";
        assertEquals(expectedText, actualText, "Thank You title text does not match expected text");
    }

    public void assertThankYouMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(thankYouMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Thank you for your order!";
        assertEquals(expectedText, actualText, "Thank You Message text does not match expected text");
    }

    public void assertDispatchedMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(dispatchedMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        assertEquals(expectedText, actualText, "Dispatched Message text does not match expected text");
    }

}
