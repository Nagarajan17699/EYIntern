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
public class DeadLockDemo {
    
    public static void main(String[] args) {
        new DeadLockDemo();
    }
    DeadLockDemo()
    {
        A a = new A();
        B b = new B();
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(() ->{
            b.getDuster(a);
            
            
        });
        
        es.execute(() ->{
            a.cleanBoard(b);
            
            
        });
        
        es.shutdown();
    }
}


 class A
{
   
    synchronized public void giveDuster()
    {
        System.out.println("Give the duster back...");
    }
   synchronized public void cleanBoard(B b)
    {
        b.enterClass();
        System.out.println("Clean the board");
    }
}

class B
{
    synchronized public void getDuster(A a)
    {
        a.giveDuster();
        System.out.println("Get the duster back...");
    }
    
   synchronized public void enterClass()
    {
        System.out.println("Entering the class");
    }
}