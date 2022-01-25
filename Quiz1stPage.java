package AJSchoolsSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class quizpage  implements ActionListener {
    JButton b1 = new JButton("< PREVIOUS");
    JButton b2 = new JButton("START QUIZ");
    quizpage() {
        JLabel l1 = new JLabel("JAVA QUIZ");
        l1.setBounds(30, 100, 200, 50);
        l1.setFont(new Font(Font.SERIF, Font.BOLD, 30));

        b1.addActionListener(this);
        b1.setBounds(30, 30, 170, 50);
        b1.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        b1.setForeground(Color.BLACK);
        b1.setBackground(Color.LIGHT_GRAY);

        JLabel l2 = new JLabel("So Here is the Quiz For You!");
        l2.setBounds(30, 180, 500, 30);
        l2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));

        JLabel l3 = new JLabel("Take a Test and Check Your Knowledge!");
        l3.setBounds(30, 220, 500, 30);
        l3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));

        JLabel l4 = new JLabel("-      There are Twenty MCQ's in the Quiz.");
        l4.setBounds(30, 260, 500, 30);
        l4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));

        JLabel l5 = new JLabel("-      Passing Marks 10.");
        l5.setBounds(30, 290, 500, 30);
        l5.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));

        JLabel l6 = new JLabel("-      Each Question Carries One (1) Mark.");
        l6.setBounds(30, 320, 500, 30);
        l6.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));

        JLabel l7 = new JLabel("-      There is no Negative Marking.");
        l7.setBounds(30, 350, 500, 30);
        l7.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));

        JLabel l8 = new JLabel("");
        l8.setBounds(585, 1, 500, 600);
        l8.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));


        ImageIcon image3 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\quiz.png");
        l8.setIcon(image3);
        l8.setIconTextGap(-335);
        l8.setHorizontalTextPosition(JLabel.CENTER);
        l8.setVerticalTextPosition(JLabel.TOP);

        b2.addActionListener(this);
        b2.setBounds(200, 430, 220, 50);
        b2.setFont(new Font(Font.SERIF, Font.BOLD, 25));
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.LIGHT_GRAY);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1100, 600);
        frame.setTitle("AJSchool");
        frame.setLocation(30, 30);
        frame.setLayout(null);

        frame.add(l1);
        frame.add(b1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(l6);
        frame.add(l7);
        frame.add(l8);
        frame.add(b2);

        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            Thirteenth t13 = new Thirteenth();
        }
        if (e.getSource()==b2){
            new Quiz2ndPage("");
        }
    }
}
public class Quiz1stPage {
    public static void main(String[] args) {
        quizpage q1 = new quizpage();
    }
}