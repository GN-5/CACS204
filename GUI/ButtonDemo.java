import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo {
    ButtonDemo() {
        JFrame frmMain = new JFrame("Test App");

        frmMain.setAlwaysOnTop(true);

        frmMain.setLayout(new FlowLayout());

        frmMain.setSize(220, 90);

        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblMain = new JLabel("Press a button");

        JButton btnButton1 = new JButton("Alpha");
        JButton btnButton2 = new JButton("Beta");

        btnButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMain.setText("Alpha was pressed");
            }
        });

        btnButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lblMain.setText("Beta was pressed");
            }
        });

        frmMain.add(btnButton1);
        frmMain.add(btnButton2);
        frmMain.add(lblMain);

        frmMain.setVisible(true);
    }
}
