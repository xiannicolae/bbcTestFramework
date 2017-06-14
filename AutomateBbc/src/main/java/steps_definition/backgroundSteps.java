/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steps_definition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import driver.Driver;
import driver.DriverUtils;
import junit.framework.AssertionFailedError;
import utils.JavaUtils;

import java.io.IOException;
import java.text.ParseException;


/**
 * @author christiann
 */
public class BackgroundSteps {

    @Before
    public void openNewBrowser() {
        Driver.getInstance();
        DriverUtils.maxWindow();
    }

    /**
     * This method will create a screenshot each time when a scenario fails.
     * Throw Exceptions list can be extended.
     *
     * @param scenario
     * @throws IOException
     * @throws ParseException
     * @throws AssertionFailedError
     */
    @After
    public void takeScreenshotOnFailedScenario(Scenario scenario) throws IOException, ParseException, AssertionFailedError {
        if (scenario.isFailed()) JavaUtils.takeScreenshotOnError();
    }

    @After("@quit")
    public void closingBrowser() {
        DriverUtils.endSession();
    }

}
