package Module2.Lesson11.Example2_Runnable;

public class Solution {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        thread.start();

        Thread thread1 = new Thread(counter);
        thread1.start();

    }
}
