package IntermediateJavaTutorials.instantMessage;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import javax.swing.*;
import java.awt.*;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client extends JFrame{
    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private String message = "";
    private String serverIP;
    private Socket connection;

    public Client(String host) {
        super("Instant messages");
        serverIP = host;
        userText = new JTextField();
        userText.setEditable(false);
        userText.addActionListener(e -> {
            sendMessage(e.getActionCommand());
            userText.setText("");
        });
        add(userText, BorderLayout.NORTH);
        chatWindow = new JTextArea();
        chatWindow.setEditable(false);
        add(new JScrollPane(chatWindow));
        setSize(300, 150);
        setVisible(true);
    }

    //connect to server
    public void startRunning(){
        try {
            connectToServer();
            setupStreams();
            whileChatting();
        }catch (EOFException e){
            showMessage("\n Client terminated connection");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            closeCrap();
        }
    }

    public void connectToServer() throws IOException{
        showMessage("Attempting connection....\n");
        connection = new Socket(InetAddress.getByName(serverIP),6789);
        showMessage("Connected to:" + connection.getInetAddress().getHostName());
    }

    //setup streams;
    public void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        input = new ObjectInputStream(connection.getInputStream());
        output.flush();
        showMessage("\n You're steams are finished");
    }

    //while chatting method;
    public void whileChatting() throws IOException{
        ableToType(true);
        do{
            try{
                message = (String) input.readObject();
                showMessage("\n" + message);
            }catch (ClassNotFoundException e){
                showMessage("\n I don' know what to do with that.");
            }
        }while (!message.equals("SERVER - END"));
    }

    //close streams;
    public void closeCrap(){
        showMessage("\n cleaning stuff behind!");
        ableToType(false);
        try{
            output.close();
            input.close();
            connection.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //send messages to the server
    private void sendMessage(String text){
        try{
            output.writeObject("CLIENT - " + text);
            output.flush();
            showMessage("\nCLIENT - " + text);
        }catch (IOException e){
            chatWindow.append("\n something is wrong");
        }
    }

    public void showMessage(String st){
        SwingUtilities.invokeLater(() -> {
           chatWindow.append(st);
        });
    }

    //able to type!
    public void ableToType(final boolean tof){
        SwingUtilities.invokeLater(() -> {
            userText.setEditable(tof);
        });
    }
}
