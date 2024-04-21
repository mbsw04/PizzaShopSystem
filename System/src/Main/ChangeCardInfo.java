package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChangeCardInfo extends JDialog{
    public ChangeCardInfo(JFrame frame) {
        super(frame);
        setTitle("Change Card Info");
        setLayout(null);
        setBackground(Color.WHITE);
        setSize(750, 750);

        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setLayout(null);
        panel.setBounds(15, 50, 700, 600);

        JLabel label1 = new JLabel("Change Your Card Information");
        label1.setBackground(Color.lightGray);
        label1.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label1.setBounds(50,50,750,50);

        JLabel label2 = new JLabel("Card Number:");
        label2.setBackground(Color.lightGray);
        label2.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label2.setBounds(50,250,350,50);

        JLabel label3 = new JLabel("Expiration Date:");
        label3.setBackground(Color.lightGray);
        label3.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label3.setBounds(50,320,350,50);

        JLabel label4 = new JLabel("CVV:");
        label4.setBackground(Color.lightGray);
        label4.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label4.setBounds(50,390,350,50);

        JTextField number = new JTextField();
        number.setBounds(370,260,150,30);
        JTextField date = new JTextField();
        date.setBounds(370,330,150,30);
        JTextField code = new JTextField();
        code.setBounds(370,400,150,30);

        JButton button = new JButton("Confirm Changes");
        button.setBounds(50,500,200,50);
        button.setBackground(Color.lightGray);

        JCheckBox cash = new JCheckBox("Cash");
        cash.setBounds(50,200,100,30);

        JCheckBox check = new JCheckBox("Check");
        check.setBounds(150,200,100,30);

        JCheckBox card = new JCheckBox("Card");
        card.setBounds(250,200,100,30);

        cash.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                check.setSelected(false);
                card.setSelected(false);
                number.setEditable(false);
                date.setEditable(false);
                code.setEditable(false);
            }
        });
        check.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                cash.setSelected(false);
                card.setSelected(false);
                number.setEditable(false);
                date.setEditable(false);
                code.setEditable(false);
            }
        });
        card.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                check.setSelected(false);
                cash.setSelected(false);
                number.setEditable(true);
                date.setEditable(true);
                code.setEditable(true);
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        add(panel);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(number);
        panel.add(date);
        panel.add(code);
        panel.add(button);
        panel.add(cash);
        panel.add(check);
        panel.add(card);

        setModal(true);
        setVisible(true);

    }
}