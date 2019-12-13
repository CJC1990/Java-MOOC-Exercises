package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Text Copier");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        //Create and Set the Jframe Container layout
        GridLayout gridLayout = new GridLayout(3,1);
        container.setLayout(gridLayout);
        
        //Create an area to enter text and an area to display text
        JTextField textEntry = new JTextField();
        JLabel textDisplay = new JLabel();
        
        //Create a button and add an ActionListener to it that has the textEntry and testDisplay object passed into it
        JButton copyButton = new JButton("Copy!");
        copyButton.addActionListener(new ActionEventListener(textEntry, textDisplay));
        
        //Add the componenets to the JFrame Container
        container.add(textEntry);
        container.add(copyButton);
        container.add(textDisplay);
    }
}
