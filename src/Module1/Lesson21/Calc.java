package Module1.Lesson21;

import java.io.IOException;

public class Calc extends Object {

    public static void main(String[] args){

   try {
        int x = division("aa", "1");
       System.out.println("Все сработало корректно, результат: " + x);
    } catch (ArithmeticException | IllegalArgumentException e) {

    }



        return;

    }

    private static int division(String left, String right) {

        if (left == null || right == null){
            throw new IllegalArgumentException("argument is null");
        }


            int a = Integer.parseInt(left);
            int b = Integer.parseInt(right);

          int  result = a / b;


        return result;
    }


}
