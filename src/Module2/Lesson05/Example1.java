package Module2.Lesson05;

import Module2.Lesson05.Island.Bone;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList();


        arrayList.add("один");
        arrayList.add(null);



        System.out.println(
                arrayList.get(0) instanceof String
        );
        System.out.println(
                arrayList.get(1) instanceof String
        );




    }
}
