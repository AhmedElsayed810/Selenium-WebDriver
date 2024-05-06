package com.Saucedemo.pages.Cart.Checkout;

import com.Saucedemo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void insertCheckoutInformationAndContinue(String firstName, String lastName, String postalCode){

        CheckoutKeywords checkoutKeywords = new CheckoutKeywords(driver);
        checkoutKeywords.assertCheckoutTextIsDisplayed();
        checkoutKeywords.enterFirstName(firstName);
        checkoutKeywords.enterLastName(lastName);
        checkoutKeywords.enterPostalCode(postalCode);
        checkoutKeywords.clickContinueBtn();
    }
}
