package Module2.Lesson05;

public class ValueObjectInteger {
    private int value;

    public ValueObjectInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
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
