
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private Calculator calc;
    
    public GraphicCalculator(){
        calc = new Calculator();
    }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));
        
        JTextField outputField = new JTextField("0");
        outputField.setEnabled(false);
        JTextField inputField = new JTextField("");
        
        container.add(outputField);
        container.add(inputField);
        container.add(createPanel(inputField, outputField));
    }
    
    private JPanel createPanel(JTextField inputField, JTextField outputField){
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        
        JButton zButton = new JButton("Z");
        zButton.setEnabled(false);
        zButton.addActionListener(new ZListener(calc, inputField, outputField, zButton)); 
        
        JButton addButton = new JButton("+");
        addButton.addActionListener(new AdditionListener(calc, inputField, outputField, zButton));
        
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(new MinusListener(calc, inputField, outputField, zButton));
        
        
        
        buttonPanel.add(addButton);
        buttonPanel.add(minusButton);
        buttonPanel.add(zButton);
        return buttonPanel;     
    }

    public JFrame getFrame() {
        return frame;
    }
}
