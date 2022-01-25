package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class thirdpage implements ActionListener {
    JButton b1 = new JButton("< HOME");
    JButton b2 = new JButton("NEXT >");
    JButton b3 = new JButton("Home");
    JButton b4 = new JButton("Intro");
    JButton b5 = new JButton("Get Started");
    JButton b6 = new JButton("Syntax");
    JButton b7 = new JButton("QUIZ");
    JButton b8 = new JButton("Variables");
    JButton b9 = new JButton("Data Types");
    JButton b0 = new JButton("Operators");
    JButton b10 = new JButton("Strings");
    JButton b11 = new JButton("IF-Else");
    JButton b12 = new JButton("Switch");
    JButton b13 = new JButton("While Loop");


    thirdpage(){

        JLabel l1 = new JLabel("JAVA Tutorial");
        l1.setBounds(30,100,200,50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD,30));

        b1.addActionListener(this);
        b1.setBounds(30,30,150,50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("-Java is a popular programming language.");
        l2.setBounds(30,180,500,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        JLabel l3 = new JLabel("-Java is used to develop mobile apps, web apps, desktop apps, games and much more.");
        l3.setBounds(30,210,700,30);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        JLabel l4 = new JLabel("Examples in Each Chapter");
        l4.setBounds(30,240,500,50);
        l4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,25));

        JLabel l5 = new JLabel("-You can edit Java code and view the result in Any JAVA Compiler.");
        l5.setBounds(30,280,700,30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));


        JTextArea j1 = new JTextArea();
        j1.setBounds(30,330,500,110);
        j1.setText("public class Main {\n" +
                "  public static void main(String[] args) {\n" +
                "    System.out.println(\"Hello World\");\n" +
                "  }\n" +
                "}");
        j1.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j1.setBackground(Color.BLACK);
        j1.setForeground(Color.WHITE);

        b2.addActionListener(this);
        b2.setBounds(900,490,130,50);
        b2.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.LIGHT_GRAY);

        b3.addActionListener(this);
        b3.setBounds(925,10,155,30);
        b3.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.LIGHT_GRAY);

        b4.addActionListener(this);
        b4.setBounds(925,50,155,30);
        b4.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.LIGHT_GRAY);

        b5.addActionListener(this);
        b5.setBounds(925,90,155,30);
        b5.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b5.setForeground(Color.BLACK);
        b5.setBackground(Color.LIGHT_GRAY);

        b6.addActionListener(this);
        b6.setBounds(925,130,155,30);
        b6.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b6.setForeground(Color.BLACK);
        b6.setBackground(Color.LIGHT_GRAY);


        b7.addActionListener(this);
        b7.setBounds(925,450,155,30);
        b7.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b7.setForeground(Color.BLACK);
        b7.setBackground(Color.LIGHT_GRAY);

        b8.addActionListener(this);
        b8.setBounds(925,170,155,30);
        b8.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b8.setForeground(Color.BLACK);
        b8.setBackground(Color.LIGHT_GRAY);

        b9.addActionListener(this);
        b9.setBounds(925,210,155,30);
        b9.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b9.setForeground(Color.BLACK);
        b9.setBackground(Color.LIGHT_GRAY);

        b0.addActionListener(this);
        b0.setBounds(925,250,155,30);
        b0.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b0.setForeground(Color.BLACK);
        b0.setBackground(Color.LIGHT_GRAY);

        b10.addActionListener(this);
        b10.setBounds(925,290,155,30);
        b10.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b10.setForeground(Color.BLACK);
        b10.setBackground(Color.LIGHT_GRAY);

        b11.addActionListener(this);
        b11.setBounds(925,330,155,30);
        b11.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b11.setForeground(Color.BLACK);
        b11.setBackground(Color.LIGHT_GRAY);

        b12.addActionListener(this);
        b12.setBounds(925,370,155,30);
        b12.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b12.setForeground(Color.BLACK);
        b12.setBackground(Color.LIGHT_GRAY);

        b13.addActionListener(this);
        b13.setBounds(925,410,155,30);
        b13.setFont(new Font(Font.SERIF, Font.BOLD,25));
        b13.setForeground(Color.BLACK);
        b13.setBackground(Color.LIGHT_GRAY);


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1100,600);
        frame.setTitle("AJSchool");
        frame.setLocation(30,30);
        frame.setLayout(null);

        frame.add(l1);
        frame.add(b1);
        frame.add(b2);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(j1);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(b10);
        frame.add(b11);
        frame.add(b12);
        frame.add(b13);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b2){
            fourthPage f4 = new fourthPage();
        }
        if (e.getSource()==b3){
            thirdpage t=new thirdpage();
        }if (e.getSource()==b4){
            fourthPage f4 = new fourthPage();
        }if (e.getSource()==b5){
            fifthPage f5 = new fifthPage();
        }if (e.getSource()==b6){
           sixthPage s6 = new sixthPage();
        }if (e.getSource()==b1){
            Secondpage s=new Secondpage();
        }if (e.getSource()==b7){
            quizpage q1 = new quizpage();
        }if (e.getSource()==b8){
            seventhPage s7 = new seventhPage();
        }if (e.getSource()==b9){
            EighthPage e8 = new EighthPage();
        }if (e.getSource()==b0){
            NinthPage n9 = new NinthPage();
        }if (e.getSource()==b10){
            Tenth t10 = new Tenth();
        }if (e.getSource()==b11){
            Eleventh e11 = new Eleventh();
        }if (e.getSource()==b12){
            Twelveth t12  = new Twelveth();
        }if (e.getSource()==b13){
            Thirteenth t13 = new Thirteenth();
        }

    }
}
public class third_Page3 {
    public static void main(String[] args) {
        thirdpage t=new thirdpage();
    }
    }
