package com.Saucedemo.pages.Cart.Checkout.Overview.ThankYou;

import com.Saucedemo.base.BasePage;
import com.Saucedemo.pages.Cart.Checkout.Overview.OverviewKeywords;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ThankYouPage extends BasePage {
    public ThankYouPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void assertingTheThankYouAndTheOrderHasBeenDispatchedMessagesAreDisplayed(){
        ThankYouKeywords thankYouKeywords = new ThankYouKeywords(driver);
        thankYouKeywords.assertThankYouMessageIsDisplayed();
        thankYouKeywords.assertDispatchedMessageIsDisplayed();
}}
