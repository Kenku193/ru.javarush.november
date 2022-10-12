package Module1.Lesson23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Example3 {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream;

        try  {
          fileOutputStream = new FileOutputStream("test");
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }


    }
}
