/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.components.components_implementation.UpperMenu;
import page_n_components.pages.page_interface.BasePage;

/**
 * @author christiann
 */
public class SportsPage implements BasePage {

    private final DriverInteractions driverInteractions = new DriverInteractions();
    public UpperMenu upperMenu = new UpperMenu();

    private static final String BBC_SPORT_URL = "http://www.bbc.com/sport";
    private static final By SPORTS_LOGO = By.cssSelector(".global-header__logo[href='/sport']");


    public boolean sportsLogoExists() {
        return driverInteractions.existsElement(SPORTS_LOGO);
    }

    @Override
    public String getUrl() {
        return BBC_SPORT_URL;
    }
}
