package steps_definition;

import contracts.Weather;
import contracts.WeatherData;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.WeatherPage;

import static junit.framework.TestCase.assertTrue;
import static page_n_components.components.components_implementation.UpperMenu.MainMenuSections.WEATHER;

/**
 * Created by christiann on 20/06/2017.
 */
public class WeatherPageSteps {

    private final WeatherPage weatherPage = new WeatherPage();
    private WeatherData weatherData;

    public WeatherPageSteps(WeatherData weather) {
        this.weatherData = weather;
    }

    @When("^User opens the BBC Weather page$")
    public void userOpensTheBBCEarthPage() {
        UpperHeaderSteps.clickOnUpperNav(WEATHER);
        checkIfOnWeatherPage();
    }

    @And("User searches for '(.*)' Forecast$")
    public void searchLocationForecast(String location) {
        weatherPage.searchForLocation(location);
        assertTrue(weatherPage.isWeatherLocationLogoDisplayed());
        assertTrue(location.toLowerCase().contains(weatherPage.getLocationLogoText()));
    }

    @And("User checks tomorrow max temperature for '(.*)'$")
    public void storeMaxTempTomorrow(String location) {
        assertTrue(weatherPage.isWeatherTomorrowDisplayed());

        Weather tomorrow = new Weather();
        tomorrow.setMaxTemperatureUnit(weatherPage.getTomorrowMaxTemp());
        tomorrow.setLocation(location);

        weatherData.weatherList.add(tomorrow);
    }

    @Then("User should be redirected to the Weather page$")
    public void checkIfOnWeatherPage() {
        assertTrue(weatherPage.getUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(weatherPage.isWeatherLogoDisplayed());
    }

    @Then("User gets which is the hottest location tomorrow$")
    public void returnHighestTempTomorrow() {
        Weather result = new Weather();
        int max = weatherData.weatherList.get(0).getMaxTemperature();

        for (Weather temperature : weatherData.weatherList) {
            int t = temperature.getMaxTemperature();
            if (max < t)
                {
                    max = t;
                    result = temperature;
                }
        }

        System.out.println("The highest temperature tomorrow is on: \n" + result.toString());
    }
}
