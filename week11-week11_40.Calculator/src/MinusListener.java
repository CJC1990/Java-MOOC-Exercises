
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MinusListener implements ActionListener {

    private Calculator calc;
    private JTextField inputField;
    private JTextField outputField;
    private JButton zButton;

    public MinusListener(Calculator calc, JTextField inputField, JTextField outputField, JButton zButton) {
        this.calc = calc;
        this.inputField = inputField;
        this.outputField = outputField;
        this.zButton = zButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            calc.minus(Integer.parseInt(inputField.getText()));
            inputField.setText("");
            outputField.setText(calc.getTotal() + "");
            zButton.setEnabled(true);
            if(outputField.getText().equals("0")){    
                zButton.setEnabled(false);
            }
            
        } catch (NumberFormatException ex) {
            inputField.setText("");
        }
        
    }

}
