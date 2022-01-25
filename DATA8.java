package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EighthPage implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");

    EighthPage(){
        JLabel l1 = new JLabel("JAVA DATA TYPES");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("As explained in the previous chapter, a variable in Java must be a specified data type:");
        l2.setBounds(30,150,700,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel("EXAMPLE");
        l3.setBounds(30,170,300,50);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,220,640,150);
        j2.setText("int myNum = 5;               // Integer (whole number)\n" +
                "float myFloatNum = 5.99f;    // Floating point number\n" +
                "char myLetter = 'D';         // Character\n" +
                "boolean myBool = true;       // Boolean\n" +
                "String myText = \"Hello\";     // String");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l4 = new JLabel("Try Yourself");
        l4.setBounds(30,363,300,30);
        l4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l5= new JLabel("Primitive Data Types");
        l5.setBounds(30,390,300,30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        JLabel l6 = new JLabel("- A primitive data type specifies the size and type of variable values, and it has no additional methods.\n" +
                "\n");
        l6.setBounds(30,420,700,30);
        l6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l7 = new JLabel("- includes byte, short, int, long, float, double, boolean and char\n");
        l7.setBounds(30,440,700,30);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l10= new JLabel(" Non-Primitive Data Types");
        l10.setBounds(30,470,300,30);
        l10.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        JLabel l8 = new JLabel("- Non-primitive data types are called reference types because they refer to objects");
        l8.setBounds(30,500,700,30);
        l8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l9 = new JLabel("- Non-primitive data types - such as String, Arrays and Classes");
        l9.setBounds(30,520,700,30);
        l9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

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
        frame.add(l9);
        frame.add(l10);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            seventhPage s7 = new seventhPage();
        }if (e.getSource()==b2){
            NinthPage n9 = new NinthPage();
        }
    }
}
public class DATA8 {
    public static void main(String[] args) {

        EighthPage e8 = new EighthPage();

    }
}

