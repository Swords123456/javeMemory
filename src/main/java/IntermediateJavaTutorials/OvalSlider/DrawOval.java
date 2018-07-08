package IntermediateJavaTutorials.OvalSlider;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import javax.swing.*;
import java.awt.*;

public class DrawOval extends JPanel {

    private int d = 10;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(10, 10, d, d);
    }

    public void setD(int newD){
        this.d = (newD >= 0 ? newD : 10);
        repaint();
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    @Override
    public Dimension getMinimumSize() {
        return new Dimension(200, 200);
    }
}
