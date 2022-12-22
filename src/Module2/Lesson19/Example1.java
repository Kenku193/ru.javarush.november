package Module2.Lesson19;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Example1 {
    public static void main(String[] args) throws IOException {

        // СОЗДАЕМ СОКЕТ (КЛИЕНТ)
        Socket socket = new Socket("javarush.ru", 80);

        // ДЛЯ ОБМЕНА ДАННЫМИ НАМ НУЖНЫ ВХОДНОЙ И ВЫХОДНОЙ ПОТОКИ
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        // ЗАПРОС
        String request = "GET / HTTP/1.1\r\nHost:javarush.ru\r\n";

        // ЗАПИСЫВАЕМ В ПОТОК НАБОР БАЙТ
        outputStream.write(request.getBytes());

        outputStream.flush();

        // ЧИТАТЬ ОТВЕТ
        int value = 0;

        while ((value= inputStream.read()) != - 1){
            System.out.print((char) value);
        }

        // ВСЕ ЗАКРЫТЬ
        socket.close();
        inputStream.close();
        outputStream.close();


    }
}
