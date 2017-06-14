/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.components.components_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.components.components_interface.BaseComponent;

/**
 * @author christiann
 */
public class UpperMenu implements BaseComponent {

    private final DriverInteractions driverInteractions = new DriverInteractions();

    // ENTIRE COMPONENT
    private final static By HEADER_BAR_SECTION = By.id("orb-header");
    // LOGO ELEMENT
    private final static By BBC_HEADER_LOGO = By.cssSelector(".orb-nav-theme-dynamic");
    // SIGN IN ELEMENT
    private final static By SIGN_IN = By.id("mybbc-wrapper");
    //MENU ELEMENTS
    private final static By NAV_LINKS = By.id("orb-nav-links");
    private final static By NEWS_MENU = By.cssSelector(".orb-nav-newsdotcom.orb-w");
    private final static By SPORT_MENU = By.cssSelector(".orb-nav-sport");
    private final static By WEATHER_MENU = By.cssSelector(".orb-nav-weather");
    private final static By SHOP_MENU = By.cssSelector(".orb-nav-shop.orb-w");
    private final static By EARTH_MENU = By.cssSelector(".orb-nav-earthdotcom.orb-w");
    private final static By TRAVEL_MENU = By.cssSelector(".orb-nav-travel-dotcom.orb-w");
    private final static By CAPITAL_MENU = By.cssSelector(".orb-nav-capital.orb-w");
    private final static By CULTURE_MENU = By.cssSelector(".orb-nav-culture.orb-w");
    private final static By MORE_MENU = By.id("orb-nav-more");
    // SEARCH ELEMENT
    private final static By SEARCH = By.cssSelector(".orb-nav-section.orb-nav-search");
    // MORE MENU ELEMENTS
    private final static By MORE_MENU_ARROW = By.cssSelector(".orb-icon.orb-icon-arrow");
    private final static By MORE_SECTION_TITLE = By.id("orb-panel-more-title");
    private final static By MORE_SECTION_LINKS = By.id("orb-panel-more");
    private final static By MORE_SECTION_AUTO_MENU = By.cssSelector(".orb-nav-autos.orb-w.orb-first-visible");
    private final static By MORE_SECTION_FUTURE_MENU = By.cssSelector(".orb-nav-future.orb-w");
    private final static By MORE_SECTION_TV_MENU = By.cssSelector("#orb-panel-more .orb-nav-tv");
    private final static By MORE_SECTION_RADIO_MENU = By.cssSelector(".orb-nav-radio");
    private final static By MORE_SECTION_CBBC_MENU = By.cssSelector(".orb-nav-cbbc");
    private final static By MORE_SECTION_CBEEBIES_MENU = By.cssSelector(".orb-nav-cbeebies");
    private final static By MORE_SECTION_FOOD_MENU = By.cssSelector(".orb-nav-food");
    private final static By MORE_SECTION_IWONDER_MENU = By.cssSelector("a[href='/iwonder']");
    private final static By MORE_SECTION_EDUCATION_MENU = By.cssSelector("a[href='/education']");
    private final static By MORE_SECTION_MUSIC_MENU = By.cssSelector(".orb-nav-music");
    private final static By MORE_SECTION_ARTS_MENU = By.cssSelector(".orb-nav-arts");
    private final static By MORE_SECTION_MAKEITDIGITAL_MENU = By.cssSelector(".orb-nav-makeitdigital");
    private final static By MORE_SECTION_TASTER_MENU = By.cssSelector("a[href='/taster']");
    private final static By MORE_SECTION_NATURE_MENU = By.cssSelector(".orb-nav-nature.orb-w");
    private final static By MORE_SECTION_LOCAL_MENU = By.cssSelector(".orb-nav-local");
    // SEARCH ELEMENTS
    private final static By SEARCH_INPUT = By.id("orb-search-q");
    private final static By SEARCH_BUTTON = By.id("orb-search-button");
    private final static By SEARCH_PANEL = By.cssSelector(".se-searchbox-panel");
    private final static By SEARCH_PANEL_BUTTON = By.cssSelector(".se-searchbox__submit");
    private final static By SEARCH_PANEL_CLOSE = By.cssSelector(".se-searchbox__clear.se-searchbox__clear--visible");
    // MAIN WEB SECTION
    private final static By SUGGESTIONS = By.cssSelector(".se-suggestions-container__title.se-hidden-s");


    public void clickMenuSection(MainMenuSections mainMenu) {
        switch (mainMenu) {
            case SPORT:
                clickOnSportsMenu();
                break;
            case MORE:
                clickOnMoreMenu();
                break;
            default:
                throw new IllegalArgumentException(mainMenu + " method is not implemented yet!");
        }
    }

    public void clickMoreMenuSection(MoreMenuSections moreMenu) {
        switch (moreMenu) {
            case TV:
                clickOnMoreMenuTV();
                break;
            default:
                throw new IllegalArgumentException(moreMenu + " method is not implemented yet!");
        }
    }

    private void clickOnSportsMenu() {
        driverInteractions.waitFor(SPORT_MENU);
        driverInteractions.clickOn(SPORT_MENU);
    }

    private void clickOnMoreMenu() {
        driverInteractions.waitFor(MORE_MENU);
        driverInteractions.clickOn(MORE_MENU);
    }

    private void clickOnMoreMenuTV() {
        driverInteractions.waitFor(MORE_SECTION_TV_MENU);
        driverInteractions.clickOn(MORE_SECTION_TV_MENU);
    }

    public enum MainMenuSections {
        HOME, NEWS, SPORT, WEATHER, SHOP,
        EARTH, TRAVEL, CAPITAL, MORE
    }

    public enum MoreMenuSections {
        CULTURE, AUTOS, FUTURE, TV, RADIO, CBBC,
        CBEEBIES, FOOD, IWONDER, BITESIZE, MUSIC,
        ARTS, MAKE_IT_DIGITAL, TASTER, NATURE, LOCAL
    }
}



