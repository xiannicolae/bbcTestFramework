package page_n_components.pages.page_implementation;

import driver.DriverInteractions;
import org.openqa.selenium.By;
import page_n_components.pages.page_interface.tvPageInterface;

/**
 * Created by christiann on 08/06/2017.
 */
public class tvPageImpl implements tvPageInterface {


    DriverInteractions di = new DriverInteractions();

    protected static final String BBC_TV_URL = "http://www.bbc.com/tv/";
    protected static final By TV_BRAND = By.cssSelector(".site-brand-lining [href='/tv']");

    @Override
    public boolean tvBrandExists() {
        return di.existsElement(TV_BRAND);
    }

    @Override
    public String tvPageUrl() {
        return BBC_TV_URL;
    }

}