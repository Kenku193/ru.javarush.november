package Module2.Lesson16.Example4JSON;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        // ПРИМЕР С ПРОСТЫМ КЛАССОМ

        JsonExample jsonExample = new JsonExample();

        // СЕРИАЛИЗУЕМ
        objectMapper.writeValue(new File("src/Module2/Lesson16/Example4JSON/res.json"), jsonExample);

        // ДЕСЕРИАЛИЗУЕМ

        JsonExample jsonExampleBack = objectMapper.readValue(new File("src/Module2/Lesson16/Example4JSON/res.json"), JsonExample.class);
        System.out.println(jsonExampleBack);


        // ПРИМЕР С МАПОЙ - КЛАСС JsonMapExample

        // ЗАПОЛНЯЕМ МАПУ БЫСТРЫМ СПОСОБОМ
        JsonMapExample jsonMapExample = new JsonMapExample(
                Map.ofEntries(
                        Map.entry(20, new JsonExample()),
                        Map.entry(188, new JsonExample()),
                        Map.entry(201112, new JsonExample())
                ));

        // СЕРИАЛИЗУЕМ
        objectMapper.writeValue(new File("src/Module2/Lesson16/Example4JSON/resMap.json"), jsonMapExample);
        // ПОСМОТРИ В РЕЗУЛЬТИРУЮЩИЙ ФАЙЛ


        // ДЕСЕРИАЛИЗУЕМ
        // ОБРАТИТЕ ВНИМАНИЕ - ВЫВАЛИТСЯ ОШИБКА ПРИ ДЕСЕРИАЛИЗАЦИИ МАПЫ - ЗАЙДИТЕ В КЛАСС JsonMapExample
        // И РАСКОММЕНТИРУЙТЕ ПУСТОЙ КОНСТРУКТОР
        JsonMapExample jsonMapExample1 = objectMapper.readValue(new File("src/Module2/Lesson16/Example4JSON/resMap.json"), JsonMapExample.class);
        System.out.println(jsonMapExample1);


    }
}
