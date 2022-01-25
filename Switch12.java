package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Twelveth implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("NEXT >");
    Twelveth(){

        JLabel l1 = new JLabel("Java Switch");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 25));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l5 = new JLabel("Java Switch statement");
        l5.setBounds(30,130,300,50);
        l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));


        JLabel l2 = new JLabel("Use the switch statement to select one of many code blocks to be executed.");
        l2.setBounds(30,150,1100,60);
        l2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l3 = new JLabel("SYNTAX");
        l3.setBounds(30,190,300,50);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,240,640,150);
        j2.setText("switch(expression) {\n" +
                "  case x:\n" +
                "    // code block\n" +
                "    break;\n" +
                "  case y:\n" +
                "    // code block\n" +
                "    break;\n" +
                "  default:\n" +
                "    // code block\n" +
                "}");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l6 = new JLabel();
        l6.setText("Break Keyword");
        l6.setBounds(30,380,300,50);
        l6.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));


        JLabel l7 = new JLabel("When Java reaches a break keyword, it breaks out of the switch block.\n" +
                "\n" +
                "This will stop the execution of more code and case testing inside the block.");
        l7.setBounds(30,385,1100,100);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l8 = new JLabel();
        l8.setText("Default Keyword");
        l8.setBounds(30,435,300,50);
        l8.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JLabel l9 = new JLabel("The default keyword specifies some code to run if there is no case match: ");
        l9.setBounds(30,445,1100,100);
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
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(l9);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            Eleventh e11 = new Eleventh();
        }
        if (e.getSource()==b2){
            Thirteenth t13 = new Thirteenth();
        }
    }
}
public class Switch12 {
    public static void main(String[] args) {

        Twelveth t12  = new Twelveth();

    }
}