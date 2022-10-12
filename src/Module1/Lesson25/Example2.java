package Module1.Lesson25;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

public class Example2 {
    public static void main(String[] args) {

        byte[] bytes = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        baos.write(4);


        bytes = baos.toByteArray();



        byte[] array = "ThreadLocalRandom random = ThreadLocalRandom.current()".getBytes(StandardCharsets.UTF_8);

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        while (byteArrayInputStream.available() > 0){
            byte x = (byte) byteArrayInputStream.read();
            System.out.print(Integer.toBinaryString(x));
        }

    }
}
