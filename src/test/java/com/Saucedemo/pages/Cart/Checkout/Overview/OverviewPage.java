package com.Saucedemo.pages.Cart.Checkout.Overview;

import com.Saucedemo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public void finishOrder(){
        OverviewKeywords overviewKeywords = new OverviewKeywords(driver);

        overviewKeywords.assertProductsTextIsDisplayed();
        overviewKeywords.assertSubtotalValue();
        overviewKeywords.assertURLMatchesExpected();
        overviewKeywords.clickFinishBtn();
    }
}
