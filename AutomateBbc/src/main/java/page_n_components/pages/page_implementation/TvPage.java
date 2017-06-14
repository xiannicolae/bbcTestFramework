package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.BasePage;

/**
 * Created by christiann on 08/06/2017.
 */
public class TvPage implements BasePage {

    private final DriverInteractions driverInteractions = new DriverInteractions();

    private static final String BBC_TV_URL = "http://www.bbc.com/tv/";
    private static final By TV_BRAND = By.cssSelector(".site-brand-lining [href='/tv']");


    public boolean tvBrandExists() {
        return driverInteractions.existsElement(TV_BRAND);
    }

    @Override
    public String getUrl() {
        return BBC_TV_URL;
    }

}