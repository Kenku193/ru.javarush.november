package Module1.Lesson27;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {






        Date date = new Date();

        int[] formats = {DateFormat.SHORT, DateFormat.LONG, DateFormat.MEDIUM, DateFormat.FULL};

        for (int df: formats) {
            for (int tf: formats) {
                DateFormat dateFormat = SimpleDateFormat.getDateTimeInstance(df, tf, Locale.CHINESE);
                String strDateTime = dateFormat.format(date);
                System.out.println(strDateTime);
            }
        }

    }
}
