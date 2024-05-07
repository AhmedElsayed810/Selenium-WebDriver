package com.Saucedemo.stepDefinitions;

import com.Saucedemo.base.BaseTest;
import com.Saucedemo.pages.Login.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InvalidLoginStepDefinitions {

    private BaseTest baseTest;
    private LoginPage loginPage;

    public InvalidLoginStepDefinitions(BaseTest baseTest) {
        this.baseTest = baseTest;
        this.loginPage = new LoginPage((WebDriver) baseTest.getDriver());
    }

    @Given("the user is on the login page")
    public void navigateToLoginPage() {
        loginPage.login("dsds", "dsds");
    }

    @When("the user logs in with invalid username {string} and invalid password {string}")
    public void loginWithInvalidCredentials(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("an error message indicating invalid username or password is displayed")
    public void verifyInvalidUsernameOrPasswordErrorMessage() {
        loginPage.assertInvalidUsernameOrPasswordErrorMessage();
    }

    @Then("an error message indicating empty username or both fields is displayed")
    public void verifyEmptyUsernameOrBothErrorMessage() {
        loginPage.assertEmptyUsernameOrBothErrorMessageIsDisplayed();
    }

    @Then("an error message indicating empty password is displayed")
    public void verifyEmptyPasswordErrorMessage() {
        loginPage.assertEmptyPasswordErrorMessageIsDisplayed();
    }

    @When("the user logs in with valid username {string} and invalid password {string}")
    public void theUserLogsInWithValidUsernameAndInvalidPassword() {
        loginPage.login("username", "secret");
    }

    @When("the user logs in with empty username and password")
    public void theUserLogsInWithEmptyUsernameAndPassword() {

    }
}
