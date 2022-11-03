package Module2.Lesson10;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        countDown(20);
    }

    public static void countDown(int x) throws InterruptedException {
        if (x <= 0)
            System.out.println("Boom!");
        else {
            System.out.println(x);
            countDown(x - 1);
        }
    }
}
