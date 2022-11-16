package Module2.Lesson13.Example4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Gogo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(8);

        for (int i = 0; i < 20; i++) {
            Client client = new Client(i);
         executorService.execute(client);
        }

        executorService.shutdown();

        Client client = new Client(222);
        executorService.execute(client);
    }

}