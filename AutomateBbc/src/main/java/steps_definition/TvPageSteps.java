package steps_definition;

import cucumber.api.java.en.Then;
import driver.DriverUtils;
import page_n_components.pages.page_implementation.TvPage;

import static junit.framework.Assert.assertTrue;

/**
 * Created by christiann on 08/06/2017.
 */
public class TvPageSteps {

    private final TvPage tvPage = new TvPage();


    @Then("^User should be redirected to the TV page$")
    public void checkIfOnTvPage() {
        assertTrue(tvPage.getUrl().matches(DriverUtils.getCurrentPageUrl()));
        assertTrue(tvPage.tvBrandExists());
    }
}
