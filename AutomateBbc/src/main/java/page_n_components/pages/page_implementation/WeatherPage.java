package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.BasePage;
import utils.JavaUtils;

/**
 * Created by christiann on 20/06/2017.
 */
public class WeatherPage implements BasePage {

    private static final String BBC_WEATHER_URL = "http://www.bbc.com/weather/";
    private static final By WEATHER_LOGO = By.cssSelector(".site-name[href='/weather/']");
    private static final By WEATHER_LOCATION_LOGO = By.cssSelector(".location-name");

    private static final By WEATHER_LOCATOR_SEARCH_FORM = By.id("locator-form-search");
    private static final By WEATHER_LOCATOR_SEARCH_SUBMIT = By.id("locator-form-submit");
    private static final By WEATHER_LOCATOR_SEARCH_RESULTS = By.cssSelector(".locator-results");

    private static final By TODAY_TEMP = By.cssSelector(".day-" + JavaUtils.tomorrowDateToString());
    private static final By TOMORROW_MAX_TEMP = By.cssSelector(".day-" + JavaUtils.tomorrowDateToString() + " .max-temp .temperature-value-unit-c");

    @Override
    public String getUrl() { return BBC_WEATHER_URL; }

    public boolean isWeatherLogoDisplayed() { return DriverInteractions.isLocatorDisplayed(WEATHER_LOGO); }

    public boolean isWeatherLocationLogoDisplayed() { return DriverInteractions.isLocatorDisplayed(WEATHER_LOCATION_LOGO); }

    public boolean isWeatherTomorrowDisplayed() { return DriverInteractions.isLocatorDisplayed(TODAY_TEMP); }

    public String getLocationLogoText() { return DriverInteractions.getElementText(WEATHER_LOCATION_LOGO).toLowerCase(); }

    public void searchForLocation(String location) {
        clickOnSearchForm();
        DriverInteractions.typeIn(WEATHER_LOCATOR_SEARCH_FORM, location);
        clickOnSearchSubmit();

        try {
            DriverInteractions.waitFor(WEATHER_LOCATOR_SEARCH_RESULTS, 1);
            clickOnSearchSuggestion(location);
        } catch (Exception ignored) {}

        DriverInteractions.waitForPageToLoad();
    }

    public String getTomorrowMaxTemp() {
        return DriverInteractions.getElementText(TOMORROW_MAX_TEMP);
    }

    private void clickOnSearchForm() {
        DriverInteractions.waitFor(WEATHER_LOCATOR_SEARCH_FORM);
        DriverInteractions.clickOn(WEATHER_LOCATOR_SEARCH_FORM);
    }

    private void clickOnSearchSubmit() {
        DriverInteractions.waitFor(WEATHER_LOCATOR_SEARCH_SUBMIT);
        DriverInteractions.clickOn(WEATHER_LOCATOR_SEARCH_SUBMIT);
    }

    private void clickOnSearchSuggestion(String location) {
        DriverInteractions.waitFor(WEATHER_LOCATOR_SEARCH_RESULTS);
        DriverInteractions.clickOn(resultLocator(location));
    }

    private By resultLocator(String locationName) {
        return By.cssSelector(".locator-results a[title=\""+locationName+"\"]");
    }

}
