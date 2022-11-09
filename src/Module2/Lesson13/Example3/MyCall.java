package Module2.Lesson13.Example3;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCall implements Callable<String> {

    String s;

    public MyCall(String s) {
        this.s = s;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Начала работу штучка" + " " + s);
        return s + " My dear JR friend!";
    }

}

class go{
    public static void main(String[] args) throws Exception {
        MyCall myCall = new MyCall("Hello!");
       // System.out.println(myCall.call());

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        String call = myCall.call();
        System.out.println(call);

        for (int i = 0; i < 50; i++) {
            Future<String> submit = executorService.submit(new MyCall(String.valueOf(i)));
            System.out.println(submit.get());
        }

    }
}

