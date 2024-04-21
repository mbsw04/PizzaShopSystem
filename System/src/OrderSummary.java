import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderSummary extends JDialog{

    OrderSummary(JFrame frame) {
        super(frame);
        setTitle("Order Summary");
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(1650, 880);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBackground(Color.lightGray);
        leftPanel.setBounds(15, 80, 800, 700);
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(null);
        rightPanel.setBackground(Color.lightGray);
        rightPanel.setBounds(820, 80, 800, 700);

        add(leftPanel);
        add(rightPanel);

        JLabel t1 = new JLabel("Current Order Summary:");
        t1.setBounds(10,0,800,30);
        t1.setFont(new Font("MV Boli", Font.PLAIN, 25));
        leftPanel.add(t1);
        JTextPane orderSummary = new JTextPane();
        orderSummary.setBounds(10,50,800,700);
        orderSummary.setFont(new Font("MV Boli", Font.PLAIN, 20));
        orderSummary.setEditable(false);
        String orderStr = " ";
        orderSummary.setText(orderStr);
        JLabel t6 = new JLabel("Tax (8%)       -     $1.12");
        t6.setBounds(10,400,300,30);
        t6.setFont(new Font("MV Boli", Font.PLAIN, 20));
        leftPanel.add(t6);
        JLabel t7 = new JLabel("Order Total     -     $15.12 ");
        t7.setBounds(10,450,300,30);
        t7.setFont(new Font("MV Boli", Font.PLAIN, 20));
        leftPanel.add(t7);

        JLabel label = new JLabel("Using Card");
        label.setBackground(Color.cyan);
        label.setBounds(375,150,500,50);
        label.setFont(new Font("MV Boli", Font.PLAIN, 30));
        rightPanel.add(label);

        JButton b1 = new JButton("Edit Payment Information");
        b1.setBounds(320,210,250,50);
        rightPanel.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create and show the popup GUI
                ChangeCardInfo popup = new ChangeCardInfo(null);
            }
        });

        JButton b2 = new JButton("Confirm Order");
        b2.setBounds(300,310,290,50);
        rightPanel.add(b2);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ThankYou(null);
                dispose();
            }
        });


        setModal(true);
        setVisible(true);
    }
}
