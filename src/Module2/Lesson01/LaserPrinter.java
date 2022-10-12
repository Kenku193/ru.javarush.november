package Module2.Lesson01;

// sOlid

public class LaserPrinter extends Printer{

    private int x;

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    @Override
    protected void print(String s) {
        super.print(s);
    }
}
