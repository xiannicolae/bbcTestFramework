/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package page_n_components.components.components_interface;

/**
 * @author christiann
 */
public interface TopHeaderInterface {

    void clickMoreMenuSection(MoreMenuSections subHeaderType);

    void clickMenuSection(MainMenuSections headerType);

    enum MainMenuSections {
        HOME, NEWS, SPORT, WEATHER, SHOP,
        EARTH, TRAVEL, CAPITAL, MORE
    }

    enum MoreMenuSections {
        CULTURE, AUTOS, FUTURE, TV, RADIO, CBBC,
        CBEEBIES, FOOD, IWONDER, BITESIZE, MUSIC,
        ARTS, MAKEITDIGITAL, TASTER, NATURE, LOCAL
    }
}
