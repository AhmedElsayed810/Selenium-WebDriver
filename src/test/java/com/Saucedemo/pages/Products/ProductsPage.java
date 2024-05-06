package com.Saucedemo.pages.Products;

import com.Saucedemo.base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    ProductsKeywords productsKeywords = new ProductsKeywords(driver);



    @Step
    public void addMostExpensiveTwoProductsToCart(){

        productsKeywords.assertProductsTextIsDisplayed();
        productsKeywords.isAppLogoDisplayed();
        productsKeywords.selectHighToLowFilterOption();
        productsKeywords.clickfleeceJacketAddtoCartBtn();
        productsKeywords.clickBackpackAddtoCartBtn();
    }

    @Step
    public void navigateToCart(){
        productsKeywords.clickcartIcon();

    }
}
