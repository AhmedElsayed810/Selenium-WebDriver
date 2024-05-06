package com.Saucedemo.pages.Cart;


import com.Saucedemo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }


    @Step
    public void navigateToCheckoutPage(){
        CartKeywords cartKeywords = new CartKeywords(driver);

        cartKeywords.assertYourCartTextIsDisplayed();
        cartKeywords.assertFirstProductTextIsDisplayed();
        cartKeywords.assertSecondProductTextIsDisplayed();
        cartKeywords.clickCheckoutBtn();


    }
}
