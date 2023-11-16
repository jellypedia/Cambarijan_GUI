package FoodOrderingSystem;

import javax.swing.*;

public class Food_Ordering_System extends JFrame {
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JPanel panel;

    public Food_Ordering_System() {
        Food_Ordering_System angel = this;
        btnOrder.addActionListener(e -> {
            float amount = 0.0F;
            float total;

            if(cPizza.isSelected()) {
                amount = amount + 100;
            } if(cBurger.isSelected()) {
                amount = amount + 80;
            } if(cFries.isSelected()) {
                amount = amount + 65;
            } if(cSoftDrinks.isSelected()) {
                amount = amount + 55;
            } if(cTea.isSelected()) {
                amount = amount + 50;
            } if(cSundae.isSelected()) {
                amount = amount + 0;
            }

            if(rb5.isSelected()) {
                total = (float)(amount*0.05);
                amount = amount - total;
            } else if(rb10.isSelected()) {
                total = (float)(amount*0.10);
                amount = amount - total;
            } else if(rb15.isSelected()) {
                total = (float)(amount*0.15);
                amount = amount - total;
            }

            JOptionPane.showMessageDialog(angel,"The total price is Php" + amount);

        });
    }

    public static void main(String[] args) {
        Food_Ordering_System app = new Food_Ordering_System();
        app.setContentPane(app.panel);
        app.setSize(600,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}
