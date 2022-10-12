package Module2.Lesson05;

public class ValueObject<T> {

    private T value;

    public ValueObject(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
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
