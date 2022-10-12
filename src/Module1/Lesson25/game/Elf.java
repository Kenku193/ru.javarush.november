package Module1.Lesson25.game;

public class Elf  extends AbstractUnit {
    public Elf(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("Where are my pendants");
    }
}
