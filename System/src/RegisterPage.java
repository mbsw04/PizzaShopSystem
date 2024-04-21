import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class RegisterPage extends JDialog{
    private JPanel RegPage;
    private JTextField Phone;
    private JTextField State;
    private JTextField Zip;
    private JTextField City;
    private JTextField Apt;
    private JButton BackBTN;
    private JButton RegBTN;
    private JLabel Logo;
    private JLabel RegisteLabel;
    private JTextField firstName;
    private JTextField lastName;
    private JTextField Email;
    private JTextField Address;

    ImageIcon logo1 = new ImageIcon("Main/logo.png");

    public RegisterPage(JFrame frame){
        super(frame);
        setTitle("Login");
        setContentPane(RegPage);
        setMinimumSize(new Dimension(1520,880));
        setModal(true);
        setIconImage(logo1.getImage());// Doesn't work gotta get a 16px icon !!
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Phone.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Phone.getText().equals("Phone: (ex 1234567890)")) {
                    Phone.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (Phone.getText().isEmpty()) {
                    Phone.setText("Phone: (ex 1234567890)");
                }
            }
        });

        State.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (State.getText().equals("State: (ex GA)")) {
                    State.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (State.getText().isEmpty()) {
                    State.setText("State: (ex GA)");
                }
            }
        });

        Zip.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Zip.getText().equals("Zip: (ex 111111)")) {
                    Zip.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (Zip.getText().isEmpty()) {
                    Zip.setText("Zip: (ex 111111)");
                }
            }
        });

        City.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (City.getText().equals("City: (Ex Marietta)")) {
                    City.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (City.getText().isEmpty()) {
                    City.setText("City: (Ex Marietta)");
                }
            }
        });

        Apt.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Apt.getText().equals("Apt: (ex 111)")) {
                    Apt.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (Apt.getText().isEmpty()) {
                    Apt.setText("Apt: (ex 111)");
                }
            }
        });

        firstName.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (firstName.getText().equals("First Name")) {
                    firstName.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (firstName.getText().isEmpty()) {
                    firstName.setText("First Name");
                }
            }
        });

        lastName.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (lastName.getText().equals("Last Name")) {
                    lastName.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (lastName.getText().isEmpty()) {
                    lastName.setText("Last Name");
                }
            }
        });

        Email.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Email.getText().equals("Email: (ex 123@gmail.com)")) {
                    Email.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (Email.getText().isEmpty()) {
                    Email.setText("Email: (ex 123@gmail.com)");
                }
            }
        });

        Address.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (Address.getText().equals("Address: (ex 1234 Pizza Street)")) {
                    Address.setText("");
                }
            }
            public void focusLost(FocusEvent e) {
                if (Address.getText().isEmpty()) {
                    Address.setText("Address: (ex 1234 Pizza Street)");
                }
            }
        });

/*
        UserSwitch1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
*/
        BackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new EnterPage(null);
            }
        });

        RegBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new EnterPage(null);
            }
        });
        setVisible(true);

    }

    //public static void main(String[] args) {
    //RegisterPage test = new RegisterPage(null);
    //}

}
