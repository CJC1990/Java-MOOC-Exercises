package movingfigure;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure circle;
    private Component drawingBoard;

    public UserInterface(Figure circle) {
        this.circle = circle;
    }
    
    

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        drawingBoard = new DrawingBoard(circle);
        container.add(drawingBoard);
    }

    private void addListeners() {
        frame.addKeyListener(new KeyboardListener(drawingBoard, circle));
    }

    public JFrame getFrame() {
        return frame;
    }
}
