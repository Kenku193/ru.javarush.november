package Module2.Lesson11.Example1_Thread;

import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers extends Thread {
    @Override
    public void run() {
        try {
            int bound = 100;
            int result = ThreadLocalRandom.current().nextInt(bound);
            System.out.println("Thread " + Thread.currentThread().getId() + " generated " + result);
        }
        catch (Exception e){

        }
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();  // записывается текущее время в момент инициализации переменной

        for (int i = 0; i < 10; i++) {              // цикл на 10 итераций
            RandomNumbers randomNumbers = new RandomNumbers(); // создается объект класса RandomNumbers
            randomNumbers.start();                  // вызывается метод start, который приведет в действие run() в объекте RandomNumbers
        }

        long endTime = System.currentTimeMillis(); // записывается текущее время в момент инициализации переменной

        System.out.println("Time taken " + (endTime - startTime)); // после завершения итераций цикла, будет выведено время, которое ушло на работу кода внутри цикла
    }
}
