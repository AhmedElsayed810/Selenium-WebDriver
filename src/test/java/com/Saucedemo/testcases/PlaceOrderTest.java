package com.Saucedemo.testcases;

import com.Saucedemo.base.BaseTest;
import com.Saucedemo.dataDriven.DataDriven;
import com.Saucedemo.pages.Cart.CartPage;
import com.Saucedemo.pages.Cart.Checkout.CheckoutPage;
import com.Saucedemo.pages.Cart.Checkout.Overview.OverviewPage;
import com.Saucedemo.pages.Cart.Checkout.Overview.ThankYou.ThankYouPage;
import com.Saucedemo.pages.Login.LoginPage;
import com.Saucedemo.pages.Products.ProductsPage;
import io.qameta.allure.Feature;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

@Feature("Place Order Feature")
public class PlaceOrderTest extends BaseTest {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private OverviewPage overviewPage;
    private ThankYouPage thankYouPage;

    @Test(dataProvider = "loginData", description = "Check That User Able To Place Order")
    public void productPlaceOrderTest(String username, String password) {
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        overviewPage = new OverviewPage(driver);
        thankYouPage = new ThankYouPage(driver);

        loginPage.login(username, password);

        productsPage.addMostExpensiveTwoProductsToCart();
        productsPage.navigateToCart();
        cartPage.navigateToCheckoutPage();
        checkoutPage.insertCheckoutInformationAndContinue("Ahmed", "Elsayed", "42");
        overviewPage.finishOrder();
        thankYouPage.assertingTheThankYouAndTheOrderHasBeenDispatchedMessagesAreDisplayed();
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException {
        DataDriven dataDriven = new DataDriven();
        String filePath = "testData/readData.xlsx";
        return dataDriven.readLoginData(filePath);
    }
}
