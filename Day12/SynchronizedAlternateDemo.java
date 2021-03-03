/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nagarajan
 */
public class SynchronizedAlternateDemo {
    
    public static void main(String[] args) {
        new SynchronizedAlternateDemo();
    }
    SynchronizedAlternateDemo(){
        
        ExecutorService es = Executors.newFixedThreadPool(2);
        KFC kfc = new KFC();
        es.execute(() -> {
            
            for(int i=0;i<10;i++)
            {
               kfc.createBurger();
            }
        });
        
        es.execute(() -> {
            
            for(int i=0;i<10;i++)
            {
               kfc.eatBurger();
            }
        });
        
        es.shutdown();
    }
    
}

class KFC
{
    boolean flag;
   synchronized public void createBurger()
    {
        if(flag)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Creating Burger ...");
        flag = !flag;
        notify();
    }
    
   synchronized public void eatBurger()
    {
        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Eating Burger ...");
        flag = !flag;
        notify();
    }
}