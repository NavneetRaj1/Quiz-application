package quizapplication;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
public class Rules extends JFrame{
    Rules(){//constructor

        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("Simpile Minds");//fro showing somethinmg on heading
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("vivaldi",Font.BOLD,49));
        heading.setForeground(new Color(10,150,140));
        add(heading);

        setSize(800,650);
        setLocation(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {//it is fiunction method
        new Rules ();//object
    }
}
