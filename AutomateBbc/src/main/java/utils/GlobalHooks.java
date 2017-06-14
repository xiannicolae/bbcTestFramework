package utils;

import cucumber.api.java.After;
import driver.Driver;

/**
 * Created by christiann on 12/06/2017.
 */

public class GlobalHooks {
    private static boolean afterInstance = false;

    @After
    public void afterAll() {
        if (!afterInstance) {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> Driver.getInstance().quit()));
            afterInstance = true;
        }
    }
}
