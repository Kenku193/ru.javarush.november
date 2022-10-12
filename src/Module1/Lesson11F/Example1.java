package Module1.Lesson11F;

public class Example1 {

    public static void main(String[] args) {

        System.out.println("Hello, world!");
       // int i = 10;

        String s = null;

        // ЧИСЛОВЫЕ
            // Целочисленные

        byte b = 127;
        short sh = 32767;
        int i = Integer.MAX_VALUE; //2147483647


        int i1 = 327823;

        long l = 2147483648L;

            // С плавающей точкой

        float f = 1.0F;

        double d1 = 3.14159262658;
        double d2 = 4.05E-13; // 4.05 * 10 13
        System.out.println(d2);


        // СТРОКОВЫЕ

        String simpleText = "Это обычная \"строка\". Такая же точно, как любая другая.";
        System.out.println(simpleText);


        // СИМВОЛЬНЫЕ

        char c1 = '@';
        char c2 = 'F';
        char c3 = '3'; //

        System.out.println("Символ деления " + '\u00F7');
        System.out.println("Символ умножения " + '\u00D7');
        System.out.println("Экранирование слэша " + '\\');


        // ЛОГИЧЕСКИЕ

        boolean B = true;


        Integer cat = 0x1F408;
        System.out.println(cat);
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toChars(cat));
        System.out.println(sb.toString());

        System.out.println("😻");



        // ВОСЬМЕРИЧНАЯ

        // 0 1 2 3 4 5 6 7

        int octal1 = 0132;


        // HEX

       // 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F
                        //    10 11 12 13 14 15

        int hex1 = 0xAF;  //1015 //25
        System.out.println(hex1);


        int hex2 = 0x7846F;


        // 4  3  2  1  0   -  степени
        // 7  8  4  6  F   - hex
        // 7  8  4  6  15  - decimal analog


        int x4 = 7 * 16 * 16 * 16 * 16;
        int x3 = 8 * 16 * 16 * 16;
        int x2 = 4 * 16 * 16;
        int x1 = 6 * 16;
        int x = 15;

        System.out.println(x4 + x3 + x2 + x1 + x);
        System.out.println(hex2);

        int max = 0x7fffffff;


        // ДВОИЧНАЯ СИСТЕМА

        // 0 и 1

        //                 64  32  16  8  4  2  1
        int binary1 = 0b0___0___0___0__0__0__1__1;
        System.out.println(binary1);


        // 89

        /*
        *  89 делим на 2 равно 44 остаток 1
        *  44 делим на 2 равно 22 остаток 0
        *  22 делим на 2 равно 11 остаток 0
        *  11 делим на 2 равно 5 остаток  1
        *  5 делим на 2 равно 2 остаток   1
        *  2 делим на 2 равно 1 остаток   0
        *  1 -                            1
         * */

        System.out.println(0b1011001);

    }
}
