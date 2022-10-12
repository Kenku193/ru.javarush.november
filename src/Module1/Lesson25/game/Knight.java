package Module1.Lesson25.game;

public class Knight implements Unit{
    @Override
    public void go() {
        System.out.println("Knight goes!");
    }
}


class Ork implements Unit{
    @Override
    public void go() {
        System.out.println("Ork goes!");
    }
}
