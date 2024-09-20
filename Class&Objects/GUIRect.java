import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIRect {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        JFrame frmMain = new JFrame("Area Calculator");

        frmMain.setAlwaysOnTop(true);

        frmMain.setLayout(new FlowLayout());

        frmMain.setSize(200, 150);

        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblArea = new JLabel();
        JTextField txtLen = new JTextField(5);
        JLabel lblLen = new JLabel("Enter Length");

        JTextField txtBrd = new JTextField(5);
        JLabel lblBrd = new JLabel("Enter Breadth");

        JButton btnSubmit = new JButton("Submit");
        JButton btnClear = new JButton("Clear");

        try {
            btnSubmit.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String length = txtLen.getText();
                    String breadth = txtBrd.getText();

                    if (length.isEmpty() || breadth.isEmpty()) {
                        lblArea.setText("Enter Valid Text");
                    } else {
                        int len = Integer.parseInt(length);
                        int brd = Integer.parseInt(breadth);

                        r1.setLength(len);
                        r1.setBreadth(brd);
                        //String area = Long.toString(r1.calcArea());
                        lblArea.setText("The area is : " + Long.toString(r1.calcArea()));
                    }
                }
            });
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(btnClear, "Exception has occured");
        }

        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtLen.setText("");
                txtBrd.setText("");
                lblArea.setText("");
            }
        });
        frmMain.add(txtLen);
        frmMain.add(lblLen);
        frmMain.add(txtBrd);
        frmMain.add(lblBrd);

        frmMain.add(btnSubmit);
        frmMain.add(btnClear);
        frmMain.add(lblArea);

        frmMain.setVisible(true);
    }

}