/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Nagarajan
 */
public class TwoThreadsOneObjectDemo {

    public static void main(String[] args) {
        new TwoThreadsOneObjectDemo();
    }
    TwoThreadsOneObjectDemo() {
        Work w = new Work();
        ExecutorService es = Executors.newFixedThreadPool(2);
        
        es.execute(() -> {
            Thread.currentThread().setName("Thread 1");
            synchronized (w) {
                w.takeLeave(10);
                w.remLeave(10);
                    
            }
        });
        es.execute(() -> {
            Thread.currentThread().setName("Thread 2");
            synchronized (w) {
                w.takeLeave(12);
                w.remLeave(12);
                    
            }
        });  
        
    }
}

class Work {

    public void takeLeave(int num) {
        Thread t = Thread.currentThread();
        System.out.println("Taking leave from " + num + " days from thread "+t.getName());
    }

    public void remLeave(int num) {
        System.out.println("Leave remaining is: " + --num);
    }
}
