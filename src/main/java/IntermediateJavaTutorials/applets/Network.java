package IntermediateJavaTutorials.applets;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */


import javax.swing.*;
import javax.swing.border.Border;
import java.applet.AppletContext;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Network extends JApplet {

    private HashMap<String, URL> websiteInfo;
    private ArrayList<String> titles;
    private JList mainList;

    //init
    public void init(){
        websiteInfo = new HashMap<>();
        titles = new ArrayList<>();

        grabHTMLInfo();
        add(new JLabel("What website do you want to visit?"), BorderLayout.NORTH);
        mainList = new JList(titles.toArray());

        mainList.addListSelectionListener(e -> {
            Object obj = mainList.getSelectedValue();
            URL newDocument = websiteInfo.get(obj);
            AppletContext browser = getAppletContext();
            browser.showDocument(newDocument);
        });
        add(new JScrollPane(mainList), BorderLayout.CENTER);
    }

    //get website info
    private void grabHTMLInfo(){
        String title;
        String address;
        URL url;
        int count = 0;

        title = getParameter("title" + count);
        while (title != null){
            address = getParameter("address" + count);
            try{
                url = new URL(address);
                websiteInfo.put(title, url);
                titles.add(title);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            ++count;
            title = getParameter("title" + count);
        }
    }
}
