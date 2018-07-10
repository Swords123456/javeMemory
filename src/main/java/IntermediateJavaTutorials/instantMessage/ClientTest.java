package IntermediateJavaTutorials.instantMessage;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import javax.swing.*;

public class ClientTest {
    public static void main(String[] args){
        Client c;
        c = new Client("127.0.0.1");
        c.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        c.startRunning();
    }
}
