package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static java.lang.Thread.sleep;

public class Utility extends BasePage {

    /*
     * This method will generate random number
     */
    public static int generateRandomNumber() {
        return (int) (Math.random() * 5000 + 1);

    }

    /**
     * This method will click on element
     */
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void clickOnElement(WebElement element) {
        element.click();
    }


    /*
     *This method will return list of elements
     */
    public List<WebElement> WebElementList(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will return text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public List getListfromelements(By by) {
        return driver.findElements(by);
    }

    /**
     * This method will returns list of web elements
     */
    public List<WebElement> webElementList(By by) {
        return driver.findElements(by);
    }

    public List<WebElement> getListOfElements(List<WebElement> element) {
        return (List<WebElement>) element;
    }


    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text to element or field
     */
    public void sendTextToElement(By by, String str) {
        driver.findElement(by).sendKeys(str);
    }

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
        element.sendKeys(Keys.TAB);
    }

    public void waitOnElement(int time) throws InterruptedException {
        sleep(time);
    }

    /**
     * This method will used to hover mouse on element
     */
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * This method will used to hover mouse on element and click
     */
    public void mouseHoverToElementAndClick(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().perform();
    }

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    /**
     * This method will used to select drop down menu by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String str) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(str);
    }

    public void selectByVisibleTextFromDropDown(WebElement element, String str) {
        Select select = new Select(element);
        select.selectByVisibleText(str);
    }

    /**
     * This method will used to select drop down menu by index
     */
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public void selectByIndexFromDropDown(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/nopcommerce/demo/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }
}
