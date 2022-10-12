package Module1.Lesson11F;

import javax.lang.model.type.ArrayType;
import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {


        int[] ar1 = {12,343,423,53,674,1,-1,0, 99, 9329, 32};
        int[] ar2 = {12,343,423,53,674,1,-1,0, 99, 9329, 32};
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar1));

        System.out.println(Arrays.equals(ar1, ar2));

        System.out.println(ar1.equals(ar2));

       int[] ar3 = Arrays.copyOf(ar1, ar1.length);




    }
}
