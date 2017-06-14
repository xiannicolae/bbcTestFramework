package steps_definition;

import cucumber.api.java.en.Given;
import page_n_components.pages.page_implementation.HomePageImpl;
import page_n_components.pages.page_interface.HomePageInterface;

import static junit.framework.Assert.assertTrue;


/**
 * Created by christiann on 08/06/2017.
 */
public class HomePageSteps {

    private HomePageInterface HomePageInterface = new HomePageImpl();

    @Given("^I am on the BBC Home page$")
    public void goOnTheHomePage() {
        HomePageInterface.goToHomePage();

        assertTrue(HomePageInterface.getHomePageTitle().contains("Welcome to BBC"));
    }
}
