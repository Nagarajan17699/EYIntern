/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day11_Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class Q8 {
    public static void main(String[] args) {
        Average avg = new Average();
        avg.calculateAverage();
    }
}

class Average
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
            }catch(Exception E){
                System.out.println("Enter the correct number");
                i--;
                s.nextLine();
                flag = 1;
            }
            
            if(flag == 0)
                sum+=num;
            else
                flag=0;
        }
        
        System.out.println("Average is "+(float)sum/10);
    }
}