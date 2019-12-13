
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionEventListener implements ActionListener {
    
    private JTextField textEntry;
    private JLabel textDisplay;

    public ActionEventListener(JTextField textEntry, JLabel textDisplay) {
        this.textEntry = textEntry;
        this.textDisplay = textDisplay;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        textDisplay.setText(textEntry.getText());
        textEntry.setText("");
    }
    
}
