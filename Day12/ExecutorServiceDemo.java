/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Nagarajan
 */
public class ExecutorServiceDemo {
    
    ExecutorServiceDemo() throws InterruptedException{
    
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(() -> {System.out.println("Child Thread...");});
        
        es.shutdown();
       
    }
    public static void main(String[] args) throws InterruptedException {
        
        new ExecutorServiceDemo();
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
