/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author christiann
 */
public class Driver {

    private static WebDriver driverInstance = null;

    protected Driver() {
    }

    public static WebDriver getInstance() {
        if (driverInstance == null) {
            synchronized (Driver.class) {
                String browser = System.getProperty("browser");

                switch (browser.toLowerCase()) {
                    case "firefox":
                        driverInstance = new FirefoxDriver();
                        break;
                    case "ie":
                        driverInstance = new InternetExplorerDriver();
                        break;
                    case "safari":
                        driverInstance = new SafariDriver();
                        break;
                    default:
                        driverInstance = new ChromeDriver();
                        break;
                }
            }
        }
        return driverInstance;
    }
}
