import javax.swing.*;

class SwingDemo {
    SwingDemo() {
        JFrame frmMain = new JFrame("Test App");

        frmMain.setSize(275, 100);

        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblFirst = new JLabel("Welcome to Swing", 50);

        frmMain.add(lblFirst);

        frmMain.setVisible(true);
    }
}