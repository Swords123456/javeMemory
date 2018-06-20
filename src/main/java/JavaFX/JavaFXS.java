package JavaFX;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaFXS {
    static JFrame frame;

    private JCheckBox checkBox1;
    private JButton submitButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel CustomPanel;

    public JavaFXS() {
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().equalsIgnoreCase("Admin") && passwordField1.getText().equals("SpirafyLogin!")) {
                    JOptionPane.showMessageDialog(null, "You have successfully logged in!");
                    JLabel label = new JLabel("Hey", JLabel.CENTER);
                    label.setAlignmentX(0);
                    label.setAlignmentY(0);
                    label.setText("Welcome back Admin");
                    CustomPanel.remove(passwordField1);
                    CustomPanel.remove(textField1);
                    CustomPanel.remove(checkBox1);
                    CustomPanel.remove(submitButton);
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid username/password combinations");
                }
            }
        });
    }

    public static void main(String[] args){
        //Making the frame
        frame = new JFrame("Game");

        frame.setContentPane(new JavaFXS().CustomPanel);
        frame.setVisible(true);
        frame.setSize(640, 480);
    }
}
