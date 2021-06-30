package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Welcome, Please Sign In!", new LoginPage().getWelcomeText());
    }

    @And("^I enter email \"([^\"]*)\"and$")
    public void iEnterEmailAnd(String email) throws InterruptedException {
        Thread.sleep(500);
        new LoginPage().enterEmailId(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) throws InterruptedException {
        Thread.sleep(500);
        new LoginPage().enterPassword(password);

    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertEquals("Welcome to our store", new LoginPage().getWelcomeToStore());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String actualMessage) throws InterruptedException {
        Thread.sleep(500);
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
       actualMessage= new LoginPage().getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }
}
