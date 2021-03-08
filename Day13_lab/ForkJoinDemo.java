/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day13_lab;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author Nagarajan
 */
public class ForkJoinDemo {
    public static void main(String[] args) {
        
        ForkJoinPool fjpool = ForkJoinPool.commonPool();
       AddNumbers t1 = new AddNumbers(1,100);
       AddNumbers t2 = new AddNumbers(101,200);
       AddNumbers t3 = new AddNumbers(201,300);
       AddNumbers t4 = new AddNumbers(301,400);
       AddNumbers t5 = new AddNumbers(401,500);
       
       int result = t1.compute()+t2.compute()+t3.compute()+t4.compute()+t5.compute();
        System.out.println("Result is: "+result);
       
    }
    
}

class AddNumbers extends RecursiveTask<Integer>
{

    private int num1,num2,sum=0;
    AddNumbers(int num1, int num2)
    {
        this.num1 = num1;
        this.num2=num2;
    }
    @Override
    protected Integer compute() {
        
        for(int i=num1;i<=num2;i++)
            sum+=i;
        return sum;
    }
    
}