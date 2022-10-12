package Module1.Lesson11F;

import java.util.StringTokenizer;

public class Example3 {
    public static void main(String[] args) {

        StringBuilder sb =new StringBuilder("Иванов,Майкл,Джорданович     +174829374.9283   43434354/5343543");
        String st = sb.toString();

        System.out.println(st);

        StringTokenizer tokenizer = new StringTokenizer(st, ",./ ");
        System.out.println(tokenizer.countTokens());

        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());
        System.out.println(tokenizer.nextToken());

        System.out.println(tokenizer.hasMoreTokens());


    }
}
