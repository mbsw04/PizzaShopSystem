import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JDialog{
    private JPanel Login;
    private JButton BackBTN;
    private JButton LoginBTN;
    private JTextField EmailTextField;
    private JLabel EmailLabel;
    private JLabel PassLabel;
    private JPasswordField passwordField1;
    private JButton FPBTN;

    ImageIcon logo1 = new ImageIcon("Main/logo.png");

    public LoginPage(JFrame frame){

        super(frame);
        setTitle("Login");
        setContentPane(Login);
        setMinimumSize(new Dimension(1520,880));
        setModal(true);
        setIconImage(logo1.getImage());// Doesn't work gotta get a 16px icon !!
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        LoginBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new Application(null);
            }
        });

        BackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new EnterPage(null);

            }
        });


        FPBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new ForgotPassPage(null);
            }
        });

        setVisible(true);
    }



}
