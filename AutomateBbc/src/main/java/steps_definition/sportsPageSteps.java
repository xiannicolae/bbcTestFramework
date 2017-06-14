package steps_definition;

import cucumber.api.java.en.Then;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.SportsPageImpl;
import page_n_components.pages.page_interface.SportsPageInterface;


import static junit.framework.Assert.assertTrue;

/**
 * Created by christiann on 08/06/2017.
 */
public class SportsPageSteps {

    private final DriverUtils DriverUtils = new DriverUtils();
    private final SportsPageInterface SportsPageInterface = new SportsPageImpl();


    @Then("^I should be redirected to the Sport page$")
    public void checkIfOnSportsPage() {
        assertTrue(SportsPageInterface.sportsPageUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(SportsPageInterface.sportsLogoExists());
    }
}
