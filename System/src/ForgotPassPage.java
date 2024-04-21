import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ForgotPassPage extends JDialog {
    ImageIcon logo1 = new ImageIcon("logo.png");
    private JPanel ForgotPass;
    private JButton BackBTN;
    private JButton ChangePassBTN;
    private JTextField NewPassText;
    private JLabel Logo;
    private JButton SendCode;
    private JLabel EmailLabel;
    private JLabel CodeLabel;
    private JLabel NewPass;
    private JTextField EmailText;
    private JTextField CodeText;

    public ForgotPassPage(JFrame frame){
        super(frame);
        setTitle("Login");
        setContentPane(ForgotPass);
        setMinimumSize(new Dimension(1520,880));
        setModal(true);
        setIconImage(logo1.getImage());// Doesn't work gotta get a 16px icon !!
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);



        BackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new LoginPage(null);
            }
        });
        ChangePassBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User x = resource.uh.getUser(EmailText.getText());
                if(x == null){
                    JOptionPane.showMessageDialog(ForgotPassPage.this,"User not found\nMake sure its correct");
                }else if(!Objects.equals(CodeText.getText(), "0000")){
                    JOptionPane.showMessageDialog(ForgotPassPage.this,x.getEmail()+"\nCode is Incorrect");
                }else if(NewPassText.getText() == null || NewPassText.getText() == " "){
                    JOptionPane.showMessageDialog(ForgotPassPage.this,"New Password empty");
                }else{
                    x.setPassword(NewPassText.getText());
                    JOptionPane.showMessageDialog(ForgotPassPage.this,x.getEmail()+"\nPassword Changed\nRedirecting to Login");
                    new LoginPage(null);
                    dispose();

                }

            }
        });
        SendCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User x = resource.uh.getUser(EmailText.getText());
                if(x == null){
                    JOptionPane.showMessageDialog(ForgotPassPage.this,"User not found\nMake sure its correct");
                }else{
                    JOptionPane.showMessageDialog(ForgotPassPage.this,x.getEmail()+"\nFor testing the code is 0000");
                }
            }
        });

        setVisible(true);
    }
}
