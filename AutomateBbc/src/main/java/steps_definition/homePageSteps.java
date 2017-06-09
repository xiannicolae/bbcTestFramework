package steps_definition;

import cucumber.api.java.en.Given;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.homePageImpl;
import page_n_components.pages.page_interface.homePageInterface;
import static junit.framework.Assert.assertTrue;


/**
 * Created by christiann on 08/06/2017.
 */
public class homePageSteps {

    homePageInterface homePageInterface = new homePageImpl();
    DriverUtils DriverUtils = new DriverUtils();

    @Given("^I am on the BBC Home page$")
    public void goOnTheHomePage(){
        homePageInterface.goToHomePage();
        DriverUtils.maxWindow(); //might consider moving to the browser step

        assertTrue(homePageInterface.getHomePageTitle().contains("Welcome to BBC"));
    }
}
