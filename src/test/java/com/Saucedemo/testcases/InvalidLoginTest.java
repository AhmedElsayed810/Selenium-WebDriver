package com.Saucedemo.testcases;

import com.Saucedemo.base.BaseTest;
import com.Saucedemo.pages.Login.LoginPage;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

@Feature("Auth Feature")
public class InvalidLoginTest extends BaseTest {


    public InvalidLoginTest() {
    }
    LoginPage loginPage ;


    @Test(description = "Check That User Not Able To Login With Invalid Username")
    public void loginWithInvalidUsername() {

        loginPage = new LoginPage(driver);

        loginPage.login("standard", "secret_sauce");
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();

    }

    @Test(description = "Check That User Not Able To Login With Invalid Password")
    public void loginWithInvalidPassword() {

        loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "secret");
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();

    }


    @Test(description = "Check That User Not Able To Login With Invalid Credentials")
    public void loginWithInvalidUsernameAndPassword() {

        loginPage = new LoginPage(driver);

        loginPage.login("standard", "secret");
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();

    }


    @Test(description = "Check That User Not Able To Login With Empty Credentials")
    public void loginWithEmptyUsernameAndPassword() {

        loginPage = new LoginPage(driver);

        loginPage.login("", "");
        loginPage.assertEmptyUsernameOrBothErrorMessageIsDisplayed();

    }

    @Test(description = "Check That User Not Able To Login With Empty Username")
    public void loginWithEmptyUsername() {

        loginPage = new LoginPage(driver);

        loginPage.login("", "secret");
        loginPage.assertEmptyUsernameOrBothErrorMessageIsDisplayed();

    }


    @Test(description = "Check That User Not Able To Login With Empty Password")
    public void loginWithEmptyPassword() {

        loginPage = new LoginPage(driver);

        loginPage.login("standard_user", "");
        loginPage.assertEmptyPasswordErrorMessageIsDisplayed();

    }






}
