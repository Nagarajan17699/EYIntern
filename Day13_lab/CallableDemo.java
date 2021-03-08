/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Nagarajan
 */
public class CallableDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService es = Executors.newFixedThreadPool(1);
        Future fs = es.submit(() -> {

//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                System.out.println(e);
//            }
            
            return "This is a callable thread...";
        });
        
        System.out.println(fs.get());
        es.shutdown();
    }
}
