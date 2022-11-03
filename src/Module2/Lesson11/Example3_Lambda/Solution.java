package Module2.Lesson11.Example3_Lambda;

public class Solution {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 0; i < 400; i++) {
                System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
            }
        };

        new Thread(runnable).start();
    }
}
