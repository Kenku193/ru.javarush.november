package Module1.Lesson25.game;

public class Magician extends AbstractUnit {
    public Magician(Unit unit) {
        super(unit);
    }

    @Override
    protected void loudScream() {
        System.out.println("Run, you fools!");
    }
}
