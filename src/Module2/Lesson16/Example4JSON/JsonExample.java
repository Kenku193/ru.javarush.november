package Module2.Lesson16.Example4JSON;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonExample {
    @JsonProperty
   private int a = 20;
    @JsonProperty
    private int b = 20;


    @Override
    public String toString() {
        return "JsonExample{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
