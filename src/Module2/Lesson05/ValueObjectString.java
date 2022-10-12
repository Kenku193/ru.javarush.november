package Module2.Lesson05;

public class ValueObjectString {

    private String value;

    public ValueObjectString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    void printToConsole(){
        System.out.println(value);
    }

    @Override
    public String toString() {
       return String.valueOf(value);
    }
}
