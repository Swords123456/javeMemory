package networking;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1025);
        Socket socket = s.accept();

        Scanner sc = new Scanner(socket.getInputStream());

        int number = sc.nextInt();

        int temp = number*2;

        PrintStream p = new PrintStream(socket.getOutputStream());

        p.println(temp);

        System.out.println(number);
    }
}
