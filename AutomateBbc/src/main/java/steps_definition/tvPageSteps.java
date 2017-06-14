package steps_definition;

import cucumber.api.java.en.Then;
import driver.DriverInteractions;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.TvPageImpl;
import page_n_components.pages.page_interface.TvPageInterface;

import static junit.framework.Assert.assertTrue;

/**
 * Created by christiann on 08/06/2017.
 */
public class TvPageSteps {

    DriverInteractions DriverInteractions = new DriverInteractions();
    private final DriverUtils DriverUtils = new DriverUtils();
    private final TvPageInterface TvPageInterface = new TvPageImpl();


    @Then("^I should be redirected to the TV page$")
    public void checkIfOnTvPage() {
        assertTrue(TvPageInterface.tvPageUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(TvPageInterface.tvBrandExists());
    }
}
