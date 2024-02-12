import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JDialog{
    private JLabel logo;
    private JTextField UserTextField;
    private JPasswordField passwordField;
    private JButton NewCustomerButton;
    private JButton UserSwitch1Button;
    private JButton LoginButton;
    private JLabel UserLabel;
    private JLabel PassLabel;
    private JPanel Login;

    ImageIcon logo1 = new ImageIcon("logo.png");

    public LoginForm(JFrame frame){
        super(frame);
        setTitle("Login");
        setContentPane(Login);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setIconImage(logo1.getImage());// Doesn't work gotta get a 16px icon !!
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        UserSwitch1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        NewCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        LoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        LoginForm test = new LoginForm(null);
    }
}
