package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class fifthPage implements ActionListener {
    JButton b2 = new JButton("NEXT >");
    JButton b1 = new JButton("< PREVIOUS");

    fifthPage(){



        JLabel l1 = new JLabel("JAVA GETTING STARTED");
        l1.setBounds(30, 100, 700, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 200, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);


        JLabel l2 = new JLabel(" JAVA INSTALL");
        l2.setBounds(30,150,500,30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.BOLD,20));

        JLabel l3 = new JLabel("Some PCs  might have JAVA already installed.");
        l3.setBounds(30,180,700,30);
        l3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l4 = new JLabel("To check if you have Java installed on a Windows PC, search in the start bar for Java or type the following in .");
        l4.setBounds(30,210,800,30);
        l4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JLabel l5 = new JLabel("Command Prompt (cmd.exe):");
        l5.setBounds(30,240,300,30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JTextArea j1 = new JTextArea();
        j1.setBounds(30,270,300,30);
        j1.setText("C:\\Users\\Your Name>java -version");
        j1.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j1.setBackground(Color.BLACK);
        j1.setForeground(Color.WHITE);

        JLabel l6 = new JLabel("If Java is installed, you will see something like this (depending on version):\n" +
                "\n");
        l6.setBounds(30,300,500,30);
        l6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

        JTextArea j2 = new JTextArea();
        j2.setBounds(30,330,700,110);
        j2.setText("java version \"11.0.1\" 2018-10-16 LTS\n" +
                "Java(TM) SE Runtime Environment 18.9 (build 11.0.1+13-LTS)\n" +
                "Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.1+13-LTS, mixed mode)");
        j2.setFont(new Font(Font.MONOSPACED, Font.PLAIN,15));
        j2.setBackground(Color.BLACK);
        j2.setForeground(Color.WHITE);

        JLabel l7 = new JLabel("If you do not have Java installed on your computer, you can download it for free at oracle.com.");
        l7.setBounds(30,450,650,30);
        l7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN,15));

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
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(j1);
        frame.add(j2);
        frame.add(l7);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            fourthPage f4 = new fourthPage();
        }if (e.getSource()==b2){
            sixthPage s6 = new sixthPage();
        }
    }
}
public class GETSTARTED5 {
    public static void main(String[] args) {
            fifthPage f5 = new fifthPage();
    }
    }