package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField text;
    JButton Next, Exit;

    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Login.png"));
        Image i = i1.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(1000,0,1220,1080);
        add(image);

        JLabel heading = new JLabel("QUIZ TIME");
        heading.setBounds(140,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(22,99,70));
        add(heading);

        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(160,150,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(new Color(80,150,54));
        add(name);

        text = new JTextField();
        text.setBounds(80,200,300,25);
        text.setFont(new Font("Times New Roman", Font.BOLD,18));
        name.setForeground(new Color(80,150,54));
        add(text);

        Next = new JButton("Next");
        Next.setBounds(100,270,120,25);
        Next.setBackground(new Color(22,99,54));
        Next.setForeground(Color.WHITE);
        Next.addActionListener(this);
        add(Next);

        Exit = new JButton("EXit");
        Exit.setBounds(250,270,120,25);
        Exit.setBackground(new Color(22,99,54));
        Exit.setForeground(Color.WHITE);
        Exit.addActionListener(this);
        add(Exit);

        setSize(1920,1080);
//        setLocation(200,220);
//        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Next){
            String name = text.getText();
            setVisible(false);
            new Rules(name);
        } else if (e.getSource() == Exit) {
            System.exit(50);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}