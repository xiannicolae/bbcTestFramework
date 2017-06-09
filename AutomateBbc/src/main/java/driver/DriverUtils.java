/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.io.File;

/**
 *
 * @author christiann
 */
public class DriverUtils extends Driver {
    
    public void setBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox": driver = new FirefoxDriver();
                            break;
            case "ie":      driver = new InternetExplorerDriver();
                            break;
            case "safari":  driver = new SafariDriver();
                            break;
            default:
                driver = new ChromeDriver();
                break;
        }
    }

    public File test() {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }
    
    public void endSession() {
        driver.quit();
    }
    
    public void closeBrowserTab() {
        driver.close();
    }
    
    public void resetCookies() {
        driver.manage().deleteAllCookies();
    }
    
    public void maxWindow() {
        driver.manage().window().maximize();
    }
    
    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }
    
    // Navigation methods
    
    public void refreshPage() {
        driver.navigate().refresh();
    }
    
    public void goForward() {
        driver.navigate().forward();
    }
    
    public void goBack() {
        driver.navigate().back();
    }
    
    public void goToUrl(String url) {
        driver.get(url);
    }
  
}
