import main.java.MainForm;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainForm frame = new MainForm();
            }
        });
    }
}
