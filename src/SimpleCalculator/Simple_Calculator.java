package SimpleCalculator;

import javax.swing.*;

public class Simple_Calculator extends JFrame {
    private JButton btnCompute;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox cbOperations;
    private JTextArea textArea1;
    private JLabel tfNumber1;
    private JLabel tfNumber2;
    private JLabel lblResult;
    private JPanel panel;
        public Simple_Calculator() {
            Simple_Calculator calc = this;
            btnCompute.addActionListener(e -> {
                String _num1, _num2;
                int num1, num2;
                double result;

                _num1 = tfNumber1.getText();
                num1 = Integer.parseInt(_num1);

                _num2 = tfNumber2.getText();
                num2 = Integer.parseInt(_num2);

                if(cbOperations.getSelectedIndex() == 0) {
                    result = num1 + num2;
                    textArea1.append(Double.toString(result));
                } else if(cbOperations.getSelectedIndex() == 1) {
                    result = num1 - num2;
                    textArea1.append(Double.toString(result));
                } else if(cbOperations.getSelectedIndex() == 2) {
                    result = num1 * num2;
                    textArea1.append(Double.toString(result));
                } else {
                    result = num1 / num2;
                    textArea1.append(Double.toString(result));
                }

            });
        }

    public static void main(String[] args) {
        Simple_Calculator app = new Simple_Calculator();
        app.setContentPane(app.panel);
        app.setSize(600,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Simple Calculator");
    }
}

