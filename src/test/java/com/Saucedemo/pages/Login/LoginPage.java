package com.Saucedemo.pages.Login;

import com.Saucedemo.base.BasePage;
import com.Saucedemo.utils.ConfigUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    LoginKeywords loginKeywords = new LoginKeywords(driver);




    @Step
    public void login(String username, String password){

        loginKeywords.enterUserName(username);
        loginKeywords.enterPassword(password);
        loginKeywords.clickLoginButton();
    }

    @Step
    public void assertInvalidUsernameOrPasswordErrorMessage(){
        loginKeywords.assertInvalidUsernameOrPasswordErrorMessageIsDisplayed();

    }


    @Step
    public void assertEmptyUsernameOrBothErrorMessageIsDisplayed(){
        loginKeywords.assertEmptyUsernameOrBothErrorMessageIsDisplayed();

    }

    @Step
    public void assertEmptyPasswordErrorMessageIsDisplayed(){
        loginKeywords.assertEmptyPasswordErrorMessageIsDisplayed();

    }
}
