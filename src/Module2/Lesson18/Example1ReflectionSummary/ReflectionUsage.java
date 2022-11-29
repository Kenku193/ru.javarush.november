package Module2.Lesson18.Example1ReflectionSummary;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUsage {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> c = String.class;

        Method[] declaredMethods = c.getDeclaredMethods();

        for (Method declaredMethod : declaredMethods) {
            String name = declaredMethod.getName(); // МЕТОДЫ
            Class<?>[] types = declaredMethod.getParameterTypes(); // ПАРАМЕТРЫ
            String returnType = declaredMethod.getReturnType().getSimpleName(); // ТИПЫ ВОЗВР ЗНАЧЕНИЙ
            System.out.printf("%s %s(%s)\n", returnType, name, Arrays.toString(types)); // ВЫВОД

        }

        // ИНТЕРФЕЙСЫ

        for (Class<?> anInterface : c.getInterfaces()) {
            System.out.println(anInterface);
        }

        // СОЗДАТЬ ЭКЗЕМПЛЯР

        Constructor<?> constructor = c.getConstructor(String.class);
        Object o = constructor.newInstance("Hierifjweioe");
        System.out.println(o);

        Method method = c.getMethod("length");
        System.out.println(method.invoke(o));



    }
}
