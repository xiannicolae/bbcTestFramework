package steps_definition;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import page_n_components.components.components_implementation.TopHeaderImpl;
import page_n_components.components.components_interface.TopHeaderInterface;

import static page_n_components.components.components_implementation.TopHeaderImpl.*;

/**
 * Created by christiann on 08/06/2017.
 */
public class TopHeaderSteps {

    private final TopHeaderInterface TopHeaderInterface = new TopHeaderImpl();


    @When("^I click '(HOME|NEWS|SPORT|WEATHER|SHOP|EARTH|TRAVEL|CAPITAL|MORE)' on the upper navigation bar$")
    public void clickOnUpperNav(MainMenuSections headerType) {
        TopHeaderInterface.clickMenuSection(headerType);
    }

    @And("^On More section I click on '(CULTURE|AUTOS|FUTURE|TV|RADIO|CBBC|CBEEBIES|FOOD|IWONDER|BITESIZE|MUSIC|ARTS|MAKEITDIGITAL|TASTER|NATURE|LOCAL)'$")
    public void clickOnMoreMenuNav(MoreMenuSections subHeaderType) {
        TopHeaderInterface.clickMoreMenuSection(subHeaderType);
    }
}
