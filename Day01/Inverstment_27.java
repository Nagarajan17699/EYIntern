/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

/**
 *
 * @author Nagarajan
 */
public class Inverstment_27 {
    
    public static void main(String[] args) {
        
        int amount = 14000;
        
        amount += (((double)40.0/100) * 14000);
        System.out.println("Amount after First Year is :"+amount);
        amount -= 1500;
        System.out.println("Amount after Second Year is :"+amount);
        amount += ((double)12.0/100 * 14000);
        System.out.println("Amount after Third Year is :"+amount);
        
        
    }
}
