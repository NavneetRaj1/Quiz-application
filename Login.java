package quizapplication;

import java.awt.Color;

import javax.swing.*;

public class Login extends JFrame {
    Login() {
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("quizapplication/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel();

        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}