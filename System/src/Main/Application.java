package Main;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Application extends JDialog{
    private JPanel panel1;
    private JTabbedPane MainPane;
    private JPanel HomeTAB;
    private JPanel OrderTAB;
    private JPanel InfoTAB;
    private JPanel AboutTAB;
    private JPanel ManageTAB;
    private JTabbedPane ManageTabbedPane;
    private JPanel Employes;
    private JPanel TransHistTAB;
    private JPanel CheckInvTAB;
    private JLabel ManageLabel;
    private JTextPane welcomeToMamaSTextPane;
    private JTextPane storeHoursMondayThursdayTextPane;
    private JTextPane phone1800MyPTextPane;
    private JLabel AboutLabel;
    private JScrollPane EmScroll;
    private JTextPane textPane_TH;
    private JScrollPane THScroll;
    private JScrollPane CIScroll;
    private JList EMlist;
    private JList CIlist;
    private JButton addNewEmployeeButton;

    public static void cus(JPanel x){

        // Personal Info TAB
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBackground(Color.lightGray);
        leftPanel.setBounds(15, 80, 1520, 700);

        JPanel picture = new JPanel();
        picture.setBackground(Color.white);
        picture.setBounds(200, 100, 250, 250);
        JLabel label = new JLabel("Profile Picture");
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));



        JButton button = new JButton("Edit Personal Information");
        button.setBounds(500, 100, 200, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open the popup GUI
                new EditPersonalInfo(null);
                JOptionPane.showMessageDialog(x.getParent(),"Info Updated");
                x.repaint();
                x.revalidate();
            }
        });

        JPanel bottom = new JPanel();
        bottom.setLayout(null);
        bottom.setBackground(Color.cyan);
        bottom.setBounds(200, 400, 1000, 275);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(50, 50, 320, 50);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(50, 120, 150, 50);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.white);
        p3.setBounds(220, 120, 150, 50);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.white);
        p4.setBounds(50, 190, 320, 50);
        JPanel p5 = new JPanel();
        p5.setBackground(Color.white);
        p5.setBounds(500, 50, 320, 50);
        JPanel p6 = new JPanel();
        p6.setBackground(Color.white);
        p6.setBounds(500, 120, 320, 50);
        JPanel p7 = new JPanel();
        p7.setBackground(Color.white);
        p7.setBounds(500, 190, 320, 50);

        JLabel label1 = new JLabel("Address:");
        label1.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label2 = new JLabel("City:");
        label2.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label3 = new JLabel("Zip:");
        label3.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label4 = new JLabel("Phone:");
        label4.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label5 = new JLabel("Full Name:");
        label5.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label6 = new JLabel("Email:");
        label6.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label7 = new JLabel("Phone:");
        label7.setFont(new Font("MV Boli", Font.PLAIN, 15));

        leftPanel.add(picture);
        leftPanel.add(bottom);
        picture.add(label);
        leftPanel.add(button);
        bottom.add(p1);
        bottom.add(p2);
        bottom.add(p3);
        bottom.add(p4);
        bottom.add(p5);
        bottom.add(p6);
        bottom.add(p7);
        p1.add(label1);
        p2.add(label2);
        p3.add(label3);
        p4.add(label4);
        p5.add(label5);
        p6.add(label6);
        p7.add(label7);

        x.add(leftPanel);
    }

    public static void Emp(JPanel x){
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(null);
        leftPanel.setBackground(Color.lightGray);
        leftPanel.setBounds(15, 80, 1650, 700);

        JPanel picture = new JPanel();
        picture.setBackground(Color.white);
        picture.setBounds(200, 100, 250, 250);
        JLabel label = new JLabel("Profile Picture");
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));

        JButton button = new JButton("Edit Personal Information");
        button.setBounds(500, 100, 200, 50);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EditPersonalInfo(null);
                JOptionPane.showMessageDialog(x.getParent(),"Info Updated");
                x.repaint();
                x.revalidate();
            }
        });

        JPanel bottom = new JPanel();
        bottom.setLayout(null);
        bottom.setBackground(Color.cyan);
        bottom.setBounds(200, 400, 1000, 275);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.white);
        p1.setBounds(50, 50, 320, 50);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.white);
        p2.setBounds(50, 120, 150, 50);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.white);
        p3.setBounds(220, 120, 150, 50);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.white);
        p4.setBounds(50, 190, 320, 50);
        JPanel p5 = new JPanel();
        p5.setBackground(Color.white);
        p5.setBounds(500, 50, 320, 50);
        JPanel p6 = new JPanel();
        p6.setBackground(Color.white);
        p6.setBounds(500, 120, 320, 50);
        JPanel p7 = new JPanel();
        p7.setBackground(Color.white);
        p7.setBounds(500, 190, 320, 50);
        JPanel p8 = new JPanel();
        p8.setBackground(Color.white);
        p8.setBounds(500, 170, 320, 50);
        JPanel p9 = new JPanel();
        p9.setBackground(Color.white);
        p9.setBounds(500, 240, 320, 50);
        JPanel p10 = new JPanel();
        p10.setBackground(Color.white);
        p10.setBounds(500, 310, 320, 50);

        JLabel label1 = new JLabel("Address:");
        label1.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label2 = new JLabel("City:");
        label2.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label3 = new JLabel("Zip:");
        label3.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label4 = new JLabel("Phone:");
        label4.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label5 = new JLabel("Full Name:");
        label5.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label6 = new JLabel("Email:");
        label6.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label7 = new JLabel("Phone:");
        label7.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label8 = new JLabel("Hourly:");
        label8.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label9 = new JLabel("Pay Check:");
        label9.setFont(new Font("MV Boli", Font.PLAIN, 15));
        JLabel label10 = new JLabel("Next Pay Date:");
        label10.setFont(new Font("MV Boli", Font.PLAIN, 15));

        leftPanel.add(picture);
        leftPanel.add(bottom);
        picture.add(label);
        leftPanel.add(button);
        bottom.add(p1);
        bottom.add(p2);
        bottom.add(p3);
        bottom.add(p4);
        bottom.add(p5);
        bottom.add(p6);
        bottom.add(p7);
        p1.add(label1);
        p2.add(label2);
        p3.add(label3);
        p4.add(label4);
        p5.add(label5);
        p6.add(label6);
        p7.add(label7);
        leftPanel.add(p8);
        leftPanel.add(p9);
        leftPanel.add(p10);
        p8.add(label8);
        p9.add(label9);
        p10.add(label10);

        x.add(leftPanel);
    }



    Application(JFrame frame){
        super(frame);
        setTitle("Mama's Pizzeria");
        setContentPane(panel1);
        setMinimumSize(new Dimension(1565,880));
        setModal(true);
        setLocationRelativeTo(frame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        // Home TAB / Menu
        HomeTAB.setLayout(null);

        JPanel sizes = new JPanel();
        sizes.setLayout(null);
        sizes.setBackground(Color.cyan);
        sizes.setBounds(20, 50, 500, 750);

        JPanel toppings = new JPanel();
        toppings.setLayout(null);
        toppings.setBackground(Color.cyan);
        toppings.setBounds(545, 50, 500, 750);

        JPanel drinks = new JPanel();
        drinks.setLayout(null);
        drinks.setBackground(Color.cyan);
        drinks.setBounds(1070, 50, 500, 750);

        JLabel name = new JLabel("Mama's Pizzeria");
        name.setBounds(700,0,250,50);
        name.setFont(new Font("MV Boli", Font.PLAIN, 30));

        JLabel size = new JLabel("   Sizes:");
        size.setBounds(175,10,110,50);
        size.setFont(new Font("MV Boli", Font.PLAIN, 20));
        size.setBackground(new Color(128, 145, 163));
        size.setOpaque(true);

        JLabel topping = new JLabel(" 1 Free Topping   .50 Per Additional Topping");
        topping.setHorizontalTextPosition(JLabel.CENTER);
        topping.setFont(new Font("MV Boli", Font.PLAIN, 20));
        topping.setBackground(new Color(128, 145, 163));
        topping.setBounds(25,10,450,50);
        topping.setOpaque(true);

        JLabel Drink = new JLabel("  Drinks:");
        Drink.setHorizontalTextPosition(JLabel.CENTER);
        Drink.setFont(new Font("MV Boli", Font.PLAIN, 20));
        Drink.setBackground(new Color(128, 145, 163));
        Drink.setBounds(175,10,110,50);
        Drink.setOpaque(true);

        JLabel s1 = new JLabel("10in - $10");
        s1.setBounds(175,90,150,50);
        s1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel s2 = new JLabel("12in - $13");
        s2.setBounds(175,150,150,50);
        s2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel s3 = new JLabel("14in - $15");
        s3.setBounds(175,210,150,50);
        s3.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel s4 = new JLabel("16in - $17");
        s4.setBounds(175,270,150,50);
        s4.setFont(new Font("MV Boli", Font.PLAIN, 20));

        JLabel ds1 = new JLabel("Small - $3");
        ds1.setBounds(30,70,150,50);
        ds1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel ds2 = new JLabel("Large - $4");
        ds2.setBounds(180,70,150,50);
        ds2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel ds3 = new JLabel("2 Liter - $5");
        ds3.setBounds(330,70,150,50);
        ds3.setFont(new Font("MV Boli", Font.PLAIN, 20));

        JLabel d1 = new JLabel("Pepsi");
        d1.setBounds(60,150,150,50);
        d1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel d2 = new JLabel("Diet Pepsi");
        d2.setBounds(300,150,150,50);
        d2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel d3 = new JLabel("Dr. Pepper");
        d3.setBounds(60,220,150,50);
        d3.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel d4 = new JLabel("Diet Dr. Pepper");
        d4.setBounds(300,220,200,50);
        d4.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel d5 = new JLabel("Water");
        d5.setBounds(60,290,150,50);
        d5.setFont(new Font("MV Boli", Font.PLAIN, 20));

        JLabel t1 = new JLabel("Pepperoni");
        t1.setBounds(60,100,150,50);
        t1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t2 = new JLabel("Cheese");
        t2.setBounds(300,100,150,50);
        t2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t3 = new JLabel("Mushrooms");
        t3.setBounds(60,170,150,50);
        t3.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t4 = new JLabel("Sausage");
        t4.setBounds(300,170,200,50);
        t4.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t5 = new JLabel("Bell Peppers");
        t5.setBounds(60,240,150,50);
        t5.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t6 = new JLabel("Jalapeno Peppers");
        t6.setBounds(300,240,200,50);
        t6.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t7 = new JLabel("Onions");
        t7.setBounds(60,310,150,50);
        t7.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t8 = new JLabel("Pineapples");
        t8.setBounds(300,310,150,50);
        t8.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel t9 = new JLabel("Olives");
        t9.setBounds(600,380,200,50);
        t9.setFont(new Font("MV Boli", Font.PLAIN, 20));

        JLabel c1 = new JLabel("Thin Crust");
        c1.setBounds(60,550,150,50);
        c1.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel c2 = new JLabel("Stuffed Crust");
        c2.setBounds(300,550,200,50);
        c2.setFont(new Font("MV Boli", Font.PLAIN, 20));
        JLabel c3 = new JLabel("Deep Dish");
        c3.setBounds(60,620,150,50);
        c3.setFont(new Font("MV Boli", Font.PLAIN, 20));


        HomeTAB.add(sizes);
        HomeTAB.add(toppings);
        HomeTAB.add(drinks);
        HomeTAB.add(name);
        sizes.add(size);
        toppings.add(topping);
        drinks.add(Drink);
        sizes.add(s1);
        sizes.add(s2);
        sizes.add(s3);
        sizes.add(s4);
        drinks.add(ds1);
        drinks.add(ds2);
        drinks.add(ds3);
        drinks.add(d1);
        drinks.add(d2);
        drinks.add(d3);
        drinks.add(d4);
        drinks.add(d5);
        toppings.add(t1);
        toppings.add(t2);
        toppings.add(t3);
        toppings.add(t4);
        toppings.add(t5);
        toppings.add(t6);
        toppings.add(t7);
        toppings.add(t8);
        toppings.add(t9);
        toppings.add(c1);
        toppings.add(c2);
        toppings.add(c3);

        //Order TAB
        OrderTAB.setLayout(null);

        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.lightGray);
        leftPanel.setLayout(null);
        leftPanel.setBounds(15,80,800,750);
        JPanel rightPanel = new JPanel();
        rightPanel.setBackground(Color.lightGray);
        rightPanel.setLayout(null);
        rightPanel.setBounds(820,80,800,750);

        OrderTAB.add(leftPanel);
        OrderTAB.add(rightPanel);

        String[] options1 = {"10in", "12in", "14in", "16in"};
        String[] options2 = {"Thin Crust", "Stuffed Crust", "Deep Dish"};
        String[] options3 = {"Pepsi", "Diet Pepsi", "Dr. Pepper", "Diet Dr. Pepper", "Water"};
        String[] options4 = {"Small Drink", "Large Drink", "2 Liter"};

        // Create drop-down boxes
        JComboBox<String> pizzaSize = new JComboBox<>(options1);
        pizzaSize.setBounds(20,20,100,20);
        JComboBox<String> crust = new JComboBox<>(options2);
        crust.setBounds(130,20,100,20);
        JComboBox<String> drink = new JComboBox<>(options3);
        drink.setBounds(250,20,100,20);
        JComboBox<String> drinkSize = new JComboBox<>(options4);
        drinkSize.setBounds(370,20,100,20);

        leftPanel.add(pizzaSize);
        leftPanel.add(crust);
        leftPanel.add(drink);
        leftPanel.add(drinkSize);


        JCheckBox checkBox1 = new JCheckBox("Pepperoni");
        checkBox1.setBounds(20,200,150,50);
        JCheckBox checkBox2 = new JCheckBox("Cheese");
        checkBox2.setBounds(180,200,150,50);
        JCheckBox checkBox3 = new JCheckBox("Mushrooms");
        checkBox3.setBounds(340,200,150,50);
        JCheckBox checkBox4 = new JCheckBox("Sausage");
        checkBox4.setBounds(500,200,150,50);
        JCheckBox checkBox5 = new JCheckBox("Bell Peppers");
        checkBox5.setBounds(20,300,150,50);
        JCheckBox checkBox6 = new JCheckBox("Jalapeno Peppers");
        checkBox6.setBounds(180,300,150,50);
        JCheckBox checkBox7 = new JCheckBox("Onions");
        checkBox7.setBounds(340,300,150,50);
        JCheckBox checkBox8 = new JCheckBox("Pineapple");
        checkBox8.setBounds(500,300,150,50);
        JCheckBox checkBox9 = new JCheckBox("Olives");
        checkBox9.setBounds(20,400,150,50);

        String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";

        orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();

        leftPanel.add(checkBox1);
        leftPanel.add(checkBox2);
        leftPanel.add(checkBox3);
        leftPanel.add(checkBox4);
        leftPanel.add(checkBox5);
        leftPanel.add(checkBox6);
        leftPanel.add(checkBox7);
        leftPanel.add(checkBox8);
        leftPanel.add(checkBox9);

        JButton button = new JButton("Continue to Payment");
        button.setBounds(20,500,200,50);
        leftPanel.add(button);

        JLabel t01 = new JLabel("Current Order Summary:");
        t01.setBounds(10,0,800,30);
        t01.setFont(new Font("MV Boli", Font.PLAIN, 25));
        rightPanel.add(t01);

        JTextPane orderSummary = new JTextPane();
        orderSummary.setBounds(10,50,800,700);
        orderSummary.setFont(new Font("MV Boli", Font.PLAIN, 20));
        orderSummary.setEditable(false);
        orderSummary.setText(orderStr);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new OrderSummary(null);

            }
        });
        drinkSize.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        drink.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        crust.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        pizzaSize.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);            }
        });
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        checkBox9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String orderStr = pizzaSize.getSelectedItem().toString() + " " + crust.getSelectedItem().toString() + ":\n";
                if (checkBox1.isSelected()){
                    orderStr += "- Pepperoni\n";

                }
                if (checkBox2.isSelected()){
                    orderStr += "- Cheese\n";

                }
                if (checkBox3.isSelected()){
                    orderStr += "- Mushrooms\n";

                }
                if (checkBox4.isSelected()){
                    orderStr += "- Sausage\n";

                }
                if (checkBox5.isSelected()){
                    orderStr += "- Bell Peppers\n";

                }
                if (checkBox6.isSelected()){
                    orderStr += "- Jalapeno Peppers\n";

                }
                if (checkBox7.isSelected()){
                    orderStr += "- Onions\n";

                }
                if (checkBox8.isSelected()){
                    orderStr += "- Pineapple\n";
                }
                if (checkBox9.isSelected()){
                    orderStr += "- Olives\n";
                }
                orderStr += "\n\n\n" + drinkSize.getSelectedItem().toString() + " " + drink.getSelectedItem().toString();
                orderSummary.setText(orderStr);
            }
        });
        rightPanel.add(orderSummary);



        // Info TAB
        InfoTAB.setLayout(null);
        cus(InfoTAB);






        setVisible(true);
    }

    public static void main(String[] args) {
       // Application app = new Application(null);
    }


}
