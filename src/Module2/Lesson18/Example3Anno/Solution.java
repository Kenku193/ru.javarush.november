package Module2.Lesson18.Example3Anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Solution {
    public static void main(String[] args) throws IllegalAccessException {

        // СОЗДАЕМ ОБЪЕКТ
        BankClient bankClient = new BankClient();

        // СТАВИМ ЗНАЧЕНИЕ ПОЛЯ
        bankClient.id = 10;

        // СОБИРАЕМ РЕФЛЕКСИЮ С ОБЪЕКТА
        Class<?> refl = bankClient.getClass();

        // СОБИРАЕМ ДАННЫЕ О ПОЛЯХ
        Field[] fields = refl.getDeclaredFields();

        // ПЕРЕБИРАЕМ ПОЛЯ

        for (Field field : fields) {
            System.out.println(field.getModifiers() + " "
                                                    + field.getType()
                                                    + " "
                                                    +  field.getName());
        }

        // ПОЛУЧАЕМ ЗНАЧЕНИЕ ПОЛЯ id

        Integer gettedId = (Integer) fields[0].get(bankClient);
        System.out.println(gettedId);

        // МЕНЯЕМ ЗНАЧЕНИЕ ПОЛЯ id

        fields[0].set(bankClient, 55);

        // ВЫВОДИМ ЗНАЧЕНИЕ ПОЛЯ ПОСЛЕ ИЗМЕНЕНИЙ

        System.out.println((Integer) fields[0].get(bankClient));

        // ДАЕМ ДОСТУП К ПРИВАТНОМУ ПОЛЮ

        fields[1].setAccessible(true);

        // ВЫВОДИМ

        System.out.println(fields[1].get(bankClient));

        // СОБИРАЕМ ДАННЫЕ ОБ АННОТАЦИЯХ

        Annotation[] declaredAnnotations = fields[0].getDeclaredAnnotations();

        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);
        }

        // СМОТРИМ ЗНАЧЕНИЕ ПАРАМЕТРА

        for (Field f : bankClient.getClass().getDeclaredFields()) {
            TudaSuda ts = f.getAnnotation(TudaSuda.class);
            if (ts != null ){
                System.out.println(ts.clientType());
            }
        }


    }
}
