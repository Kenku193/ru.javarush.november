package Module2.Lesson06.Example3;

/**
 * Простейший функциональный интерфейс
 * <p>
 * В нем один нереализованный метод create, принимающий два строковых аргумента
 *
 */
public interface UserFactory {

    User create(String name, String surname);

}
