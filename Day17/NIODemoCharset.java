/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/**
 *
 * @author Nagarajan
 */
public class NIODemoCharset {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FilePath.path+"readfile.properties"),Charset.forName("UTF-8")));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FilePath.path+"writefile.properties"), Charset.forName("UTF-8")));
        
        char c[] = new char[8];
        int a=0;
        while((a = br.read(c)) != -1)
        {
            bw.write(c,0,a);
        }
        bw.close();
        br.close();
    }
}
