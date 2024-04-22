import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

public class EnterPage extends JDialog{
    private JPanel Enter;
    private JLabel Title;
    private JButton loginBTN;
    private JButton regBTN;
    private JButton ExitBTN;

    ImageIcon logo1 = new ImageIcon("logo.png");

    public EnterPage(JFrame frame){

        super(frame);
        setTitle("Mama's Pizzeria");
        setContentPane(Enter);
        setMinimumSize(new Dimension(1520,880));
        setModal(true);
        setIconImage(logo1.getImage());// Doesn't work gotta get a 16px icon !!
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        loginBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new LoginPage(null);


            }
        });

        regBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                new RegisterPage(null);
            }
        });

        ExitBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                System.exit(0);
            }
        });


        setVisible(true);

    }

}
