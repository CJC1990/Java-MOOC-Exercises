package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);

    }
    
    public void createComponents(Container container){
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
        
        container.add(new JLabel("Are you?"));
        
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("NO!"));
        
        container.add(new JLabel("Why?"));
        
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton noReason = new JRadioButton("No reason.");
        buttonGroup.add(noReason);
        JRadioButton fun = new JRadioButton("Because it is fun!");
        buttonGroup.add(fun);
        
        container.add(noReason);
        container.add(fun);
        container.add(new JButton("Done!"));
    }


    public JFrame getFrame() {
        return frame;
    }
}
