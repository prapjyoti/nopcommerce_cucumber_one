package com.nopcommerce.demo.cucumber.stepdefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerTest {
    @Given("^I am on Computer page$")
    public void iAmOnComputerPage() {
        new HomePage().mouseHoverOnComputerLink();

    }

    @When("^I click on Desktops Link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDeskToplink();

    }

    @Then("^I should navigate to Desktops page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        String expecteddesktopText = "Desktops";
        String actualdesktopText = new ComputerPage().verifyDeskTopText();
        Assert.assertEquals(expecteddesktopText, actualdesktopText);

    }

    @When("^I click on Note Books Link$")
    public void iClickOnNoteBooksLink() {
        new ComputerPage().clickOnNoteBookLink();
    }

    @Then("^I should navigate to Note Books Link successfully$")
    public void iShouldNavigateToNoteBooksLinkSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage = "Notebooks";
        String actualdMessage = new ComputerPage().verifyNoteBookText();
        Assert.assertEquals(actualdMessage, expectedMessage);

    }

    @When("^I click on Software Link$")
    public void iClickOnSoftwareLink() {
        new ComputerPage().clickOnSoftWareLink();

    }

    @Then("^I should navigate to Software Link successfully$")
    public void iShouldNavigateToSoftwareLinkSuccessfully() throws InterruptedException {
        Thread.sleep(1000);
        String expectedMessage = "Softwar";
        String actualdMessage = new ComputerPage().verifySoftwareText();
        Assert.assertEquals(actualdMessage, expectedMessage);
    }
}
