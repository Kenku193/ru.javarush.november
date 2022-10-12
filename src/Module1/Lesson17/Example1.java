package Module1.Lesson17;

public class Example1 <Yura>{

    // T E K V
    //

    private Yura value;

    public Example1(Yura value) {
        this.value = value;
    }

    public Yura getValue() {
        return value;
    }

    public void setValue(Yura value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Example1{" +
                "value=" + value +
                '}';
    }
}
