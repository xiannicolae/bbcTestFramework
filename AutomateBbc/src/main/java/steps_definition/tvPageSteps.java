package steps_definition;

import cucumber.api.java.en.Then;
import driver.DriverInteractions;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.tvPageImpl;
import page_n_components.pages.page_interface.tvPageInterface;

import static junit.framework.Assert.assertTrue;

/**
 * Created by christiann on 08/06/2017.
 */
public class tvPageSteps {

    DriverInteractions DriverInteractions = new DriverInteractions();
    DriverUtils DriverUtils = new DriverUtils();
    tvPageInterface tvPageInterface = new tvPageImpl();


    @Then("^I should be redirected to the TV page$")
    public void checkIfOnTvPage() {
        assertTrue(tvPageInterface.tvPageUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(tvPageInterface.tvBrandExists());
    }
}
