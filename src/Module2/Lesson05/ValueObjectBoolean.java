package Module2.Lesson05;

public class ValueObjectBoolean {
    private Boolean value;

    public ValueObjectBoolean(Boolean value) {
        this.value = value;
    }

    public Boolean getValue() {
        return value;
    }

    public void setValue(Boolean value) {
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
