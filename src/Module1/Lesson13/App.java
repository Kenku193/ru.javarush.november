package Module1.Lesson13;

import java.util.Objects;

public class App {

    public static void main(String[] args) {

      User user1 = new User(1,"das", "das");
      User user2 = new User(999,"das", "da");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());






        System.out.println("// // // // //");
        System.out.println();
        System.out.println(user1);

        System.out.println(user1.getPassword());

        String temp = "1234567890";


        user1.setPassword("1234567890");

        System.out.println(user1.getPassword());


        if (user1.getPassword().equals(temp)){
            System.err.println("Пароли совпадают");
        }
        else {
            user1.setPassword(temp);
        }




    }

}


class User {

   private long id;
   private String login;
   private String password;

   protected String type;



    public User() {
       id = 20;
       login = "a";
       password = "b";
       type = "guest";

    }

    public User(long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
        type = "guest";
    }


    // ГЕТТЕР
    public String getPassword() {
        return password;
    }

    // СЕТТЕР
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(type, user.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, type);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

