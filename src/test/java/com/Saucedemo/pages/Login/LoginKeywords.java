package com.Saucedemo.pages.Login;

import com.Saucedemo.base.BasePage;
import com.Saucedemo.pages.Products.ProductsAssertions;
import com.Saucedemo.utils.ConfigUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.testng.Assert.assertEquals;

public class LoginKeywords extends BasePage {
    public LoginKeywords(WebDriver driver) {
        super(driver);
    }
    private static final By errorMessage = (LoginAssertions.errorMessage);







    public void enterUserName(String username){
        driver.findElement(LoginLocators.usernameField).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(LoginLocators.passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LoginLocators.loginbutton).click();
    }

    public void assertInvalidUsernameOrPasswordErrorMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Epic sadface: Username and password do not match any user in this service";
        assertEquals(expectedText, actualText, "error message text does not match expected text");
    }


    public void assertEmptyUsernameOrBothErrorMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Epic sadface: Username is required";
        assertEquals(expectedText, actualText, "error message text does not match expected text");
    }


    public void assertEmptyPasswordErrorMessageIsDisplayed() {
        WebElement productTitleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage));
        String actualText = productTitleElement.getText().trim();
        String expectedText = "Epic sadface: Password is required";
        assertEquals(expectedText, actualText, "error message text does not match expected text");
    }


}


