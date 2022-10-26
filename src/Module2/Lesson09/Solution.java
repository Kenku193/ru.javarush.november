package Module2.Lesson09;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Solution {
    public static void main(String[] args) throws CloneNotSupportedException {

        Car car1 = new Car("VW", 150, new Engine(345));
        Car car2 = new Car("VW", 150, new Engine(543));


        System.out.println(car1.toString());


        int i = car1.hashCode();
        System.out.println(Integer.toHexString(i));



        System.out.println("-".repeat(50));

        Integer a = new Integer(999);
        Integer b = new Integer(999);

        System.out.println(a.equals(b));
        System.out.println(a == b);

        System.out.println("-".repeat(50));

        System.out.println(car1.equals(car2));

        System.out.println("-".repeat(50));

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());



        Car car3 = (Car) car1.clone(); // 345


        System.out.println("-".repeat(50));


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car3.engine.engineNumber  = 500;

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        Class clazz = car1.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-".repeat(50));
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("-".repeat(50));
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }


    }
}
