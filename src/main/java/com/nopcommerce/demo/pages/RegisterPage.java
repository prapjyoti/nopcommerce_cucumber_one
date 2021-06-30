package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {


    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement firstNameRequiredText;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmedPassword;

    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registerSuccessfully;


    public String verifyRegisterMessage() {

        log.info("Getting text from : " + registerText.toString());
        return getTextFromElement(registerText);

    }

    public void clickOnRegisterButton() {

        clickOnElement(registerButton);
        log.info("Click on register button : " + registerButton.toString());
    }

    public void confirmedPassword(String password) {

        sendTextToElement(confirmedPassword, password);
        log.info("Entering  confirmed password : " + password + " to confirmed password field : " + confirmedPassword.toString());
    }

    public String verifyFirstNameRequiredMessage() {

        log.info("Getting text from : " + firstNameRequiredText.toString());
        return getTextFromElement(firstNameRequiredText);

    }

    public void enterFirstNameField(String name) {

        sendTextToElement(firstName, name);
        log.info("Entering  confirmed password : " + firstName + " to first name  field : " + firstName.toString());
    }


    public void enterListNameField(String name) {

        sendTextToElement(lastName, name);
        log.info("Enter  last name password : " + lastName + " to Last Name field : " + lastName.toString());

    }

    public String verifyRegistrationSuccessfully() {

        log.info("Enter  last name password : " + registerSuccessfully.toString());
        return getTextFromElement(registerSuccessfully);


    }
}
