import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditPersonalInfo extends JDialog{

    public EditPersonalInfo(JFrame frame) {
        // Create a JFrame
        super(frame);
        setTitle("Edit Personal Info");
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(750, 750);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        panel.setBounds(150, 75, 425, 500);

        JTextField p1 = new JTextField();
        p1.setBackground(Color.white);
        p1.setBounds(50, 40, 320, 25);
        JTextField p2 = new JTextField();
        p2.setBackground(Color.white);
        p2.setBounds(50, 110, 150, 25);
        JTextField p3 = new JTextField();
        p3.setBackground(Color.white);
        p3.setBounds(220, 110, 150, 25);
        JTextField p4 = new JTextField();
        p4.setBackground(Color.white);
        p4.setBounds(50, 180, 320, 25);
        JTextField p5 = new JTextField();
        p5.setBackground(Color.white);
        p5.setBounds(50, 250, 320, 25);
        JTextField p6 = new JTextField();
        p6.setBackground(Color.white);
        p6.setBounds(50, 320, 320, 25);
        JTextField p7 = new JTextField();
        p7.setBackground(Color.white);
        p7.setBounds(50, 390, 320, 25);

        JLabel label1 = new JLabel("Address:");
        label1.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label1.setBounds(50, 50, 320, 50);
        JLabel label2 = new JLabel("City:");
        label2.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label2.setBounds(50, 120, 150, 50);
        JLabel label3 = new JLabel("Zip:");
        label3.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label3.setBounds(220, 120, 150, 50);
        JLabel label4 = new JLabel("Phone:");
        label4.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label4.setBounds(50, 190, 320, 50);
        JLabel label5 = new JLabel("Full Name:");
        label5.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label5.setBounds(50, 260, 320, 50);
        JLabel label6 = new JLabel("Email:");
        label6.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label6.setBounds(50, 330, 320, 50);
        JLabel label7 = new JLabel("Phone:");
        label7.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label7.setBounds(50, 400, 320, 50);

        JTextField t1 = new JTextField();
        //t1.setBounds(50, 50, 320, 50);
        JTextField t2 = new JTextField();
        //t2.setBounds(50, 120, 150, 50);
        JTextField t3 = new JTextField();
        //t3.setBounds(220, 120, 150, 50);
        JTextField t4 = new JTextField();
        //t4.setBounds(50, 190, 320, 50);
        JTextField t5 = new JTextField();
        //t5.setBounds(50, 260, 320, 50);
        JTextField t6 = new JTextField();
        //t6.setBounds(50, 330, 320, 50);
        JTextField t7 = new JTextField();
        //t7.setBounds(50, 400, 320, 50);

        JButton b1 = new JButton("Back");
        b1.setBounds(150, 600, 150, 50);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Close the popup
                dispose(); // This line should be correct
            }
        });
        JButton b2 = new JButton("Save");
        b2.setBounds(425, 600, 150, 50);

        setContentPane(panel);
        panel.add(p1);
        panel.add(p2);
        panel.add(p3);
        panel.add(p4);
        panel.add(p5);
        panel.add(p6);
        panel.add(p7);
        panel.add(t1);
        panel.add(t2);
        panel.add(t3);
        panel.add(t4);
        panel.add(t5);
        panel.add(t6);
        panel.add(t7);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        add(b1);
        add(b2);
        setModal(true);
        setVisible(true);

    }

    public static void main(String[] args) {
        new EditPersonalInfo(null);
    }
}
