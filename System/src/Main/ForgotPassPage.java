package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForgotPassPage extends JDialog {
    ImageIcon logo1 = new ImageIcon("Main/logo.png");
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

            }
        });
        SendCode.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        setVisible(true);
    }



}
