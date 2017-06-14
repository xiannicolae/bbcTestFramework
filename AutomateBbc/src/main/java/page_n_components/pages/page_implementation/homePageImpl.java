/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import driver.DriverUtils;
import org.openqa.selenium.By;
import page_n_components.components.components_implementation.TopHeaderImpl;
import page_n_components.pages.page_interface.HomePageInterface;
import page_n_components.components.components_interface.TopHeaderInterface;

import static page_n_components.components.components_interface.TopHeaderInterface.MainMenuSections.*;

/**
 * @author christiann
 */
public class HomePageImpl implements HomePageInterface {

    private static final String BBC_URL = "http://www.bbc.com/";
    private static final By HOMEPAGE_TITLE = By.cssSelector("section[data-wwhp-module='header'] h2");
    private final DriverInteractions di = new DriverInteractions();
    private final DriverUtils du = new DriverUtils();

    @Override
    public void goToHomePage() {
        du.goToUrl(BBC_URL);
    }

    @Override
    public String getHomePageTitle() {
        return di.getElementText(HOMEPAGE_TITLE);
    }
}
