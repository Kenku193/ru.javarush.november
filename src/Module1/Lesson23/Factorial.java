package Module1.Lesson23;

import java.math.BigInteger;

public class Factorial {

    // factorial of 5
    // 1 * 2 * 3 * 4 * 5 = 120

         //   left                     right
    // (1 * 2 * 3 * 4) = 24       *     5

        // left                 right
    // (1 * 2 * 3)    *          4

    public static void main(String[] args) {

        BigInteger result = factorial(123456);
        System.out.println(result);

    }


    public static BigInteger factorial(int arg) {

        if ( arg < 0 ){
            throw new IllegalArgumentException("Не корректный аргумент");
        }

        else if ( arg < 2 ) {
            return BigInteger.ONE;
        } else {

            BigInteger left = factorial( arg - 1);
            BigInteger right = BigInteger.valueOf(arg);
            return left.multiply(right);

        }



    }


}
