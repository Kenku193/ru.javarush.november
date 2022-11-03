package Module2.Lesson11.Example5_Interrupt;

public class Solution {
        public static void main(String[] args) throws InterruptedException {
            ThreadyLady threadyLady = new ThreadyLady();
            threadyLady.start();
            Thread.sleep(2000);
          //  threadyLady.stop();
            threadyLady.isStopped = true;

        }
}

class ThreadyLady extends Thread{
    boolean isStopped;

        @Override
        public void run() {
            while (true){
                    System.out.println("Tik");
                    System.out.println("Tak");
                    if (isStopped) break;
            }
        }
    }
