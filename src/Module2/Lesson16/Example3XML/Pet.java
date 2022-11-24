package Module2.Lesson16.Example3XML;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pet {
    @JsonProperty
    private String name;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}
