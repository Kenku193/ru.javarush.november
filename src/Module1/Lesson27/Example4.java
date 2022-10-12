package Module1.Lesson27;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example4 {
    public static void main(String[] args) {


        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate dPlus = now.plusDays(1);
        LocalDate mPlus = now.plusMonths(20);
        LocalDate yPlus = now.plusYears(1);

        System.out.println(dPlus);
        System.out.println("Месяцы " + mPlus);
        System.out.println(yPlus);

        LocalDate localDate1 = LocalDate.MAX;
        LocalDate localDate2 = LocalDate.MIN;

        System.out.println(localDate1);
        System.out.println(localDate2);

        LocalTime localTime1 = LocalTime.MAX;
        LocalTime localTime2 = LocalTime.MIN;
        LocalTime localTime3 = LocalTime.MIDNIGHT; // ПОЛНОЧЬ


        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);



    }
}
