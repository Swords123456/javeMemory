package IntermediateJavaTutorials.webBrowser;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import javax.swing.*;
import javax.swing.event.HyperlinkEvent;
import java.awt.*;
import java.io.IOException;

public class ReadFile extends JFrame {
    private JTextField addressBar;
    private JEditorPane display;

    //constructor
    public ReadFile(){
        super("Browser");

        addressBar = new JTextField("Enter a url hoss");
        addressBar.addActionListener(e -> {
            loadCrap(e.getActionCommand());
        });
        add(addressBar, BorderLayout.NORTH);

        display = new JEditorPane();
        display.setEditable(false);
        display.addHyperlinkListener(e -> {
            if(e.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
                loadCrap(e.getURL().toString());
            }
        });
        add(new JScrollPane(display), BorderLayout.CENTER);

    }

    //load crap to display on the screen
    private void loadCrap(String st){
        try{
            //this
            display.setPage(st);
            addressBar.setText(st);
        } catch (IOException e) {
            System.out.println("Crap");
        }
    }
}
