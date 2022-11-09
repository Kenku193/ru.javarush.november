package Module2.Lesson11.Example2_Runnable;

public class Counter implements Runnable {

    // RUN(запускать) ABLE (возможно)

    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }
    }
}
