package Module1.Lesson15;

public class Spoon {

    Integer a;
    String b;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Ложка исчезнет навсегда");
    }
}
