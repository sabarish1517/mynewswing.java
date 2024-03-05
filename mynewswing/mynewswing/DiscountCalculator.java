package mynewswing;
import javax.swing.*;
import java.awt.event.*;

public class Ai extends JFrame {
    private JTextField principalField, totalField;
    private JComboBox<String> discountComboBox;
    private JButton calculateButton;

    public Ai() {
        setTitle("Discount Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.FlowLayout());

        JLabel principalLabel = new JLabel("Principal Amount:");
        principalField = new JTextField(15);

        JLabel discountLabel = new JLabel("Discount:");
        String[] discounts = {"5%", "10%", "15%", "20%"};
        discountComboBox = new JComboBox<>(discounts);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateDiscount();
            }
        });

        JLabel totalLabel = new JLabel("Total Amount:");
        totalField = new JTextField(15);
        totalField.setEditable(false);

        add(principalLabel);
        add(principalField);
        add(discountLabel);
        add(discountComboBox);
        add(calculateButton);
        add(totalLabel);
        add(totalField);
    }

    private void calculateDiscount() {
        try {
            double principal = Double.parseDouble(principalField.getText());
            String selectedDiscount = (String) discountComboBox.getSelectedItem();
            double discountPercentage = Double.parseDouble(selectedDiscount.replace("%", "")) / 100.0;

            double discountedAmount = principal - (principal * discountPercentage);
            totalField.setText(String.format("%.2f", discountedAmount));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the principal amount.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


public class DiscountCalculator {
	   public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                Ai calculator = new Ai();
	                calculator.setVisible(true);
	            }
	        });
	    }
	}

}
