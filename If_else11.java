package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Eleventh implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");

    Eleventh(){


        JLabel l1 = new JLabel("JAVA IF and ELSE");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l5 = new JLabel("IF statement");
        l5.setBounds(30,130,300,50);
        l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JLabel l2 = new JLabel("Use the if statement to specify a block of Java code to be executed if a condition is true.");
        l2.setBounds(30,150,1100,60);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel("SYNTAX");
        l3.setBounds(30,190,300,50);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,240,640,70);
        j2.setText("if (condition) {\n" +
                "  // block of code to be executed if the condition is true\n" +
                "}");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l6 = new JLabel("ELSE statement");
        l6.setBounds(30,320,300,50);
        l6.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JLabel l7 = new JLabel("Use the else statement to specify a block of code to be executed if the condition is false.");
        l7.setBounds(30,360,1100,60);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l8 = new JLabel("SYNTAX");
        l8.setBounds(30,400,300,50);
        l8.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j4 = new JTextArea();
        j4.setBounds(30,440,640,100);
        j4.setText("if (condition) {\n" +
                "  // block of code to be executed if the condition is true\n" +
                "} else {\n" +
                "  // block of code to be executed if the condition is false\n" +
                "}");
        j4.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j4.setBackground(Color.BLACK);
        j4.setForeground(Color.WHITE);

        b2.addActionListener(this);
        b2.setBounds(900,490,130,50);
        b2.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.LIGHT_GRAY);
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1100,600);
        frame.setTitle("AJSchools");
        frame.setLocation(30,30);
        frame.setLayout(null);
        frame.add(b1);
        frame.add(l1);
        frame.add(b2);
        frame.add(l2);
        frame.add(l3);
        frame.add(j2);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(j4);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            Tenth t10 = new Tenth();
        }if (e.getSource()==b2){
            Twelveth t12  = new Twelveth();
        }
    }
}
public class If_else11 {
    public static void main(String[] args) {
        Eleventh e11 = new Eleventh();

    }
}