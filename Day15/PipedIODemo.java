/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day15;

/**
 *
 * @author Nagarajan
 */
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PipedIODemo {

    public static void main(String[] args) throws Exception {

        PipedReader pr = new PipedReader();
        PipedWriter pw = new PipedWriter(pr);

        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(() -> {
            int c = 0;
            try {
                while ((c = pr.read()) != -1) {
                    System.out.print((char)c);
                }
            } catch (Exception e) {}
            System.out.println();
            
        });
        
        es.execute(() -> {
            while(true){
                try {
                    pw.write("Good Morning... Welcome to the program...".toCharArray());
                    System.out.println("");
                } catch (IOException ex) {
                    System.out.println("IOException" );
                   
                }
                
            }
        });
        es.shutdown();

    }
}
