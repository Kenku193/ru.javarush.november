package Module2.Lesson11.Example5_Interrupt;

public class Solution2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadyDaddy threadyDaddy = new ThreadyDaddy();
        threadyDaddy.start();
        Thread.sleep(2000);

        threadyDaddy.interrupt(); // ВЫЗЫВАЕМ МЕТОД КОТОРЫЙ ПОПРОСИТ ПОТОК ПРЕРВАТЬСЯ

    }
}


class ThreadyDaddy extends Thread{

    @Override
    public void run() {
        while (!isInterrupted()){       // ПОЛУЧАЕМ ЗНАЧЕНИЕ ПОЛЯ isInterrupted ЧЕРЕЗ СООТВ МЕТОД
            System.out.println("Tik");  // ЭТО "ПЕРЕМЕННАЯ-ТУМБЛЕР" - КАК ТОЛЬКО ОНА СТАНЕТ TRUE - ПОТОК ПОЙМЕТ ЧТО
            System.out.println("Tak");  // НУЖНО ПРЕРВАТЬСЯ
        }
    }
}
