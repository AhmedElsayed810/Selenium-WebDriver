package com.Saucedemo.stepDefinitions;

import com.Saucedemo.base.BaseTest;
import com.Saucedemo.pages.Login.LoginPage;
import com.Saucedemo.pages.Products.ProductsPage;
import com.Saucedemo.pages.Cart.CartPage;
import com.Saucedemo.pages.Cart.Checkout.CheckoutPage;
import com.Saucedemo.pages.Cart.Checkout.Overview.OverviewPage;
import com.Saucedemo.pages.Cart.Checkout.Overview.ThankYou.ThankYouPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class PlaceOrderStepDefinitions {

    private LoginPage loginPage;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private OverviewPage overviewPage;
    private ThankYouPage thankYouPage;

    public PlaceOrderStepDefinitions(BaseTest baseTest) {
        this.loginPage = new LoginPage((WebDriver) baseTest.getDriver());
        this.productsPage = new ProductsPage((WebDriver) baseTest.getDriver());
        this.cartPage = new CartPage((WebDriver) baseTest.getDriver());
        this.checkoutPage = new CheckoutPage((WebDriver) baseTest.getDriver());
        this.overviewPage = new OverviewPage((WebDriver) baseTest.getDriver());
        this.thankYouPage = new ThankYouPage((WebDriver) baseTest.getDriver());
    }

    @Given("the user is logged in with username {string} and password {string}")
    public void loginUser(String username, String password) {
        loginPage.login("your_username", "your_password");
    }

    @When("the user adds the most expensive products to the cart")
    public void addMostExpensiveProductsToCart() {
        productsPage.addMostExpensiveTwoProductsToCart();
    }

    @When("navigates to the cart")
    public void navigateToCart() {
        productsPage.navigateToCart();
    }

    @When("proceeds to checkout with first name {string}, last name {string}, and postal code {string}")
    public void checkout(String firstName, String lastName, String postalCode) {
        cartPage.navigateToCheckoutPage();
        checkoutPage.insertCheckoutInformationAndContinue("John", "Doe", "12345");
    }

    @When("completes the order")
    public void completeOrder() {
        overviewPage.finishOrder();
    }

    @Then("the thank you message and order dispatched confirmation are displayed")
    public void verifyThankYouMessageAndOrderDispatched() {
        thankYouPage.assertingTheThankYouAndTheOrderHasBeenDispatchedMessagesAreDisplayed();
    }
}
