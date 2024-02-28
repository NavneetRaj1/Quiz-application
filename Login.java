package quizapplication;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame  implements ActionListener{
    JButton Rules,Back;
    Login() {
        getContentPane().setBackground(Color.lightGray);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);

        JLabel heading = new JLabel("Simpile Minds");//fro showing somethinmg on heading
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("vivaldi",Font.BOLD,49));
        heading.setForeground(new Color(10,150,140));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");//fro showing somethinmg on heading
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Bait",Font.BOLD,18));
        name.setForeground(new Color(10,110,140));
        add(name);

        JTextField tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times  New Roman",Font.BOLD,15));
        add(tfname);
        
        Rules = new JButton("Rules");
        Rules.setBounds(735,270,120,25);
        Rules.setBackground(new Color(20,144,120));
        Rules.setForeground(Color.black);
        Rules.addActionListener(this);
        add(Rules);

        Back = new JButton("Back");
        Back.setBounds(912,270,120,25);
        Back.setBackground(new Color(20,144,120));
        Back.setForeground(Color.black);
        Back.addActionListener(this);
        add(Back);


        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);

        // JOptionPane.showInputDialog(heading, image);
    }

     @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if (ae.getSource() ==Rules){

        }
        else if (ae.getSource() == Back){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
