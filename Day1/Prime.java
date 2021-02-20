/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;
import java.util.Scanner;
/**
 *
 * @author Nagarajan
 */
public class Prime {
    
    public static void main(String[] args) {
         int num = new Scanner(System.in).nextInt();
         PrimeorNot p = new PrimeorNot();
         System.out.println((p.isPrime(num)?"The Number is Prime" : "The Number is Not a Prime"));
    }
   
    
    
}
class PrimeorNot
{
    public boolean isPrime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i == 0)
                return false;
        }
        
        return true;
    }
}