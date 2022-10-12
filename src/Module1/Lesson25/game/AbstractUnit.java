package Module1.Lesson25.game;

public abstract class AbstractUnit implements Unit {

    private final Unit unit;

    public AbstractUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public void go() {

        unit.go();
        loudScream();
    }

    protected abstract void loudScream();
}
