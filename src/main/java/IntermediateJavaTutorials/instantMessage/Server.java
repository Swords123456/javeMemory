package IntermediateJavaTutorials.instantMessage;

/*
 * This code was originally designed and coded by Swords1234.
 * You may contact by his email: Nintendodeveloper8@gmail.com
 * You can also contact him by his Discord: sword1234#6398
 */

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends JFrame{

    private JTextField userText;
    private JTextArea chatWindow;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private ServerSocket server;
    private Socket connection;

    public Server() {
        super("Instant messages");
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

    //set up and run the server
    public void startRunning(){
        try {
            server = new ServerSocket(6789, 100);
            while (true) {
                try {
                    waitForConnection();
                    setupStreams();
                    whileChatting();
                    return;
                }catch (IOException e){
                    showMessage("\n Server ended the connection!");
                }finally {
                    closeCrap();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    //wait for connection, then display connection information
    private void waitForConnection() throws IOException {
        showMessage(" Waiting for someone to connect");
        connection = server.accept();
        showMessage("\nConnected to " + connection.getInetAddress().getHostName());
    }
    private void setupStreams() throws IOException {
        output = new ObjectOutputStream(connection.getOutputStream());
        output.flush();
        input = new ObjectInputStream(connection.getInputStream());
        showMessage("\nStreams are setup!");
    }

    //during chat conversations
    public void whileChatting() throws IOException{
        String message = "You are now connected! ";
        sendMessage(message);
        ableToType(true);
        do{
            try{
                message = (String) input.readObject();
                showMessage("\n" + message);
            }catch (ClassNotFoundException e){
                showMessage("\n The message sent, was unable to identify");
            }
        }while (!message.equals("CLIENT - END"));
    }

    //close things.
    private void closeCrap(){
        showMessage("\n Close connections....\n");
        ableToType(false);
        try{
            output.close();
            input.close();
            connection.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void sendMessage(String message){
        try{
            output.writeObject("SERVER - " + message);
            output.flush();
            showMessage("\nSERVER - " + message);
        }catch (Exception e){
            chatWindow.append("\n Can't send the message");
        }
    }
    private void showMessage(String text){
        SwingUtilities.invokeLater(() -> {
            chatWindow.append(text);
        });
    }
    private void ableToType(final boolean tof){
        SwingUtilities.invokeLater(() -> {
            userText.setEditable(tof);
        });
    }
}