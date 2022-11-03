package Module2.Lesson11;

public class RecursionWithSleep {
    public static void main(String[] args) throws InterruptedException {
        countDown(20);
    }

    public static void countDown(int x) throws InterruptedException {
        if (x <= 0)
            System.out.println("Boom!");
        else {
            System.out.println(x);
            Thread.sleep(500); // ЗАСТАВЛЯЕМ ПОТОК "СПАТЬ" 500 милисекунд
            String name = Thread.currentThread().getName();
            System.out.println(name);
            countDown(x - 1);
        }
    }
}
