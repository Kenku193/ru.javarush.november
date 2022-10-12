package Module1.Lesson17;

import java.util.*;

public class Test {

    public static void main(String[] args) {


        HashSet<Integer> mySet = new HashSet<>();

        mySet.add(1);
        mySet.add(6);
        mySet.add(2);
        mySet.add(118);
        mySet.add(-99);

//        Iterator<?> it = mySet.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }



        for (Integer integer : mySet) {
            mySet.add(0);
        }








    }


}
