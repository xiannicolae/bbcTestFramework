/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.SportsPageInterface;

/**
 * @author christiann
 */
public class SportsPageImpl implements SportsPageInterface {

    private static final String BBC_SPORT_URL = "http://www.bbc.com/sport";
    private static final By SPORTS_LOGO = By.cssSelector(".global-header__logo[href='/sport']");
    private final DriverInteractions di = new DriverInteractions();

    @Override
    public boolean sportsLogoExists() {
        return di.existsElement(SPORTS_LOGO);
    }

    @Override
    public String sportsPageUrl() {
        return BBC_SPORT_URL;
    }
}
