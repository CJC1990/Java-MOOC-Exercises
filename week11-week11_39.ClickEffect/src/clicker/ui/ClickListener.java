package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ClickListener implements ActionListener {

    private Calculator personalCalculator;
    private JLabel numberOfCLicksDisplay;

    public ClickListener(Calculator pc, JLabel numberOfClicksDisplay) {
        this.personalCalculator = pc;
        this.numberOfCLicksDisplay = numberOfClicksDisplay;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        personalCalculator.increase();

        numberOfCLicksDisplay.setText(personalCalculator.giveValue() + "");

    }

}
