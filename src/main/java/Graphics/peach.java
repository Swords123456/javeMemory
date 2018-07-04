package Graphics;

import javax.swing.*;
import java.awt.*;

public class peach extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        //sets background object
        this.setBackground(Color.WHITE);

        //Sets the color of the object and size
        g.setColor(Color.BLUE);
        g.fillRect(25, 25, 100, 30);

        g.setColor(new Color(255, 102, 2));
        g.fillRect(25, 65, 100, 30);

        g.setColor(Color.CYAN);
        g.drawString("Hey this is text!", 25, 120);

    }
}
