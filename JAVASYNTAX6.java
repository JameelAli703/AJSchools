package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class sixthPage implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");
    sixthPage(){

        JLabel l1 = new JLabel("JAVA SYNTAX");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("In the previous chapter, we created a Java file called Main.java, and we used the following code  ");
        l2.setBounds(30,150,700,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel(" to print \"Hello World\" to the screen:");
        l3.setBounds(30,180,500,30);
        l3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l4 = new JLabel("Main.java");
        l4.setBounds(30, 220, 300, 50);
        l4.setFont(new Font(Font.SERIF, Font.BOLD, 20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,270,640,150);
        j2.setText("public class Main {\n" +
                "  public static void main(String[] args) {\n" +
                "    System.out.println(\"Hello World\");\n" +
                "  }\n" +
                "}\n" +
                "\n");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);


        JLabel l6 = new JLabel("OUTPUT ");
        l6.setBounds(30, 420, 400, 50);
        l6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

        JLabel l7 = new JLabel("Hello World");
        l7.setBounds(30, 450, 400, 50);
        l7.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));


        JLabel l5 = new JLabel("Try yourself in any online Compiler or in Intellij ");
        l5.setBounds(30, 480, 400, 50);
        l5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 15));

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


        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());
                }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            fifthPage f5 = new fifthPage();
        }if (e.getSource()==b2){
            seventhPage s7 = new seventhPage();
        }
    }
}
public class JAVASYNTAX6{
    public static void main(String[] args) {
        sixthPage s6 = new sixthPage();
    }

}
