package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator personalCalculator;

    public UserInterface(PersonalCalculator personalCalculator) {
        this.personalCalculator = personalCalculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout gridLayout = new GridLayout(2, 1);
        container.setLayout(gridLayout);

        JLabel numberOfClicksDisplay = new JLabel("0");

        JButton clickButton = new JButton("Click!");
        clickButton.addActionListener(new ClickListener(personalCalculator, numberOfClicksDisplay));

        container.add(numberOfClicksDisplay);
        container.add(clickButton);

    }

    public JFrame getFrame() {
        return frame;
    }
}
