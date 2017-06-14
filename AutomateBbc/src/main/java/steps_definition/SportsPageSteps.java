package steps_definition;

import cucumber.api.java.en.Then;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.SportsPage;


import static junit.framework.Assert.assertTrue;

/**
 * Created by christiann on 08/06/2017.
 */
public class SportsPageSteps {

    private final DriverUtils driverUtils = new DriverUtils();
    private final SportsPage sportPage = new SportsPage();


    @Then("^I should be redirected to the Sport page$")
    public void checkIfOnSportsPage() {
        assertTrue(sportPage.getUrl().matches(driverUtils.getCurrentPageUrl()));
        assertTrue(sportPage.sportsLogoExists());
    }
}
