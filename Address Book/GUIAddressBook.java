import javax.swing.SwingUtilities;

public class GUIAddressBook {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AddressBook();
            }
        });
    }
}