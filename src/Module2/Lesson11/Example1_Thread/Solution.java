package Module2.Lesson11.Example1_Thread;

public class Solution {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        // myThread.run();
        myThread.start();
        myThread2.start();
        myThread3.start();

        for (int i = 0; i < 400; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("Шаг цикла №" + i + " поток " + Thread.currentThread().getName());
        }
    }
}
