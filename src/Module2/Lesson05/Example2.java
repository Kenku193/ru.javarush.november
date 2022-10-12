package Module2.Lesson05;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4);

        List<Object> objL = new ArrayList<>();
        objL.add(new String("dsjd"));


        List<? super Number> numbers = objL;


        for (int i = 0; i < numbers.size(); i++) {

        }

       // Test2.doSomething(list);

        Set<Object> objSet = new HashSet<>();

        String[] str = {"a", "b", "c", "d"};
        Object[] obj = str;

        obj[0] = 42 + "";



    }
}
