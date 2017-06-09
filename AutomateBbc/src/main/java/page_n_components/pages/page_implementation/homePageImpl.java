/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import driver.DriverUtils;
import org.openqa.selenium.By;
import page_n_components.components.components_implementation.topHeaderImpl;
import page_n_components.pages.page_interface.homePageInterface;
import page_n_components.components.components_interface.topHeaderInterface;
import static page_n_components.components.components_interface.topHeaderInterface.MainMenuSections.*;

/**
 *
 * @author christiann
 */
public class homePageImpl implements homePageInterface {
    
    DriverInteractions di = new DriverInteractions();
    DriverUtils du = new DriverUtils();
    topHeaderInterface topHeaderInterface = new topHeaderImpl();
    
    protected static final String BBC_URL = "http://www.bbc.com/";
    protected static final By HOMEPAGE_TITLE = By.cssSelector("section[data-wwhp-module='header'] h2");


    @Override
    public void goToHomePage() {
        du.goToUrl(BBC_URL);
    }
    
    @Override
    public void goToSportsPage() {
        topHeaderInterface.clickMenuSection(SPORT);
    }
    
    @Override
    public String getHomePageTitle() {
        return di.getElementText(HOMEPAGE_TITLE);
    }
}
