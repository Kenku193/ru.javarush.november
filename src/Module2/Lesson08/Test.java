package Module2.Lesson08;

import java.util.Scanner;

public class Test extends Object {



    public static String namePrefix; // 1 аллоцировались


    static {
        namePrefix = "hello";  //  2 присвоились
    }




        public int a = 5 ; //(0)

    {a = 10;}
    {a = 1020202;}
    {a = 101;}

    // не первым, а после всего что я описал выше

    public Test(int a) {
        this.a = a;
    }


// Bootstrap ClassLoader
    // Platform
    // App ClassLoader -> classpath

    // 1 Object
    // 2 Test
    // 3 main

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    }

    // ClassNotFound - на этапе компиляции если класс не найден
    // ClassNotDefined -

}
