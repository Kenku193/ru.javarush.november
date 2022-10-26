package Module2.Lesson09;

import java.util.Objects;

public class Car {
    protected String model;
    private int power;
   protected Engine engine;


    public Car(String model, int power, Engine engine) {
        this.model = model;
        this.power = power;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, engine);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
     //   return super.clone();
        return new Car(this.model, this.power, new Engine(this.engine.engineNumber));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", engine=" + engine +
                '}';
    }
}
