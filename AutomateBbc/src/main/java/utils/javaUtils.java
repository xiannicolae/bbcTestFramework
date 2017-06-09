package utils;

import driver.DriverUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by christiann on 08/06/2017.
 */
public class javaUtils {

    static DriverUtils du = new DriverUtils();

    public static void takeScreenshotOnError() throws IOException {
        File scrFile = du.test();
        FileUtils.copyFile(scrFile, new File("C:\\Users\\christiann\\Documents\\NetBeansProjects\\AutomateBbc\\screenshots\\screenShot1.png"));
        System.out.println("Screenshot is captured for failed testcase");
    }


    public static String currentDateAndTime(){
        String result;

        Date dNow = new Date();
        result = dNow.toString();

        return result;
    }


}
