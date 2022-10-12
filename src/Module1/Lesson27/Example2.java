package Module1.Lesson27;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Example2 {
    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();
        calendar.set(2022, Calendar.JULY, 15, 19, 36, 10);
        Date date = calendar.getTime();

        long t1 = date.getTime();

        System.out.println(date);

        calendar.set(2022, Calendar.JULY, 15, 19, 36, 11);
        Date date2 = calendar.getTime();
        long t2 = date2.getTime();

        System.out.println(date2);

        System.out.println(t2 - t1);

       Calendar calendar1 = new GregorianCalendar(2021, 129, 20);

       calendar1.set(1970,0,0,0,0,0);
        System.out.println(calendar1.getTimeInMillis());

    }
}
