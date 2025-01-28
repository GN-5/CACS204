import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class AddressBook implements ActionListener {
    // frame details
    JFrame frmMain = new JFrame("Address Book");

    // all panels
    JPanel pnlNameAndAge = new JPanel(new FlowLayout());
    JPanel pnlAddressAndPhone = new JPanel(new FlowLayout());
    JPanel pnlGender = new JPanel(new FlowLayout());
    JPanel pnlDOB = new JPanel(new FlowLayout());
    JPanel pnlBtn = new JPanel(new FlowLayout());
    JPanel pnlTable = new JPanel(new FlowLayout());

    // all lables
    JLabel lblName = new JLabel("Name :");
    JLabel lblAge = new JLabel("Age :");
    JLabel lblPhone = new JLabel("Phone :");
    JLabel lblAddress = new JLabel("Address :");
    JLabel lblYear = new JLabel("Year :");
    JLabel lblMonth = new JLabel("Month :");
    JLabel lblDay = new JLabel("Day :");

    // text fields
    JTextField txtName = new JTextField(30);
    JTextField txtAge = new JTextField(10);
    JTextField txtPhone = new JTextField(10);
    JTextField txtAddress = new JTextField(30);

    // buttons
    JButton btnSubmit = new JButton("Submit");
    JButton btnClear = new JButton("Clear");

    // table
    DefaultTableModel model = new DefaultTableModel();
    JTable tblMain = new JTable();

    // radio buttons
    ButtonGroup bgGender = new ButtonGroup();
    JRadioButton radMale = new JRadioButton("Male");
    JRadioButton radFemale = new JRadioButton("Female");

    // dropdown using JComboBox and arrays
    JComboBox<String> years;
    JComboBox<String> months;
    JComboBox<String> days;

    Address address;

    AddressBook() {

        frmMain.setAlwaysOnTop(true);
        frmMain.setLayout(new FlowLayout());
        frmMain.setSize(700, 500);
        frmMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMain.setLocationRelativeTo(null);
        frmMain.setResizable(false);
        // arrays for dropdown
        String[] yearsArray = new String[2024 - 1970];
        String[] daysArray = new String[33];
        String[] monthsArray = new String[13];

        int j = 1970;
        for (int i = 1; i <= (2023 - 1970); i++) {
            yearsArray[i] = String.valueOf(j);
            j++;
        }

        for (int i = 1; i <= 32; i++) {
            daysArray[i] = String.valueOf(i);
        }
        for (int i = 1; i <= 12; i++) {
            monthsArray[i] = String.valueOf(i);
        }

        // dropdown using JComboBox and arrays
        years = new JComboBox<>(yearsArray);
        months = new JComboBox<>(monthsArray);
        days = new JComboBox<>(daysArray);

        // ArrayList<Address> addressList = new ArrayList<>();

        // Address[] addressArray = addressList.toArray(new Address[0]);

        // Address[][] multiAddress = new Address[5][];
        // multiAddress[0] = addressArray;

        String[] column = { "Name", "Age", "Phone", "Address", "Gender", "DOB" };

        for (String col : column)
            model.addColumn(col);
        tblMain.setModel(model);

        JScrollPane scrlPane = new JScrollPane(tblMain);
        scrlPane.setPreferredSize(new Dimension(625, 200));
        pnlTable.add(scrlPane);

        // creating the table for display
        // Object[][] data = new Object[multiAddress.length][];
        // for (int i = 0; i < multiAddress.length; i++) {
        // data[i] = multiAddress[i];
        // }
        // JTable tblDisplay = new JTable(data, column);

        // adding action listeners to reference later on
        btnSubmit.addActionListener(this);
        btnClear.addActionListener(this);

        // adding labels and text to panels
        pnlNameAndAge.add(lblName);
        pnlNameAndAge.add(txtName);
        pnlNameAndAge.add(lblAge);
        pnlNameAndAge.add(txtAge);

        pnlAddressAndPhone.add(lblAddress);
        pnlAddressAndPhone.add(txtAddress);
        pnlAddressAndPhone.add(lblPhone);
        pnlAddressAndPhone.add(txtPhone);

        pnlDOB.add(lblYear);
        pnlDOB.add(years);
        pnlDOB.add(lblMonth);
        pnlDOB.add(months);
        pnlDOB.add(lblDay);
        pnlDOB.add(days);

        // adding radio buttons to group
        bgGender.add(radMale);
        bgGender.add(radFemale);

        pnlGender.add(radMale);
        pnlGender.add(radFemale);

        pnlBtn.add(btnSubmit);
        pnlBtn.add(btnClear);

        // adding panels to frame
        frmMain.add(pnlNameAndAge);
        frmMain.add(pnlAddressAndPhone);
        frmMain.add(pnlGender);
        frmMain.add(pnlDOB);
        frmMain.add(pnlBtn);
        frmMain.add(pnlTable);

        frmMain.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSubmit) {
            setAddress();
            addRecord();
            clearAll();
        }
        if (e.getSource() == btnClear) {
            clearAll();
        }
    }

    private void setAddress() {

        address = new Address();

        try {

            address.setName(txtName.getText());
            address.setAddress(txtAddress.getText());
            address.setAge(txtAge.getText());
            address.setPhone(txtPhone.getText());

            if (radMale.isSelected()) {
                address.setGender("Male");
            } else if (radFemale.isSelected()) {
                address.setGender("Female");
            } else {
                address.setGender(" ");
            }

            String dob = years.getSelectedItem() + "/" + months.getSelectedIndex() + "/" + days.getSelectedItem();

            address.setDate(dob);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(frmMain, ex.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addRecord() {

        model.addRow(new Object[] { address.getName(), address.getAge(), address.getAddress(),
                address.getPhone(), address.getGender(), address.getDate() });

        model.fireTableDataChanged();
    }

    private void clearAll() {
        txtName.setText("");
        txtAge.setText("");
        txtAddress.setText("");
        txtPhone.setText("");

        bgGender.clearSelection();

        years.setSelectedIndex(0);
        months.setSelectedIndex(0);
        days.setSelectedIndex(0);
    }

}