package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Tenth implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");

    Tenth(){


        JLabel l1 = new JLabel("JAVA STRINGS");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("Strings are used for storing text.\n" +
                "\n" +
                "A String variable contains a collection of characters surrounded by double quotes:\n" +
                "\n");
        l2.setBounds(30,130,1100,60);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel("EXAMPLE");
        l3.setBounds(30,170,300,50);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,210,640,70);
        j2.setText("String greeting = \"Hello\";");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l4 = new JLabel("String Length");
        l4.setBounds(30, 280, 700, 50);
        l4.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        JLabel l5 = new JLabel("A String in Java is actually an object, which contain methods that can perform certain operations on strings. ");
        l5.setBounds(30,290,1100,100);
        l5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));


        JLabel l6= new JLabel("For example, the length of a string can be found with the length() method:\n");
        l6.setBounds(30,320,1100,100);
        l6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l7 = new JLabel("EXAMPLE");
        l7.setBounds(30,380,300,50);
        l7.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j3 = new JTextArea();
        j3.setBounds(30,420,660,100);
        j3.setText("String txt = \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\";\n" +
                "System.out.println(\"The length of the txt string is: \" + txt.length());\n" +
                "\n");
        j3.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j3.setBackground(Color.BLACK);
        j3.setForeground(Color.WHITE);

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
        frame.add(j3);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            NinthPage n9 = new NinthPage();
        }if (e.getSource()==b2){
            Eleventh e11 = new Eleventh();
        }
    }
}
public class Java_Strings10 {
    public static void main(String[] args) {
        Tenth t10 = new Tenth();
    }
}