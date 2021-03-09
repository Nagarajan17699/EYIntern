/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class SocketServerDemo {

    SocketServerDemo() {
        Socket s;
        try {
            ServerSocket ss = new ServerSocket(4000);
            s = ss.accept();
            System.out.println("Server Connected...");
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Message...");
            out.write("Welcome to server club ... ");

            while (true) {
                String msg = in.readLine();
                if (msg.equalsIgnoreCase("exit")) {
                    s.close();
                }
                out.println(msg);
                BufferedReader ins = new BufferedReader(new InputStreamReader(s.getInputStream()));

                System.out.println("Client: " + ins.readLine());
            }

        } catch (IOException ex) {
            Logger.getLogger(SocketServerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        new SocketServerDemo();
    }

}
