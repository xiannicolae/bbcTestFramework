package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.TvPageInterface;

/**
 * Created by christiann on 08/06/2017.
 */
public class TvPageImpl implements TvPageInterface {


    private static final String BBC_TV_URL = "http://www.bbc.com/tv/";
    private static final By TV_BRAND = By.cssSelector(".site-brand-lining [href='/tv']");
    private final DriverInteractions di = new DriverInteractions();

    @Override
    public boolean tvBrandExists() {
        return di.existsElement(TV_BRAND);
    }

    @Override
    public String tvPageUrl() {
        return BBC_TV_URL;
    }

}