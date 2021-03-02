/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day01;

import java.util.Scanner;

/**
 *
 * @author Nagarajan
 */
public class ArmstrongorPerfectorPalindrome_15b {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1. Armstrong \n 2.Perfect Number\n 3. Palindrome ");
                int num = s.nextInt();
        System.out.println("Enter the Number");
        int elem = s.nextInt();
        switch(num)
        {
            case 1:
                System.out.println((isArmstrong(elem)?"Armstrong Number":"Not an armstrong Number"));
                break;
            case 2:
               System.out.println((isPerfect(elem)? "Perfect Number":"Not a Perfect Number"));
                break;
            case 3:
                System.out.println((isPalindrome(elem)?"Palindrome ":"Not a Palindrome "));
                break;
        }
    }
        public static boolean isArmstrong(int elm)
        {
            int res=0;
            while(elm != 0)
            {
                res += Math.pow(elm%10,3);
                elm/=10;
                
            }
            
            return elm == res;
        }
        
        public static boolean isPerfect(int elm)
        {
            int sum=0;
            for(int i=1;i<elm;i++)
                if(elm%i == 0)
                    sum+=i;
            
            return sum == elm;
        }
        
        public static boolean isPalindrome(int elm)
        {
            int plm=0,temp = elm;
            while(temp != 0)
            {
                plm = (plm*10)+(temp%10);
                temp/=10;
            }
            return elm == plm;
        }
    }

