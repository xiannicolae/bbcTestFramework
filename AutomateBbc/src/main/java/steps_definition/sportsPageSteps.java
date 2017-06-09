package steps_definition;

import cucumber.api.java.en.Then;
import driver.DriverUtils;
import junit.framework.AssertionFailedError;
import page_n_components.pages.page_implementation.sportsPageImpl;
import page_n_components.pages.page_interface.sportsPageInterface;
import utils.javaUtils;

import java.io.IOException;

import static junit.framework.Assert.assertTrue;

/**
 * Created by christiann on 08/06/2017.
 */
public class sportsPageSteps {

    DriverUtils DriverUtils = new DriverUtils();
    sportsPageInterface sportsPageInterface = new sportsPageImpl();


    @Then("^I should be redirected to the Sport page$")
    public void checkIfOnSportsPage() throws IOException {
        try {
            assertTrue(sportsPageInterface.sportsPageUrl().matches(DriverUtils.getCurrentPageUrl()));
        } catch(AssertionFailedError e) {
            javaUtils.takeScreenshotOnError();
        }
        assertTrue(sportsPageInterface.sportsLogoExists());
    }
}
