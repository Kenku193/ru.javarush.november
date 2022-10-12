package Module1.Lesson27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Example6 {
    public static void main(String[] args) {


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate date = LocalDate.parse("2022 10 10", dtf);
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2003, 11, 18);
        LocalDate date2 = LocalDate.of(2022, 7, 11);

        Period period = Period.between(date2, date1);
        System.out.println(period);

    }
}
