package com.Saucedemo.pages.Cart.Checkout;

import com.Saucedemo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class CheckoutKeywords extends BasePage {
    public CheckoutKeywords(WebDriver driver) {
        super(driver);
    }

    private static final By checkoutTitle = (CheckoutAssertions.checkoutTitle);



    public void assertCheckoutTextIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutTitle));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Checkout: Your Information";
        assertEquals(expectedText, actualText, "Checkout title text does not match expected text");
    }

    public void enterFirstName(String firstame){
        driver.findElement(CheckoutLocators.firstNameField).sendKeys(firstame);

    }

    public void enterLastName(String lastName){
        driver.findElement(CheckoutLocators.lastNameField).sendKeys(lastName);

    }

    public void enterPostalCode(String postalCode){
        driver.findElement(CheckoutLocators.postalCodeField).sendKeys(postalCode);
    }

    public void clickContinueBtn(){
        driver.findElement(CheckoutLocators.continueBtn).click();
    }
}
