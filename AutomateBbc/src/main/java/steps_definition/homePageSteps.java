package steps_definition;

import cucumber.api.java.en.Given;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.HomePage;

import static junit.framework.Assert.assertTrue;


/**
 * Created by christiann on 08/06/2017.
 */
public class HomePageSteps {

    private HomePage homePage = new HomePage();

    @Given("^I am on the BBC Home page$")
    public void goOnTheHomePage() {
        homePage.goToHomePage();

        assertTrue(homePage.getHomePageTitle().contains("Welcome to BBC"));
        assertTrue(homePage.getUrl().matches(DriverUtils.getCurrentPageUrl()));
    }
}
