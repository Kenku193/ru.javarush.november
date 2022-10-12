package Module1.Lesson23;


public class Example1 extends Example2{
    public static void main(String[] args) {

        Integer x = new Integer(10);



        System.out.println(x instanceof Number);

        Example1 example1 = new Example1();
        example1.print();

        System.out.println(example1 instanceof Example2);
    }

    @Override
    public void print() {
        System.out.println("Привет в обед");
    }
}
