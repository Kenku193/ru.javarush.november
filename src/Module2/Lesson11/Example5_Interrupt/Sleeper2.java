package Module2.Lesson11.Example5_Interrupt;

public class Sleeper2 {
    public static void main(String[] args) throws InterruptedException {
       MyThread myThread = new MyThread();
      // myThread.start();
        myThread.start();
       Thread.sleep(2000);
       myThread.interrupt();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        while (!isInterrupted()){
            try {
                System.out.println("Tik");
                Thread.sleep(500);
                System.out.println("Tak");
                Thread.sleep(500);
            }
            catch (InterruptedException ie){
                    ie.printStackTrace();
            }

        }
    }
}

