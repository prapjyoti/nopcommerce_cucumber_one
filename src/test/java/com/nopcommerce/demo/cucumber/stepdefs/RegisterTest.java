package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class RegisterTest {
    @When("^I click on register link$")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();

    }

    @Then("^I should see the register text and verify it$")
    public void iShouldSeeTheRegisterTextAndVerifyIt() {
        String expectedRegisterText = "Register";
        String actualRegisterText = new RegisterPage().verifyRegisterMessage();
        Assert.assertEquals(actualRegisterText, expectedRegisterText);
    }

    @And("^I leave mandatory field empty and click on register button$")
    public void iLeaveMandatoryFieldEmptyAndClickOnRegisterButton() throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().clickOnRegisterButton();

    }

    @Then("^I should see error message that first name is  required$")
    public void iShouldSeeErrorMessageThatFirstNameIsRequired() throws InterruptedException {
        Thread.sleep(500);
        String actualMessage = "First name is required.";
        String expectedMessage = new RegisterPage().verifyFirstNameRequiredMessage();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @When("^I enter first Name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) throws InterruptedException {
        Thread.sleep(500);
        new RegisterPage().enterFirstNameField(firstName);

    }

    @And("^I enter last Name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName){
     new RegisterPage().enterListNameField(lastName);

    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email){
        new LoginPage().enterEmailId(email);


    }

    @And("^I enter confirmed password \"([^\"]*)\"$")
    public void iEnterConfirmedPassword(String confirmedpassword)
    {
      new RegisterPage().confirmedPassword(confirmedpassword);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();

    }

    @Then("^I should see registration completed successfully$")
    public void iShouldSeeRegistrationCompletedSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        String actualMessage = "Your registration completed";
        String expectedMessage = new RegisterPage().verifyRegistrationSuccessfully();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}
