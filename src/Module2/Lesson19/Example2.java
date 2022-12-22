package Module2.Lesson19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Example2 {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress inetAddress1 = InetAddress.getLocalHost();
        System.out.println(inetAddress1);

        // localhost = 127.0.0.1

        InetAddress inetAddress2 = InetAddress.getByName("yandex.ru");
        System.out.println(inetAddress2);

        InetAddress inetAddress3 = InetAddress.getByName("javarush.ru");
        System.out.println(inetAddress3);

        InetAddress inetAddress4 = InetAddress.getByName("localhost");
        System.out.println(inetAddress4);
    }
}
