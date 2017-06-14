/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

/**
 * @author christiann
 */
public class DriverUtils {

    public static File test() {
        return ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.FILE);
    }

    public static void endSession() {
        Driver.getInstance().quit();
    }

    public static void closeBrowserTab() {
        Driver.getInstance().close();
    }

    public static void resetCookies() {
        Driver.getInstance().manage().deleteAllCookies();
    }

    public static void maxWindow() {
        Driver.getInstance().manage().window().maximize();
    }

    public static String getCurrentPageUrl() {
        return Driver.getInstance().getCurrentUrl();
    }

    // Navigation methods

    public static void refreshPage() {
        Driver.getInstance().navigate().refresh();
    }

    public static void goForward() {
        Driver.getInstance().navigate().forward();
    }

    public static void goBack() {
        Driver.getInstance().navigate().back();
    }

    public static void goToUrl(String url) {
        Driver.getInstance().get(url);
    }

}
