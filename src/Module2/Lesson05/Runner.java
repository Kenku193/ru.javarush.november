package Module2.Lesson05;

public class Runner {
    public static void main(String[] args) {

        ValueObjectBoolean valueObjectBoolean = new ValueObjectBoolean(true);
        ValueObjectInteger valueObjectInteger = new ValueObjectInteger(10);
        ValueObjectString valueObjectString = new ValueObjectString("text");


        valueObjectBoolean.printToConsole();
        valueObjectString.printToConsole();
        valueObjectInteger.printToConsole();

        ValueObject<Double> vod = new ValueObject<>(20.0);
        ValueObject<String> vos = new ValueObject<>("another text");
        ValueObject<Boolean> vob = new ValueObject<>(false);

        vod.printToConsole();
        vos.printToConsole();
        vob.printToConsole();



    }
}
