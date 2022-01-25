package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import static java.awt.Color.black;
class Secondpage implements ActionListener {
        JButton b1 = new JButton("Start Here");
Secondpage(){
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\java.png");
        label.setIcon(image);
        label.setIconTextGap(-460);
        label.setForeground(black);
        label.setFont(new Font(Font.MONOSPACED, Font.BOLD,20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0,0,790,600);

        JLabel jText = new JLabel();
        jText.setText("So Here is the");
        jText.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));
        jText.setBounds(800,130,300,30);

        JLabel jText2 = new JLabel();
        jText2.setText("Course of Java.");
        jText2.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));
        jText2.setBounds(800,170,300,30);

        JLabel jText3 = new JLabel();
        jText3.setText("The Object");
        jText3.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));
        jText3.setBounds(800,200,300,30);

        JLabel jText4 = new JLabel();
        jText4.setText("Oriented");
        jText4.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));
        jText4.setBounds(800,240,300,30);

        JLabel jText5 = new JLabel();
        jText5.setText("Programming");
        jText5.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));
        jText5.setBounds(800,280,300,30);

        JLabel jText6 = new JLabel();
        jText6.setText("Language.");
        jText6.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));
        jText6.setBounds(800,320,300,30);

        b1.addActionListener(this);
        b1.setBounds(810,410,240,40);
        b1.setForeground(Color.BLACK);
        b1.setFont(new Font(Font.MONOSPACED, Font.BOLD,30));

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1100,600);
        frame.setTitle("AJSchool");
        frame.setLocation(30,30);
        frame.setLayout(null);
        frame.add(label);
        frame.add(b1);
        frame.add(jText);
        frame.add(jText2);
        frame.add(jText3);
        frame.add(jText4);
        frame.add(jText5);
        frame.add(jText6);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());
    }

        @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
                thirdpage t=new thirdpage();
        }

        }
}public class Second_Page2{
    public static void main(String[] args) {
        Secondpage s=new Secondpage();
    }
    }