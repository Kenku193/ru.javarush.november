package Module2.Lesson11.Example3_Lambda;

public class Solution2 {
    public static void main(String[] args) {


        new Thread(() -> {
            for (int i = 0; i < 400; i++) {
                System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
            }
        }).start();


        for (int i = 0; i < 400; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }


    }
}
