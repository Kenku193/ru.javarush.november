package Module2.Lesson06.Example1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class SolutionEx1 {
    public static void main(String[] args) {

        ArrayList<String> week = new ArrayList<>();
        {
            week.add("Понедельник");  // 0
            week.add("Вторник");  // 1
            week.add("Среда");  // 2
            week.add("Четверг"); // 3
            week.add("Пятница");
            week.add("Суббота");
            week.add("Воскресенье");
        }


        for (String s : week) {
            System.out.println(s);
        }

        System.out.println();



        week.forEach(x -> System.out.println(x)); // дляКаждого

        System.out.println();

        week.forEach(System.out::println); // дляКаждого








//          System.out.println(week);
//
//        System.out.println();

       //  StringComparator stringComparator = new StringComparator();


//        Comparator<String> sComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

     //   Comparator<String> sComparator = (o1, o2) -> o1.length() - o2.length();


//        System.out.println();
//
//        Collections.sort(week, (o1, o2) -> o1.length() - o2.length());
//
//        System.out.println(week);


    }
}
