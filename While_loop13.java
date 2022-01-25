package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Thirteenth implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton(" QUIZ >");
    Thirteenth(){


        JLabel l1 = new JLabel("Java While Loop");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("The while loop loops through a block of code as long as a specified condition is true:" );
        l2.setBounds(30,150,1100,60);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel("SYNTAX");
        l3.setBounds(30,190,300,50);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,240,640,90);
        j2.setText("while (condition) {\n" +
                "  // code block to be executed\n" +
                "}");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l5 = new JLabel("EXAMPLE");
        l5.setBounds(30,320,300,50);
        l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j3 = new JTextArea();
        j3.setBounds(30,360,300,120);
        j3.setText("int i = 0;\n" +
                "while (i < 5) {\n" +
                "  System.out.println(i);\n" +
                "  i++;\n" +
                "}");
        j3.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j3.setBackground(Color.BLACK);
        j3.setForeground(Color.WHITE);

        JLabel l6 = new JLabel("  Output:  0 1 2 3 4");
        l6.setBounds(30,480,300,50);
        l6.setFont(new Font(Font.MONOSPACED, Font.BOLD,20));

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
        frame.add(j3);
        frame.add(l6);


        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            Twelveth t12  = new Twelveth();
        }
        if (e.getSource()==b2){
            quizpage q1 = new quizpage();
        }
    }
}
public class While_loop13 {
    public static void main(String[] args) {

        Thirteenth t13 = new Thirteenth();

    }
}