package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ThankYou{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Thank You");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setBounds(100,100,550,200);

        JButton button = new JButton();
        button.setBackground(Color.darkGray);
        button.setBounds(175,350,400,100);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.exit(0);
            }
        });

        JLabel text = new JLabel("Thank You for placing your order!");
        text.setHorizontalTextPosition(JLabel.CENTER);
        text.setVerticalTextPosition(JLabel.TOP);
        text.setForeground(new Color(0x000000));
        text.setFont(new Font("MV Boli", Font.PLAIN, 25));

        JLabel txt = new JLabel("Your food should be ready in 20-35 minutes.");
        txt.setHorizontalTextPosition(JLabel.CENTER);
        txt.setVerticalTextPosition(JLabel.BOTTOM);
        txt.setForeground(new Color(0x000000));
        txt.setFont(new Font("MV Boli", Font.PLAIN, 25));

        JLabel txt1 = new JLabel("Return to Home");
        txt1.setHorizontalTextPosition(JLabel.CENTER);
        txt1.setVerticalTextPosition(JLabel.CENTER);
        txt1.setForeground(new Color(0x000000));
        txt1.setFont(new Font("MV Boli", Font.PLAIN, 25));

        frame.add(panel);
        frame.add(button);
        panel.add(text);
        panel.add(txt);
        button.add(txt1);
        frame.setVisible(true);
    }
}

