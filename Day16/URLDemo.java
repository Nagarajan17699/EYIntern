/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day16;

import java.net.InetAddress;
import java.net.URL;

/**
 *
 * @author Nagarajan
 */
public class URLDemo {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.instagram.com/index/html");
        InetAddress inet[] = InetAddress.getAllByName("www.instagram.com");
        for (InetAddress x : inet) {
            System.out.println(x.getHostAddress());
        }
    }
}
