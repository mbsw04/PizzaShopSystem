import javax.swing.*;
import java.awt.*;

public class UIhandler extends JDialog{
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame();

        ImageIcon logo1 = new ImageIcon("logo.png");

        mainFrame.setMinimumSize(new Dimension(1520,880));
        mainFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        mainFrame.setIconImage(logo1.getImage());// Doesn't work gotta get a 16px icon !!

        EnterPage EP = new EnterPage(null);
        EP.setVisible(false);

        LoginPage LP = new LoginPage(null);
        LP.setVisible(false);

        RegisterPage RP = new RegisterPage(mainFrame);
        RP.setVisible(false);

        ForgotPassPage FPP = new ForgotPassPage(mainFrame);
        FPP.setVisible(false);

        EP.setVisible(true);

    }
}
