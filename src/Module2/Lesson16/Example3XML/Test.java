package Module2.Lesson16.Example3XML;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


import java.io.File;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        // https://www.baeldung.com/jackson-xml-serialization-and-deserialization

        // СОЗДАЕМ XML MAPPER
        XmlMapper xmlMapper = new XmlMapper();

        // СЕРИАЛИЗУЕМ В СТРОКУ
        String s = xmlMapper.writeValueAsString(new Human());
        // ТАК КАК ОБЪЕКТ "ПУСТОЙ" - ТО ЕСТЬ ПОЛЯ НЕ ЗАПОЛНЕНЫ, ТО НИЧЕГО ИНТЕРЕСНОГО И НЕ СЕРИАЛИЗУЕТСЯ
        System.out.println(s);

        // СЕРИАЛИЗУЕМ В ФАЙЛ
        xmlMapper.writeValue(new File("human.xml"), new Human());


        // ДЕСЕРИАЛИЗАЦИЯ ИЗ ФАЙЛА, ОТКУДА БУДУТ ВЗЯТЫ ЗНАЧЕНИЯ ПОЛЕЙ
        Human human = xmlMapper.readValue(new File("src/Module2/Lesson16/Example3XML/proto.xml"), Human.class);
        System.out.println(human);

    }


}
