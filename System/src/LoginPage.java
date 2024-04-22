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




    public LoginPage(JFrame frame){

        super(frame);
        setTitle("Login");
        setContentPane(Login);
        setMinimumSize(new Dimension(1520,880));
        setModal(true);
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        LoginBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User x = resource.uh.getUser(EmailTextField.getText());
                //User x = null;
                if(x == null){
                    JOptionPane.showMessageDialog(LoginPage.this,"Email or Password Incorrect\nTry Again!!");
                }else{
                    if(passwordField1.getText().compareTo(x.getPassword())==0){
                        dispose();
                        resource.currentUser = x;
                        new Application(null,x);

                    }else{
                        JOptionPane.showMessageDialog(LoginPage.this,"Email or Password Incorrect\nTry Again!!");
                    }
                }
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
