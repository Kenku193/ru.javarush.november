package Module2.Lesson06.Example3;

import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {

        UserFactory uF = User::new;
        User user1 = uF.create("Ivan", "Petrov");

        System.out.println(user1);


    }
}


