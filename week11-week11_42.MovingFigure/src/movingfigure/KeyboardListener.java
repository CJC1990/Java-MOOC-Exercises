
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardListener implements KeyListener {
    
    private Component drawingBoard;
    private Figure circle;

    public KeyboardListener(Component drawingBoard, Figure circle) {
        this.drawingBoard = drawingBoard;
        this.circle = circle;
    }
    
    

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            circle.move(-1, 0);
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            circle.move(1, 0);
        }
        if(e.getKeyCode() == KeyEvent.VK_UP){
            circle.move(0, -1);
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            circle.move(0, 1);
        }
        drawingBoard.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
