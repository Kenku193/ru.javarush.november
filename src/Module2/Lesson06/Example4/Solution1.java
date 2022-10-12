package Module2.Lesson06.Example4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution1 {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Car> garage = new ArrayList<>();

        garage.add(new Car(Color.RED, "TOYOTA", 150, 1992));
        garage.add(new Car(Color.GREEN, "NISSAN", 200, 2001));
        garage.add(new Car(Color.INDIGO, "HONDA", 220, 2020));
        garage.add(new Car(Color.VIOLET, "VW", 199, 2021));
        garage.add(new Car(Color.RED, "FERRARI", 1, 1995));
        garage.add(new Car(Color.YELLOW, "MASERATI", 1000, 1992));
        garage.add(new Car(Color.BLUE, "TESLA", 999, 1993));


        Stream<Car> carStream = garage.stream();
        //System.out.println(carStream.anyMatch(car -> car.color == Color.BLUE));// Есть ли хоть одно совпадение?
        System.out.println(carStream.allMatch(car -> car.year == 2020)); // Все ли машины такого-то года?


        System.out.println();

        List<Car> selected = garage.stream()
                .filter(car -> car.color.equals(Color.RED))
                .filter(car -> car.year > 2000)
                .limit(10)
                .collect(Collectors.toList());


        System.out.println(selected);

    }

    private static List<Car> selectByColor(List<Car> list, Color c) {
        List<Car> selected = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).color == c) {
                selected.add(list.get(i));
            }
        }
        return selected;
    }

}
