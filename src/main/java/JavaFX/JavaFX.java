package JavaFX;

import javax.swing.*;

public class JavaFX {

    public static void main(String[] args){
        //Making the frame
        JFrame frame = new JFrame("Game");
        //making a label
        JLabel label = new JLabel("Hey there!", JLabel.CENTER);
        //aligning and setting texts.
        label.setAlignmentX(0);
        label.setAlignmentY(0);
        label.setText("hey Boi!");
        //adding to window and displaying.
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(640, 480);
    }

}