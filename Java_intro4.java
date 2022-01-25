package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fourthPage implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");


    fourthPage(){
        JLabel l1 = new JLabel("JAVA Introduction");
        l1.setBounds(30,100,300,50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD,30));

        b1.addActionListener(this);
        b1.setBounds(30,30,210,50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("What is Java?");
        l2.setBounds(30,150,500,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JLabel l3 = new JLabel("Java is a popular programming language, created in 1995.");
        l3.setBounds(30,180,700,30);
        l3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l4 = new JLabel("It is owned by Oracle, and more than 3 billion devices run Java.");
        l4.setBounds(30,210,500,50);
        l4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l5 = new JLabel("It is used for:");
        l5.setBounds(30,240,200,30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l6 = new JLabel("- Mobile applications (specially Android apps)");
        l6.setBounds(30,270,500,30);
        l6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l7 = new JLabel("- Desktop applications");
        l7.setBounds(30,300,200,30);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l8 = new JLabel("- Web applications");
        l8.setBounds(30,330,200,30);
        l8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l10 = new JLabel("Why use JAVA?");
        l10.setBounds(30,360,500,30);
        l10.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));


        JLabel l9 = new JLabel("It is used for:");
        l9.setBounds(30,390,200,30);
        l9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l11 = new JLabel("- It is easy to learn and simple to use");
        l11.setBounds(30,420,500,30);
        l11.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l12 = new JLabel("- Java is an object oriented language which gives a clear structure to programs and allows code to be reuse");
        l12.setBounds(30,450,700,30);
        l12.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l13= new JLabel("- It has a huge community support (tens of millions of developers).");
        l13.setBounds(30,480,700,30);
        l13.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

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
        frame.add(l1);
        frame.add(b1);
        frame.add(b2);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);
        frame.add(l10);
        frame.add(l11);
        frame.add(l12);
        frame.add(l13);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            thirdpage t=new thirdpage();
        }if (e.getSource()==b2){
            fifthPage f5 = new fifthPage();
        }
    }
}public class Java_intro4 {

    public static void main(String[] args) {
fourthPage f4 = new fourthPage();
    }
    }