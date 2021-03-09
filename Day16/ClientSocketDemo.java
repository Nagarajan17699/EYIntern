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
import java.net.Socket;

/**
 *
 * @author Nagarajan
 */
public class ClientSocketDemo {

    ClientSocketDemo() throws Exception {
        try {
            Socket s = new Socket("localhost", 4000);
            System.out.println("Client Ready...");
            BufferedReader in, ins;
            PrintWriter outs, out;

            while (true) {
                ins = new BufferedReader(new InputStreamReader(s.getInputStream()));
                in = new BufferedReader(new InputStreamReader(System.in));
                outs = new PrintWriter(s.getOutputStream(), true);
                System.out.println("Server: " + ins.readLine());
//                System.out.println("Enter the Text");

                String str = in.readLine();
                if (str.equalsIgnoreCase("exit")) {
                    s.close();
                }
                outs.println(str);
            }
        } catch (Exception e) {
        }

    }

    public static void main(String[] args) {

        try {
            new ClientSocketDemo();
        } catch (Exception e) {
        }
    }

}
