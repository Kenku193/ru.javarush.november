package Module1.Lesson17;

import java.util.HashSet;
import java.util.Set;

public class Test2 {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(7);
        numbers.add(-2);
        numbers.add(-7);
        numbers.add(14);
        numbers.add(4);


        System.out.println(numbers);

        Set<Integer> copyNumbers = new HashSet<>(numbers);

        System.out.println(copyNumbers);


        for (Integer number : copyNumbers) {
            if (number < 0) {
                numbers.remove(number); }
        }

        System.out.println(numbers);

        Set<A> set = new HashSet<>();
        set.add(new A(1));
        set.add(new A(1));

        System.out.println(set.size());


         System.out.println(set);







    }

}

