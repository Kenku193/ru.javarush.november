package Module2.Lesson16.Example5YAML;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        // https://www.baeldung.com/jackson-yaml

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        objectMapper.writeValue(new File("src/Module2/Lesson16/Example5YAML/res.yml"), new MyYML());

        MyYML myYML = objectMapper.readValue(new File("src/Module2/Lesson16/Example5YAML/proto.yml"), MyYML.class);
        System.out.println(myYML);


    }
}
