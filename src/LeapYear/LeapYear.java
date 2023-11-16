package LeapYear;

import javax.swing.*;

public class LeapYear extends JFrame {
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;
    public LeapYear() {
        btnCheckYear.addActionListener(e -> {
            String year = tfYear.getText();
            int checkYear = Integer.parseInt(year);

            if(checkYear % 4 == 0 && checkYear % 100 != 0 || checkYear % 400 == 0) {
                JOptionPane.showMessageDialog(null,"Leap year");
            } else {
                JOptionPane.showMessageDialog(null,"Not a leap year");
            }
        });

}

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.panel1);
        app.setSize(500,300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.setTitle("Leap Year Checker");
    }
}
