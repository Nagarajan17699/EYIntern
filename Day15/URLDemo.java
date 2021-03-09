/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
/**
 *
 * @author Nagarajan
 */
public class URLDemo {
    
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("http://www.google.com/index.html");
        
        URLConnection con =  url.openConnection();
        BufferedReader be = new BufferedReader(new InputStreamReader(con.getInputStream()));
        FileOutputStream fs = new FileOutputStream(FilePath.path+"google.html");
        
        int c=0;
        while((c = be.read()) != -1)
        {
            System.out.print((char)c);
            fs.write((char)c);
        }
    }
}
