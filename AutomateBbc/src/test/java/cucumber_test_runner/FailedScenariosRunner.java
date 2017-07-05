package cucumber_test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/**
 * Created by christiann on 03/07/2017.
 */
@CucumberOptions(
        strict = false,
        format = {"pretty",
                "json:target/cucumber.json"
        },
        plugin = {"rerun:target/rerun.txt"},
        monochrome = true,
        features = "@target/rerun.txt",
        glue = {"steps_definition", "utils"}
)
@RunWith(Cucumber.class)
public class FailedScenariosRunner {

}
