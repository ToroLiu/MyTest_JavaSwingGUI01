package main.java;

import javax.swing.*;

/**
 * Created by aecho on 2016/3/23.
 */
public class MainForm extends JFrame {
    private JPanel panel1;
    private JTextField txtName;
    private JTextField txtBirthDay;
    private JTextField txtPlaceOfBirth;
    private JTable table1;
    private JTable table2;

    public MainForm() {
        super("Hello World");
        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
