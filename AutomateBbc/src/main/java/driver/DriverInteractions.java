/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author christiann
 */
public class DriverInteractions extends Driver {
    
    private WebDriverWait wait;
    
    // Wait methods
    public WebDriverWait waitDriver(int timeout) {
        wait = new WebDriverWait(driver, timeout);
        return wait;
    }
    
    public void waitFor(By elementLocator) {
        waitDriver(20).until(ExpectedConditions.elementToBeClickable(elementLocator));
    }
    
    public void waitForPageToLoad() {
    Wait<WebDriver> wp1 = new WebDriverWait(driver, 30);
    wp1.until((WebDriver driver1) -> {
        System.out.println("Current Window State       : " + String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState")));
        return String.valueOf(((JavascriptExecutor) driver1).executeScript("return document.readyState")).equals("complete");
    });
    }
    
    // Interaction methods
    public void clickOn(By elementLocator) {
        driver.findElement(elementLocator).click();
    }
    
    public void typeIn(By inputField, String text) {
        driver.findElement(inputField).sendKeys(text);
    }
    
    public boolean existsElement(By elementLocator) {
        try {
            return driver.findElement(elementLocator).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    
    public String getElementText(By elementLocator) {
        return driver.findElement(elementLocator).getText();
    }
    
    
}
