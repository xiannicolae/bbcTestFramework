/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.sportsPageInterface;

/**
 *
 * @author christiann
 */
public class sportsPageImpl implements sportsPageInterface {
    
    DriverInteractions di = new DriverInteractions();
    
    protected static final String BBC_SPORT_URL = "http://www.bbc.com/sport";
    protected static final By SPORTS_LOGO = By.cssSelector(".global-header__logo[href='/sport']");
    
    @Override
    public boolean sportsLogoExists() {
        return di.existsElement(SPORTS_LOGO);
    }
    
    @Override
    public String sportsPageUrl() {
        return BBC_SPORT_URL;
    }
}
