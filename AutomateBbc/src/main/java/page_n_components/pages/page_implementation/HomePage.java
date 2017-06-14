/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import driver.DriverUtils;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.BasePage;

/**
 * @author christiann
 */
public class HomePage implements BasePage {

    private final DriverInteractions driverInteractions = new DriverInteractions();
    private final DriverUtils driverUtils = new DriverUtils();

    private static final String BBC_URL = "http://www.bbc.com/";
    private static final By HOMEPAGE_TITLE = By.cssSelector("section[data-wwhp-module='header'] h2");


    public void goToHomePage() {
        driverUtils.goToUrl(BBC_URL);
    }

    public String getHomePageTitle() {
        return driverInteractions.getElementText(HOMEPAGE_TITLE);
    }

    @Override
    public String getUrl() {
        return BBC_URL;
    }
}
