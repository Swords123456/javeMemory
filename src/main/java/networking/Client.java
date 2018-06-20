package networking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        //creates the socket
        Socket s = new Socket("127.0.0.1", 1025);
        Scanner sc1 = new Scanner(s.getInputStream());

        //Get the number from the user
        System.out.println("Enter any number");
        int number = sc.nextInt();

        //prints the number to the stream
        PrintStream stream = new PrintStream(s.getOutputStream());
        stream.println(number);

        //results
        int temp = sc1.nextInt();
        System.out.println(temp);
    }
}
