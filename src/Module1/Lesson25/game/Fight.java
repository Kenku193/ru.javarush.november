package Module1.Lesson25.game;

public class Fight {
    public static void main(String[] args) {

        Unit[] units = {
                new Ork(),
                new Magician(new Knight()),
                new Knight(),
                new Magician(new Elf(new Ork())) // урук-хаи

        };

        for (Unit unit : units) {
            unit.go();
        }

    }
}
