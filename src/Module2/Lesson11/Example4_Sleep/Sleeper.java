package Module2.Lesson11.Example4_Sleep;

public class Sleeper {
    public static void main(String[] args) {
        new Threadybear().start();
    }
}

class Threadybear extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
                Thread.sleep(500);
            }
            catch (InterruptedException ie){

            }

        }
    }
}
