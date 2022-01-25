package AJSchoolsSystem;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Quiz2ndPage extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JLabel label;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnBookmark;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[100];
    Quiz2ndPage(String s) {
        super(s);
        label = new JLabel();
        add(label);

        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
       JLabel label2 = new JLabel("JAVA QUIZ");
        label2.setBounds(10,0,200,40);
        label2.setFont(new Font(Font.SERIF, Font.BOLD,20));
        add(label2);

        btnNext = new JButton("Next");
        btnBookmark = new JButton("Bookmark");
        btnNext.addActionListener(this);
        btnBookmark.addActionListener(this);
        add(btnNext);
        add(btnBookmark);
        set();
        label.setBounds(100, 40, 450, 20);
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        radioButton[0].setBounds(100, 80, 450, 20);
        radioButton[0].setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        radioButton[1].setBounds(100, 110, 200, 20);
        radioButton[1].setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        radioButton[2].setBounds(100, 140, 200, 20);
        radioButton[2].setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        radioButton[3].setBounds(100, 170, 200, 20);
        radioButton[3].setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        btnNext.setBounds(270, 240, 140, 30);
        btnNext.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));

        btnBookmark.setBounds(100, 240, 140, 30);
        btnBookmark.setFont(new Font(Font.SANS_SERIF, Font.BOLD,15));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\IdeaProjects\\AJScools\\src\\AJSchoolsSystem\\img.png");

        setLayout(null);
        setLocation(30, 30);
        setTitle("AJSchools");
        setVisible(true);
        setSize(1100, 600);
    }
    public void actionPerformed(ActionEvent e)
    { if (e.getSource() == btnNext) {
        if (check())
            count = count + 1; current++;
            set();
        if (current == 20) {
            btnNext.setEnabled(false);
            btnBookmark.setText("Result");
        }
    }
        if (e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + x);
            bk.setBounds(550, 20 + 30 * x, 100, 30);
            add(bk);
            bk.addActionListener(this);
            m[x] = current;
            x++;

            current++;
            set();

            if (current == 100) btnBookmark.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for (int i = 0, y = 1; i < x; i++, y++) {
            if (e.getActionCommand().equals("Bookmark" + y)) { if (check())
                count = count + 1; now = current;
                current = m[y];
                set();
                ((JButton) e.getSource()).setEnabled(false);
                current = now;
            }
        }
        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
                current++;
            JOptionPane.showMessageDialog(this, "correct answers= " + count);
            System.exit(0);
        }

    }
    void set() {
        radioButton[4].setSelected(true);
        if (current == 0) {
            label.setText("Que1: Every statement in Java language should end with a?");
            radioButton[0].setText("Dot or Period");
            radioButton[1].setText("Comma");
            radioButton[2].setText(" Colon");
            radioButton[3].setText("Semicolon");//correct
        }
        if (current == 1) {
            label.setText("Que2: A function in C language is similar to what in Java language?");
            radioButton[0].setText("Variable");
            radioButton[1].setText("Member");
            radioButton[2].setText("Method");//correct
            radioButton[3].setText("None of the above");
        }
        if (current == 2) {
            label.setText("Que3: All methods and variables in Java language are kept inside a?");
            radioButton[0].setText("File");
            radioButton[1].setText("static method");
            radioButton[2].setText("main");
            radioButton[3].setText("Class or Interface");//correct
        }
        if (current == 3) {
            label.setText("Que4: In standalone Java applications, which method is mandatory?");
            radioButton[0].setText(" display method");
            radioButton[1].setText("show method");
            radioButton[2].setText("main method");//correct
            radioButton[3].setText("print method");
        }
        if (current == 4) {
            label.setText("Que5: Choose a Single Line Comment in Java Language below?");
            radioButton[0].setText(" //Some comments");//correct
            radioButton[1].setText("Some comments//");
            radioButton[2].setText("/*Some comments*/");
            radioButton[3].setText("*/Some comments/*");
        }
        if (current == 5) {
            label.setText("Que6: Name of a Class, Variable, Method or an Interface in Java language is called?");
            radioButton[0].setText(" Argument");
            radioButton[1].setText("Identifier");//correct
            radioButton[2].setText(" Value");
            radioButton[3].setText("None of the above");
        }
        if (current == 6) {
            label.setText("Que7:  A valid identifier in Java language may contain which characters?");
            radioButton[1].setText(" 0-9");
            radioButton[2].setText("A-Z, a-z");
            radioButton[3].setText(" $, _ (Underscore)");
            radioButton[0].setText(" All the above");//correct
        }
        if (current == 7) {
            label.setText("Que8: What are the valid White Spaces available in Java language?");
            radioButton[0].setText("Space");
            radioButton[2].setText("Enter");
            radioButton[3].setText("Tab");
            radioButton[1].setText(" All the above");//correct
        }
        if (current == 8) {
            label.setText("Que9: Choose the wrong statement about Java programming?");
            radioButton[0].setText(" Java supports unsigned integers");//correct
            radioButton[1].setText(" Java supports signed integers");
            radioButton[2].setText("Java supports signed char");
            radioButton[3].setText("None of the above");
        }
        if (current == 9) {

            label.setText("Que10: Which data type among the following is an implementation of Objects or OOPs?");
            radioButton[1].setText(" int");
            radioButton[2].setText(" char");
            radioButton[3].setText("byte");
            radioButton[0].setText("None of the above");//correct
        } if (current == 10) {
            label.setText("Que11: which among the following is not a Data Type in Java?");

            radioButton[0].setText("long double");//
            radioButton[1].setText("short");
            radioButton[2].setText("int");
            radioButton[3].setText("double");
        }
        if (current == 11) { label.setText("Que12: Which among the following is not a valid Data Type in Java?");
            radioButton[0].setText("long");
            radioButton[1].setText("double");
            radioButton[2].setText("bool");//
            radioButton[3].setText("float");
        }
        if (current == 12) { label.setText("Que13: Which is the data type used mostly to handle streams and buffers in Java language?");
            radioButton[0].setText(" short");
            radioButton[1].setText("int");
            radioButton[2].setText("byte");//
            radioButton[3].setText("float");
        }
        if (current == 13) { label.setText("Que14: Which is the data type that is not recommended for numeric applications in Java?");
            radioButton[0].setText("float");
            radioButton[1].setText("int");
            radioButton[2].setText("byte");//
            radioButton[3].setText("long");
        }
        if (current == 14) { label.setText("Que15: Choose the number range for byte data type in Java?");
            radioButton[0].setText(" -127 to +128");
            radioButton[1].setText("0 to 256");
            radioButton[2].setText("-128 to +127");//
            radioButton[3].setText("0 to 255 ");
        }
        if (current == 15) { label.setText("Que16: What is the size of a SHORT integer in Java?");
            radioButton[0].setText("1 byte");
            radioButton[1].setText("2 bytes");//
            radioButton[2].setText("4 bytes");
            radioButton[3].setText("8 bytes");
        }
        if (current == 16) { label.setText("Que17:  What is the size of an INT integer in Java?");
            radioButton[0].setText(" 2 bytes");
            radioButton[1].setText("6 bytes");
            radioButton[2].setText("4 bytes");//
            radioButton[3].setText("8 bytes");
        }
        if (current == 17) { label.setText("Que18: An IF-ELSE statement is also called ___.");
            radioButton[0].setText(" Branching statement");
            radioButton[2].setText(" Control statement");
            radioButton[3].setText(" Block statements");
            radioButton[1].setText(" All");//
        }
        if (current == 18) { label.setText("Que19: What are the keywords used to implement a SWITCH case in Java language?");
            radioButton[0].setText("switch, case");
            radioButton[1].setText("default");
            radioButton[3].setText(" break");
            radioButton[2].setText("All");//
        }
        if (current == 19) { label.setText("Que20: A switch statement in Java accepts ___ as input data.");
            radioButton[0].setText("enum");
            radioButton[1].setText(" String");
            radioButton[2].setText("long");
            radioButton[3].setText("enum and String");//
        }
        label.setBounds(100, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) radioButton[j].setBounds(100, 80 + i, 200, 20);
    }
    boolean check() {
        if (current == 0)

            return (radioButton[3].isSelected());
        if (current == 1)
            return (radioButton[2].isSelected());
        if (current == 2)
            return (radioButton[3].isSelected());
        if (current == 3)
            return (radioButton[2].isSelected());
        if (current == 4)
            return (radioButton[0].isSelected());
        if (current == 5)
            return (radioButton[1].isSelected());
        if (current == 6)
            return (radioButton[0].isSelected());
        if (current == 7)
            return (radioButton[1].isSelected());
        if (current == 8)
            return (radioButton[0].isSelected());
        if (current == 9)
            return (radioButton[0].isSelected());
        if (current == 10)
            return (radioButton[0].isSelected());
        if (current == 11)
            return (radioButton[2].isSelected());
        if (current == 12)
            return (radioButton[2].isSelected());
        if (current == 13)
            return (radioButton[2].isSelected());
        if (current == 14)
            return (radioButton[2].isSelected());
        if (current == 15)
            return (radioButton[1].isSelected());
        if (current == 16)
            return (radioButton[2].isSelected());
        if (current == 17)
            return (radioButton[1].isSelected());
        if (current == 18)
            return (radioButton[2].isSelected());
        if (current == 19)
            return (radioButton[3].isSelected());
        if (current == 20)
            return (radioButton[2].isSelected());
        return false;
    }
    public static void main(String s[]) {
        new Quiz2ndPage("");
    }
}

