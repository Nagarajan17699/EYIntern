/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;

/**
 *
 * @author Nagarajan
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream("HelloWorld".getBytes());
        StringBufferInputStream sbis = new StringBufferInputStream("Hey How Are You...");
        StringReader str = new StringReader("Hello Hai");

        SequenceInputStream sis = new SequenceInputStream(bis, sbis);

        int num;
        while ((num = sis.read()) != -1) {
               System.out.print((char)num);
               
        }
    }

}
