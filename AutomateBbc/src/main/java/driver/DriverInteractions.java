/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * @author christiann
 */
public class DriverInteractions {

    // Wait methods
    private static WebDriverWait waitDriver(long timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getInstance(), timeout);
        return wait;
    }

    public static void waitFor(By elementLocator) {
        waitDriver(10).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    public static void waitFor(By elementLocator, long timeout) {
        waitDriver(timeout).until(ExpectedConditions.presenceOfElementLocated(elementLocator));
    }

    public static void waitForPageToLoad() {
        Wait<WebDriver> wp1 = new WebDriverWait(Driver.getInstance(), 30);
        wp1.until((WebDriver driver1) -> {
            System.out.println("Current Window State       : " + String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState")));
            return String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState")).equals("complete");
        });
    }

    // Interaction methods
    public static void clickOn(By elementLocator) {
        Driver.getInstance().findElement(elementLocator).click();
    }

    public static void typeIn(By inputField, String text) {
        Driver.getInstance().findElement(inputField).sendKeys(text);
    }

    public static boolean isLocatorDisplayed(By elementLocator) {
        try {
            return Driver.getInstance().findElement(elementLocator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public static String getElementText(By elementLocator) {
        return Driver.getInstance().findElement(elementLocator).getText();
    }

    public static Select getDropdown(By elementLocator) {
        Select dropdown = new Select(Driver.getInstance().findElement(elementLocator));
        return dropdown;
    }

    public static String getCustomAttribute(By elementLocator, String attribute) {
        return Driver.getInstance().findElement(elementLocator).getAttribute(attribute);
    }

    public static List<WebElement> findElementsList(By elementLocator) {
        return Driver.getInstance().findElements(elementLocator);
    }

    public static WebElement findBy(By elementLocator) {
        return Driver.getInstance().findElement(elementLocator);
    }
}
