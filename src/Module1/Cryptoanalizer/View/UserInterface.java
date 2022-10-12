package Module1.Cryptoanalizer.View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {
    public static void main(String[] args) {

        // СОЗДАЛИ ФРЕЙМ
        JFrame frame = new JFrame();

        // ЗАДАЛИ СТАРТОВУЮ ПОЗИЦИЮ И РАЗМЕР
        frame.setBounds(500, 500, 400, 200);

        // СДЕЛАЛИ ЕГО ВИДИМЫМ
        frame.setVisible(true);

        // УКАЗАЛИ КАК РЕАГИРОВАТЬ НА ЗАКРЫТИЕ ФОРМЫ - ЗАВЕРШЕНИЕМ ПРИЛОЖЕНИЯ
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);

        JTextField login = new JTextField(10);
        JPasswordField password = new JPasswordField(10);
        JButton okButton = new JButton("OK");
        JLabel message = new JLabel();
        panel.add(message);
        panel.add(login);
        panel.add(password);
        panel.add(okButton);
        panel.revalidate();

        okButton.addActionListener(e -> {
                if (new String(password.getPassword()).equals("qwerty")){
                    message.setText("password correct");
                }
                else {
                    message.setText("password incorrect");
                }
        });



    }
}
