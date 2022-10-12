package Module1.Lesson25;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Example1 {
    public static void main(String[] args) {


      try (DataOutputStream dataOutputStream = new DataOutputStream(
              new BufferedOutputStream(
                      new FileOutputStream("data.dat")
              )
      ))
      {
          for (int i = 0; i < 100; i++) {
              ThreadLocalRandom random = ThreadLocalRandom.current();
              int value = random.nextInt(1000); // 0 - 999
              dataOutputStream.writeInt(value);
          }
      }
      catch (IOException e){
          e.printStackTrace();
      }


        List<Integer> list = new ArrayList<>();

      try ( DataInputStream dataInputStream = new DataInputStream(
              new BufferedInputStream(
                      new FileInputStream("data.dat")
              )
      ))
      {
       while (dataInputStream.available() > 0){
           int i = dataInputStream.readInt();
           list.add(i);
       }
      }
      catch (IOException e){
          e.printStackTrace();
      }

        double average = 0;
        for (Integer integer : list) {
            average += integer;
        }
        System.out.println("Среднее арифметическое: " + average/list.size());


        //     255 | 0 | 122 | 9



        //     10 | 101 | 12 | 241


    }
}
