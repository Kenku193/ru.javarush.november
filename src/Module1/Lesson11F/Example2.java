package Module1.Lesson11F;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        String data = "";


    // fdsjhflk
    // fdsjhflk fsdhjkfs
    // fdsjhflk fsdhjkfs cxmnzxm,c

//
//        for (;;) {
//            String line = console.nextLine();
//            if (line.equals("end")){
//                break;
//            }
//            data = data + " " + line;
//        }

        System.out.println(data);


     StringBuilder sb = new StringBuilder();
     sb.append("Привет!").append("Привет!").append("Привет!");

     sb.insert(10, "Пока");

     sb.delete(7, 10);

//        System.out.println(sb.indexOf("Пока"));
//        System.out.println(sb.reverse());

     System.out.println(sb);


     String firstName = "Yura";
     String lastName = "S";
     int age = 35;

        System.out.printf("Привет, меня зовут %s %s, мне %d лет", firstName, lastName, age);


    }
}
