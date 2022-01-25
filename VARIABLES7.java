package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class seventhPage implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");
    seventhPage(){

        JLabel l1 = new JLabel("JAVA VARIABLES");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("Variables are containers for storing data values.  ");
        l2.setBounds(30,150,500,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel("In Java, there are different types of variables, for example:");
        l3.setBounds(30,180,700,30);
        l3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l4 = new JLabel("String - stores text, such as \"Hello\". String values are surrounded by double quotes\n");
        l4.setBounds(30, 210, 700, 30);
        l4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

        JLabel l5 = new JLabel("int - stores integers (whole numbers), without decimals, such as 123 or -123\n");
        l5.setBounds(30, 240, 700, 30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

        JLabel l6 = new JLabel("float - stores floating point numbers, with decimals, such as 19.99 or -19.99\n ");
        l6.setBounds(30, 270, 700, 30);
        l6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

        JLabel l7 = new JLabel("char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes");
        l7.setBounds(30, 300, 700, 30);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

        JLabel l8 = new JLabel("boolean - stores values with two states: true or false");
        l8.setBounds(30, 330, 700, 30);
        l8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

        JLabel l9 = new JLabel("Declaring (Creating) and Initializing Variables");
        l9.setBounds(30, 370, 700, 50);
        l9.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        JLabel l10 = new JLabel("To create a variable, you must specify the type and assign it a value:\n");
        l10.setBounds(30, 410, 700, 30);
        l10.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

        JLabel l11 = new JLabel("SYNTAX");
        l11.setBounds(30, 430, 300, 50);
        l11.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        JTextArea j2 = new JTextArea();
        j2.setBounds(30,470,640,50);
        j2.setText("type variableName = value;" +"\n"+
                "int a=10;");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);


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
        frame.add(l4);
        frame.add(j2);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(l10);
        frame.add(l11);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            sixthPage s6 = new sixthPage();
        }if (e.getSource()==b2){
            EighthPage e8 = new EighthPage();
        }
    }
}
public class VARIABLES7 {
    public static void main(String[] args) {
        seventhPage s7 = new seventhPage();

    }
}