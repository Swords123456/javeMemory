package IntermediateJavaTutorials.applets;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */
import java.awt.*;
import javax.swing.*;
public class InitMethodApplet extends JApplet{
    private double sum;

    public void init(){
        String fn = JOptionPane.showInputDialog("Enter first number");
        String sn = JOptionPane.showInputDialog("Enter second number");

        double n1 = Double.parseDouble(fn);
        double n2 = Double.parseDouble(sn);

        sum = n1 + n2;

    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("The sum is " + sum, 25, 30);
    }
}
