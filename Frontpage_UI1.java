package AJSchoolsSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import static java.awt.Color.black;

class front implements ActionListener {
    JButton b1 = new JButton("Start Learning");

    public front() {
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.WHITE, 3);
        label.setText("AJSchools Online Learning PlateForm");

        ImageIcon image = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img_1.png");
        label.setIcon(image);
        label.setIconTextGap(-460);
        label.setForeground(black);
        label.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setBackground(Color.WHITE);
        label.setOpaque(true);
        //  label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 500, 600);

        JLabel jLabel2 = new JLabel();
        jLabel2.setText("Welcome to our Online Learning");
        jLabel2.setBounds(600, 0, 500, 500);
        jLabel2.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));

        JLabel jLabel3 = new JLabel();
        jLabel3.setText(" Plate Form");
        jLabel3.setBounds(700, 180, 500, 500);
        jLabel3.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));

        JLabel jLabel4 = new JLabel();
        jLabel4.setText("Here you will Learn Lot of");
        jLabel4.setBounds(600, 200, 500, 500);
        jLabel4.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));

        JLabel jLabel5 = new JLabel();
        jLabel5.setText("Amazing Courses");
        jLabel5.setBounds(700, 220, 500, 500);
        jLabel5.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));


        b1.setBounds(650, 490, 280, 40);
        b1.setForeground(Color.BLACK);
        b1.setBorder(border);
        b1.setFont(new Font(Font.MONOSPACED, Font.BOLD, 30));
        ImageIcon image3 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\imag3.jpg");
        jLabel2.setIcon(image3);
        jLabel2.setIconTextGap(-335);
        jLabel2.setHorizontalTextPosition(JLabel.CENTER);
        jLabel2.setVerticalTextPosition(JLabel.TOP);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(1100, 600);
        frame.setTitle("AJSchool");
        frame.setLocation(30, 30);
        frame.setLayout(null);

        frame.add(label);
        frame.add(b1);
        frame.add(jLabel2);
        frame.add(jLabel3);
        frame.add(jLabel4);
        frame.add(jLabel5);
        b1.addActionListener(this);
        // frame.pack();
        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");
        frame.setIconImage(image2.getImage());

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            Secondpage s=new Secondpage();
        }
    }
}
public class Frontpage_UI1 {
    public static void main(String[] args) {
     front f=new front();
    }
   }
