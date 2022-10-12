package Module2.Lesson03.Compose;

public class Car {

    String model = "Porsche";
    Engine engine;

    public Car() {
        this.engine = new Engine(360);
    }

}
