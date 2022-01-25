package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NinthPage implements ActionListener {

    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");
    NinthPage(){


        JLabel l1 = new JLabel("JAVA OPERATORS");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("Operators are used to perform operations on variables and values.\n" +
                "\n" +
                "In the example below, we use the + operator to add together two values:");
        l2.setBounds(30,140,900,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));

        JLabel l3 = new JLabel("EXAMPLE");
        l3.setBounds(30,180,300,50);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,220,300,50);
        j2.setText("int x = 100 + 50;");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,20));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l4 = new JLabel("Try Yourself");
        l4.setBounds(30,270,300,30);
        l4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));

        JLabel l5 = new JLabel("Java divides the operators into the following groups:\n");
        l5.setBounds(30,300,500,30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));

        JLabel l6 = new JLabel(". Arithmetic operators(+,-,*,/,%)\n  " +
                ". Assignment operators(=)");
        l6.setBounds(30,330,500,30);
        l6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));
        JLabel l7 = new JLabel(". Comparison operators(==,!=)\n  " +
                " . Logical operators(&&,||)");
        l7.setBounds(30,360,500,30);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));
        JLabel l8 = new JLabel(". Bitwise operators");
        l8.setBounds(30,390,500,30);
        l8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,20));

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
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            EighthPage e8 = new EighthPage();
        }if (e.getSource()==b2){
            Tenth t10 = new Tenth();
        }
    }
}
public class Java_Operators9 {
    public static void main(String[] args) {

        NinthPage n9 = new NinthPage();

    }
}