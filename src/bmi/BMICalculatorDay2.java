package bmi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BMICalculatorDay2 extends JFrame implements ActionListener {
    private JTextField feetField, inchesField, weightField;

    public BMICalculatorDay2() {
        setTitle("BMI Calculator");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.WHITE);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 5, 10);

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font inputFont = new Font("Segoe UI", Font.PLAIN, 14);

        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        JLabel feetLabel = new JLabel("Height (feet):");
        feetLabel.setFont(labelFont);
        panel.add(feetLabel, gbc);

        gbc.gridx = 1;
        feetField = new JTextField(10);
        feetField.setFont(inputFont);
        panel.add(feetField, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel inchLabel = new JLabel("Height (inches):");
        inchLabel.setFont(labelFont);
        panel.add(inchLabel, gbc);

        gbc.gridx = 1;
        inchesField = new JTextField(10);
        inchesField.setFont(inputFont);
        panel.add(inchesField, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setFont(labelFont);
        panel.add(weightLabel, gbc);

        gbc.gridx = 1;
        weightField = new JTextField(10);
        weightField.setFont(inputFont);
        panel.add(weightField, gbc);

       
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton calculateButton = new JButton("Calculate BMI");
        calculateButton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        calculateButton.setBackground(new Color(76, 175, 80));
        calculateButton.setForeground(Color.WHITE);
        calculateButton.setFocusPainted(false);
        calculateButton.addActionListener(this); 
        panel.add(calculateButton, gbc);

       
        gbc.gridy = 4;
        JLabel resultLabel = new JLabel(" ");
        resultLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
        panel.add(resultLabel, gbc);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Read user inputs and print to console
        String feet = feetField.getText().trim();
        String inches = inchesField.getText().trim();
        String weight = weightField.getText().trim();

        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + inches);
        System.out.println("Weight (kg): " + weight);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BMICalculatorDay2::new);
    }
}
