package IntermediateJavaTutorials.OvalSlider;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class TheWindow extends JFrame {
    private JSlider slider;
    private DrawOval myPanel;

    public TheWindow(){
        super("The title");
        myPanel = new DrawOval();
        myPanel.setBackground(Color.CYAN);

        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(e -> myPanel.setD(slider.getValue()));
        add(slider, BorderLayout.SOUTH);
        add(myPanel, BorderLayout.CENTER);
    }
}
