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

    public File test() {
        return ((TakesScreenshot) Driver.getInstance()).getScreenshotAs(OutputType.FILE);
    }

    public void endSession() {
        Driver.getInstance().quit();
    }

    public void closeBrowserTab() {
        Driver.getInstance().close();
    }

    public void resetCookies() {
        Driver.getInstance().manage().deleteAllCookies();
    }

    public void maxWindow() {
        Driver.getInstance().manage().window().maximize();
    }

    public String getCurrentPageUrl() {
        return Driver.getInstance().getCurrentUrl();
    }

    // Navigation methods

    public void refreshPage() {
        Driver.getInstance().navigate().refresh();
    }

    public void goForward() {
        Driver.getInstance().navigate().forward();
    }

    public void goBack() {
        Driver.getInstance().navigate().back();
    }

    public void goToUrl(String url) {
        Driver.getInstance().get(url);
    }

}
