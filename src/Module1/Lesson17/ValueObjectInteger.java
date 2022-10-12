package Module1.Lesson17;

public class ValueObjectInteger {

    private Integer value;

    public ValueObjectInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueObjectInteger{" +
                "value=" + value +
                '}';
    }
}
