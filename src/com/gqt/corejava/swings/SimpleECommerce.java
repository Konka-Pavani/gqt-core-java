package com.gqt.corejava.swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

// ----- OOP Classes -----
class Product {
    String name, description;
    double price;
    double rating;

    Product(String name, String description, double price, double rating) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rating = rating;
    }

    public String toString() {
        return name + " - $" + price;
    }
}

class Cart {
    java.util.List<Product> items = new ArrayList<>();

    void addProduct(Product p) {
        items.add(p);
    }

    String checkout() {
        if (items.isEmpty()) return "Cart is empty!";
        StringBuilder sb = new StringBuilder("Invoice:\n");
        double total = 0;
        for (Product p : items) {
            sb.append(p.name).append(" - $").append(p.price).append("\n");
            total += p.price;
        }
        sb.append("Total: $").append(total);
        return sb.toString();
    }
}

// ----- GUI -----
public class SimpleECommerce {
    private Cart cart = new Cart();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleECommerce().createUI());
    }

    private void createUI() {
        JFrame frame = new JFrame("E-Commerce App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        // Customer details
        JTextField nameField = new JTextField(10);
        JTextField emailField = new JTextField(10);
        JTextField contactField = new JTextField(10);
        JButton startBtn = new JButton("Start Shopping");

        JPanel customerPanel = new JPanel();
        customerPanel.add(new JLabel("Name:")); customerPanel.add(nameField);
        customerPanel.add(new JLabel("Email:")); customerPanel.add(emailField);
        customerPanel.add(new JLabel("Contact:")); customerPanel.add(contactField);
        customerPanel.add(startBtn);

        // Product data
        Product[] electronics = {
            new Product("Mobile", "Smartphone with 6GB RAM", 300, 4.5),
            new Product("Laptop", "14 inch i5 Processor", 800, 4.7),
            new Product("Headphones", "Wireless Bluetooth", 50, 4.2),
            new Product("Speaker", "Portable JBL Speaker", 120, 4.6),
            new Product("Camera", "DSLR 24MP", 500, 4.4)
        };

        JList<Product> productList = new JList<>(electronics);
        JTextArea detailsArea = new JTextArea(5, 30);
        JButton addToCartBtn = new JButton("Add to Cart");
        JButton checkoutBtn = new JButton("Checkout");
        JTextArea cartArea = new JTextArea(8, 30);

        JPanel shopPanel = new JPanel();
        shopPanel.add(new JScrollPane(productList));
        shopPanel.add(addToCartBtn);
        shopPanel.add(new JScrollPane(detailsArea));
        shopPanel.add(checkoutBtn);
        shopPanel.add(new JScrollPane(cartArea));

        // Switch panels
        CardLayout layout = new CardLayout();
        JPanel mainPanel = new JPanel(layout);
        mainPanel.add(customerPanel, "Customer");
        mainPanel.add(shopPanel, "Shop");

        // Actions
        startBtn.addActionListener(e -> {
            if (nameField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Enter Name to continue!");
            } else {
                layout.show(mainPanel, "Shop");
            }
        });

        productList.addListSelectionListener(e -> {
            Product p = productList.getSelectedValue();
            if (p != null) {
                detailsArea.setText("Name: " + p.name + "\n"
                                  + "Desc: " + p.description + "\n"
                                  + "Price: $" + p.price + "\n"
                                  + "Rating: " + p.rating + "★");
            }
        });

        addToCartBtn.addActionListener(e -> {
            Product p = productList.getSelectedValue();
            if (p != null) {
                cart.addProduct(p);
                JOptionPane.showMessageDialog(frame, p.name + " added to cart!");
            }
        });

        checkoutBtn.addActionListener(e -> {
            cartArea.setText(cart.checkout());
        });

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
