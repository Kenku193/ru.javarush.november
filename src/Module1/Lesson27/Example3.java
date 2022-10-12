package Module1.Lesson27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Example3 {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();


        calendar.setTime(new Date());

        System.out.println(calendar.getTime());

        System.out.println( LocalDate.now());
        System.out.println( LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate nowPlus = now.plusMonths(1);
        System.out.println(nowPlus);




    }
}
