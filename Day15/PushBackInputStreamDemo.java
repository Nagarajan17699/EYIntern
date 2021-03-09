/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 *
 * @author Nagarajan
 */
public class PushBackInputStreamDemo {
    
    public static void main(String[] args) throws IOException {
        
        String s = "Hello This is new world";
        PushbackInputStream pbs = new PushbackInputStream(new ByteArrayInputStream(s.getBytes()));
        int c = 0;
        while( (c = pbs.read()) != -1)
        {
            if((char)c == 'h')
                pbs.unread('H'); //It outputs 'H' inplace of 'h' and does not change the source...
            else
                System.out.print((char)c);
        }
    }
}
