
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;


public class ZListener implements ActionListener {
    
    private Calculator calc;
    private JTextField inputField;
    private JTextField outputField;
    private JButton zButton;

    public ZListener(Calculator calc, JTextField inputField, JTextField outputField, JButton zButton) {
        this.calc = calc;
        this.inputField = inputField;
        this.outputField = outputField;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        outputField.setText("0");
        inputField.setText("");
        calc.setTotal(0);
        zButton.setEnabled(false);    
    }
    
}
