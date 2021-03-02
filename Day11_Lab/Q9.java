/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Q9 {
    public static void main(String[] args) {
        AverageOwn avg = new AverageOwn();
        avg.calculateAverage();
    }
}

class AverageOwn
{
    public void calculateAverage()
    {
        Scanner s = new Scanner(System.in);
        int sum = 0,num = 0,flag = 0;
        for(int i=0;i<10;i++)
        {
            
            try{
                System.out.println("Here");
                num = s.nextInt();
                if(i==5)
                    throw new MyOwnAverageException("Own Exception Checking...");
            }catch(MyOwnAverageException E){
                System.out.println(E);
                s.nextLine();
            }
            
            if(flag == 0)
                sum+=num;
            else
                flag=0;
        }
        
        System.out.println("Average is "+(float)sum/10);
    }

}

class MyOwnAverageException extends Exception
{
    String msg;
    
    MyOwnAverageException(String str)
    {
        this.msg = str;
    }
    
    public String toString()
    {
        return "Exception: "+msg;
    }
}