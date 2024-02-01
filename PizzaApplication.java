import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import javax.swing.SwingConstants;

public class Main extends JFrame {
    String Size = "";
    float Price_p = 0;
    int Topping_ct = 0;
    int ex_chs = 0;
    double top_price = 0;

    float Price = (float) (Price_p + top_price);

    public Main() {
        JButton Small = new JButton("Small");
        JButton Medium = new JButton("Medium");
        JButton Large = new JButton("Large");
        JButton Super = new JButton("Super");

        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,1));
        JPanel text = new JPanel(new GridLayout(1, 3));

        JPanel main = new JPanel(new GridLayout(1,4));

        JLabel pizza_size = new JLabel("Pizza Size:", SwingConstants.CENTER);
        pizza_size.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 30));
        text.add(pizza_size);


        main.add(Small);
        main.add(Medium);
        main.add(Large);
        main.add(Super);

        JLabel JSize = new JLabel("Size: "+Size, SwingConstants.CENTER);
        JSize.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 30));
        JLabel JPrice = new JLabel("Price: "+Price, SwingConstants.CENTER);
        JPrice.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 30));

        text.add(JSize);
        text.add(JPrice);

        cp.add(text);
        cp.add(main);

        JPanel top = new JPanel(new GridLayout(2,4));

        JLabel Toppings = new JLabel("Toppings: "+Topping_ct, SwingConstants.CENTER);
        JCheckBox Pepperoni = new JCheckBox("Pepperoni");
        Pepperoni.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox Extra_Cheese = new JCheckBox("Extra Cheese");
        Extra_Cheese.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox Sausage = new JCheckBox("Sausage");
        Sausage.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox Onions = new JCheckBox("Onions");
        Onions.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox Mushrooms = new JCheckBox("Mushrooms");
        Mushrooms.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox Ham= new JCheckBox("Ham");
        Ham.setHorizontalAlignment(SwingConstants.CENTER);
        JCheckBox Pineapple = new JCheckBox("Pineapple!?!?!?");
        top.add(Toppings);
        Pineapple.setHorizontalAlignment(SwingConstants.CENTER);
        top.add(Extra_Cheese);
        top.add(Pepperoni);
        top.add(Sausage);
        top.add(Onions);
        top.add(Mushrooms);
        top.add(Ham);
        top.add(Pineapple);

        cp.setSize(1920,3000);
        cp.add(top);

        JPanel sub = new JPanel(new FlowLayout());
        JButton Submit = new JButton("Order!");
        sub.add(Submit);
        cp.add(sub);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Small.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Size = "S";
                Price_p = 5;
                calc_price();
                JSize.setText("Size: "+Size);
                JPrice.setText("Price: "+Price);
            }

        });
        Medium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Size = "M";
                Price_p = 10;
                calc_price();
                JSize.setText("Size: "+Size);
                JPrice.setText("Price: "+Price);
            }
        });
        Large.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Size = "L";
                Price_p = 15;
                calc_price();
                JSize.setText("Size: "+Size);
                JPrice.setText("Price: "+Price);
            }
        });
        Super.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Size = "Su";
                Price_p = 20;
                calc_price();
                JSize.setText("Size: "+Size);
                JPrice.setText("Price: "+Price);
            }
        });
        Extra_Cheese.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Extra_Cheese.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings!");
                    Extra_Cheese.setSelected(false);
                }
                else {
                    if (Extra_Cheese.isSelected()) {
                        Topping_ct += 1;
                        ex_chs = 1;
                    }
                    else {
                        Topping_ct -= 1;
                        ex_chs = 0;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Pepperoni.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Pepperoni.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings!");
                    Pepperoni.setSelected(false);
                }
                else {
                    if (Pepperoni.isSelected()) {
                        Topping_ct += 1;
                    }
                    else {
                        Topping_ct -= 1;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Sausage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Sausage.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings!");
                    Sausage.setSelected(false);
                }
                else {
                    if (Sausage.isSelected()) {
                        Topping_ct += 1;
                    }
                    else {
                        Topping_ct -= 1;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Onions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Onions.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings!");
                    Onions.setSelected(false);
                }
                else {
                    if (Onions.isSelected()) {
                        Topping_ct += 1;
                    }
                    else {
                        Topping_ct -= 1;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Mushrooms.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Mushrooms.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings!");
                    Mushrooms.setSelected(false);
                }
                else {
                    if (Mushrooms.isSelected()) {
                        Topping_ct += 1;
                    }
                    else {
                        Topping_ct -= 1;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Ham.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Ham.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings!");
                    Ham.setSelected(false);
                }
                else {
                    if (Ham.isSelected()) {
                        Topping_ct += 1;
                    }
                    else {
                        Topping_ct -= 1;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Pineapple.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Topping_ct == 3 & Pineapple.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Can't choose more than 3 toppings! Also, really?? Pineapple?");
                    Pineapple.setSelected(false);
                }
                else {
                    if (Pineapple.isSelected()) {
                        Topping_ct += 1;
                    }
                    else {
                        Topping_ct -= 1;
                    }
                    calc_price();
                    JPrice.setText("Price: "+Price);
                    Toppings.setText("Toppings: " + Topping_ct);
                }
            }});
        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You paid: "+Price+"\nPlease pick up your order in 15 minutes.");
                setVisible(false);
                dispose();
            }
        });
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
    public void calc_price() {
        if (Topping_ct == 1) {
            if (ex_chs == 1) {
                top_price = 0;
            }
            else {
                top_price = Topping_ct*0.5;;
            }
        }
        else if (Topping_ct == 2) {
            if (ex_chs == 1) {
                top_price = (Topping_ct-1)*0.5;
            }
            else {
                top_price = Topping_ct*0.5;
            }
        }
        else if (Topping_ct == 3) {
            if (ex_chs == 1) {
                top_price = 1;
            } else {
                top_price = 1.25;
            }
        }
        Price = (float) (top_price + Price_p);
    }
}

