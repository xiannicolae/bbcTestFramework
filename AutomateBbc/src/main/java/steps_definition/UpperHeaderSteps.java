package steps_definition;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import page_n_components.components.components_implementation.UpperMenu;

import static page_n_components.components.components_implementation.UpperMenu.*;

/**
 * Created by christiann on 08/06/2017.
 */
public class UpperHeaderSteps {

    private static final UpperMenu upperMenu = new UpperMenu();

    @When("^User clicks '(HOME|NEWS|SPORT|WEATHER|SHOP|EARTH|TRAVEL|CAPITAL|MORE)' on the upper navigation bar$")
    public static void clickOnUpperNav(MainMenuSections headerType) {
        upperMenu.clickMenuSection(headerType);
    }

    @And("^On More section user clicks on '(CULTURE|AUTOS|FUTURE|TV|RADIO|CBBC|CBEEBIES|FOOD|IWONDER|BITESIZE|MUSIC|ARTS|MAKE_IT_DIGITAL|TASTER|NATURE|LOCAL)'$")
    public static void clickOnMoreMenuNav(MoreMenuSections subHeaderType) {
        upperMenu.clickMoreMenuSection(subHeaderType);
    }
}
