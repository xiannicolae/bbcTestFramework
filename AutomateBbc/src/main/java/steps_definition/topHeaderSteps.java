package steps_definition;

import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import page_n_components.components.components_implementation.topHeaderImpl;
import page_n_components.components.components_interface.topHeaderInterface;
import utils.javaUtils;

import static page_n_components.components.components_implementation.topHeaderImpl.*;

/**
 * Created by christiann on 08/06/2017.
 */
public class topHeaderSteps {

    topHeaderInterface topHeaderInterface = new topHeaderImpl();


    @When("^I click '(HOME|NEWS|SPORT|WEATHER|SHOP|EARTH|TRAVEL|CAPITAL|MORE)' on the upper navigation bar$")
    public void clickOnUpperNav(MainMenuSections headerType) {
        System.out.println(javaUtils.currentDateAndTime());
        topHeaderInterface.clickMenuSection(headerType);
    }

    @And("^On More section I click on '(CULTURE|AUTOS|FUTURE|TV|RADIO|CBBC|CBEEBIES|FOOD|IWONDER|BITESIZE|MUSIC|ARTS|MAKEITDIGITAL|TASTER|NATURE|LOCAL)'$")
    public void clickOnMoreMenuNav(MoreMenuSections subHeaderType) {
        topHeaderInterface.clickMoreMenuSection(subHeaderType);
    }
}
