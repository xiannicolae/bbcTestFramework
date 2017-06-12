package utils;

import driver.DriverUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by christiann on 08/06/2017.
 */
public class javaUtils {

    static DriverUtils du = new DriverUtils();

    public static void takeScreenshotOnError() throws IOException {
        File scrFile = du.test();
        FileUtils.copyFile(scrFile, new File("C:\\Users\\christiann\\Documents\\NetBeansProjects\\AutomateBbc\\screenshots\\", dateNowToString() + ".png"));
        System.out.println("Screenshot is captured for failed testcase");
    }


    public static Date currentDateAndTime(){
        return new Date();
    }

    public static String dateNowToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");
        return formatter.format(currentDateAndTime());
    }

}
