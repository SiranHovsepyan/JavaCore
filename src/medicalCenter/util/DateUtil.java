package medicalCenter.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DateUtil {
    private static final SimpleDateFormat SDF_Time = new SimpleDateFormat("dd-MM-yyyy hh:mm");

    public static String dateTimeToString(Date date) {
        return SDF_Time.format(date);
    }
}


