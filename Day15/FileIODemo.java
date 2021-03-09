/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class FileIODemo {
    public static void main(String[] args) {
        IODemo i  = new IODemo();
        i.readFunc();
    }
   
}

class IODemo
{
    FileInputStream fs = null;
    FileOutputStream fos = null;
    
    public void readFunc()
    {
        
        try
        {
           fs = new FileInputStream("d:/Netbeans Project/InternExercise/src/Day15/IODemo.properties");
           fos = new FileOutputStream("d:/Netbeans Project/InternExercise/src/Day15/Output.properties");
           byte b[] = new byte[8];
           byte ch;
           int noofCharsRead;
           while((noofCharsRead=fs.read(b)) != -1)
           {
               String s = new String(b,0,noofCharsRead);
               fos.write(b);
           }
            fs.close();fos.close();
        } catch (Exception ex) {
            Logger.getLogger(IODemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}