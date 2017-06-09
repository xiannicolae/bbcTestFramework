/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steps_definition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.DriverInteractions;
import driver.DriverUtils;


/**
 *
 * @author christiann
 */
public class backgroundSteps {

    DriverUtils DriverUtils = new DriverUtils();
    DriverInteractions DriverInteractions = new DriverInteractions();


    @Before
    public void openNewBrowser() {
        DriverUtils.setBrowser(System.getProperty("browser"));
    }

    @After
    public void closingBrowser() {
        DriverUtils.endSession();
    }
}
