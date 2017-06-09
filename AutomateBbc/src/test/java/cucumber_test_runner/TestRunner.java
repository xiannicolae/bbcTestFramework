/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cucumber_test_runner;

/**
 *
 * @author christiann
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by jgarcia on 10/06/16.
 */
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber/cucumber-html-report",
                "json:target/cucumber/cucumber-automation-report.json"
        },
        monochrome = true,
        features = "src/test/resources/features",
        glue = {"steps_definition"}
)
@RunWith(Cucumber.class)
public class TestRunner {

}
