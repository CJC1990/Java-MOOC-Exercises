
package movingfigure;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {
    
    private Figure circle;

    public DrawingBoard(Figure circle) {
        this.circle = circle;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        circle.draw(g);
    }
    
    
    
    
    
    
    
}
