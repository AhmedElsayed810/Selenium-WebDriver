package com.Saucedemo.pages.Products;

import com.Saucedemo.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductsLocators extends BasePage {

    public ProductsLocators(WebDriver driver) {
        super(driver);
    }

    public static By BackpackAddtoCartBtn = By.id("add-to-cart-sauce-labs-backpack");
    public static By fleeceJacketAddtoCartBtn = By.id("add-to-cart-sauce-labs-fleece-jacket");
    public static By cartIcon = By.id("shopping_cart_container");
    public static By filterTab = By.cssSelector("[data-test='product-sort-container']");





}
