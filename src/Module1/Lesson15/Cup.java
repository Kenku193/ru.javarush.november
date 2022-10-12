package Module1.Lesson15;

public class Cup {

    Spoon spoon;

    public Cup(Spoon spoon) {
        this.spoon = spoon;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Чашка исчезнет навсегда");
    }


    public static void main(String[] args) {

        Cup cup = new Cup(new Spoon());

        cup = null;

       System.gc();


    }

}
