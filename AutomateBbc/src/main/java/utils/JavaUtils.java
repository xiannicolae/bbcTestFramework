package utils;


import driver.DriverUtils;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by christiann on 08/06/2017.
 */
public class JavaUtils {

    private JavaUtils() {
    }

    public static void takeScreenshotOnError() throws IOException {
        File scrFile = DriverUtils.takeScreenshotOnErr();
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\screenshots\\", nowDateToString() + ".png"));
        System.out.println("Screenshot is captured for failed testcase");
    }

    public static String tomorrowDateToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        Calendar c = Calendar.getInstance();

        c.setTime(new Date());
        c.add(Calendar.DATE, 1);

        return formatter.format(c.getTime());
    }

    private static Date currentDateAndTime() {
        return new Date();
    }

    private static String nowDateToString() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");
        return formatter.format(currentDateAndTime());
    }

}
