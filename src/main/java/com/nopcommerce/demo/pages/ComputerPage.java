package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @FindBy(linkText = "Desktops")
    WebElement deskTopLink;

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement deskTopText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[2]/a")
    WebElement notebookLink;

    @FindBy(xpath = "//h1[contains(text(),'Notebooks')]")
    WebElement noteBookText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a")
    WebElement software;

    @FindBy(xpath = "//h1[contains(text(),'Software')]")
    WebElement softwareText;


    public void clickOnDeskToplink() {
        clickOnElement(deskTopLink);
        log.info("Click on deskTop  link : " + deskTopLink.toString());
    }

    public void clickOnNoteBookLink() {
        clickOnElement(notebookLink);
        log.info("Click on noteBook  link : " + notebookLink.toString());

    }

    public void clickOnSoftWareLink() {
        clickOnElement(software);
        log.info("Click on Software  link : " + software.toString());

    }

    public String verifyDeskTopText() {
        log.info("verify deskTop text : " + deskTopText.toString());
        return getTextFromElement(deskTopText);
    }

    public String verifyNoteBookText() {
        log.info("verify NoteBook : " + noteBookText.toString());
        return getTextFromElement(noteBookText);
    }

    public String verifySoftwareText() {
        log.info("verify software text : " + softwareText.toString());
        return getTextFromElement(softwareText);
    }


}
