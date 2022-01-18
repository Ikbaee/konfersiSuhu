package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusToFahrenheitGUI {
    private JTextField celciusTextField;
    private JButton convertButton;
    private JLabel celciusLabel;
    private JLabel fahrenheitLabel;
    private JPanel convertcelciustofahremheit;

    public CelciusToFahrenheitGUI() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celcius = Double.parseDouble(celciusTextField.getText());
                double fahrenheit =celcius * 1.8 + 32;
                fahrenheitLabel.setText(fahrenheit + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CelciusToFahrenheitGUI");
        frame.setContentPane(new CelciusToFahrenheitGUI().convertcelciustofahremheit);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
