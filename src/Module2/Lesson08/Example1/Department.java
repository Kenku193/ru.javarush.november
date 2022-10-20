package Module2.Lesson08.Example1;


public class Department {
    {
        System.out.println("logic (1) id= " + this.id);
        // Проверка и инициализация параметров конкретного объекта
        // СТАРТ: ДО КОНСТРУКТОРА КЛАССА
    }

    static {
        System.out.println("static logic");
        // Проверка и инициализация базовых параметров, необходимых
        // для функционирования приложения (всего класса)
        // СТАРТ: ПРИ ПЕРВОМ ОБРАЩЕНИИ К ЛЮБОМУ МЕТОДУ КЛАССА
    }

    private int id = 7;

    public Department(int id) {
        this.id = id;
        System.out.println("конструктор id= " + id);
    }

    public int getId() {
        return id;
    }

    {
        // так тоже можно, но весьма путает код при чтении
        System.out.println("logic (2) id= " + id);
    }
}

class runner {
    public static void main(String[] args) {
        new Department(18);
    }
}